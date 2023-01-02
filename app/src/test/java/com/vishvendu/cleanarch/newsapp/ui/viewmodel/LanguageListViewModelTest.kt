package com.vishvendu.cleanarch.newsapp.ui.viewmodel

import app.cash.turbine.test
import com.vishvendu.cleanarch.newsapp.TestDispatcherProvider
import com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem
import com.vishvendu.cleanarch.newsapp.data.model.languagelist.LanguageItem
import com.vishvendu.cleanarch.newsapp.data.repository.LanguageListRepository
import com.vishvendu.cleanarch.newsapp.utils.DispatcherProvider
import com.vishvendu.cleanarch.newsapp.utils.Resource
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.doReturn
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner
import retrofit2.Response

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class LanguageListViewModelTest {

    @Mock
    private lateinit var languageListRepository: LanguageListRepository

    private lateinit var dispatcherProvider: DispatcherProvider

    @Before
    fun setUp() {
        dispatcherProvider = TestDispatcherProvider()
    }

    @Test
    fun givenServerResponse200_whenFetch_shouldReturnSuccess() {
        runTest {
            doReturn(flowOf(emptyList<LanguageItem>())).`when`(languageListRepository)
                .getLanguageList()
            val viewModel = LanguageListViewModel(languageListRepository, dispatcherProvider)
            viewModel.languageList.test {
                assertEquals(Resource.success(emptyList<LanguageItem>()), awaitItem())
                cancelAndIgnoreRemainingEvents()
            }
            verify(languageListRepository).getLanguageList()
        }
    }

    @Test
    fun givenServerResponseError_whenFetch_shouldReturnError() {
        runTest {
            val errorMessage = "Error fetching language list"
            doReturn(flow<List<LanguageItem>> { throw IllegalStateException(errorMessage) })
                .`when`(languageListRepository).getLanguageList()
            val viewModel = LanguageListViewModel(languageListRepository, dispatcherProvider)
            viewModel.languageList.test {
                assertEquals(
                    Resource.error<List<LanguageItem>>(
                        IllegalStateException(
                            errorMessage
                        ).toString()
                    ), awaitItem()
                )
                cancelAndIgnoreRemainingEvents()
            }
            verify(languageListRepository).getLanguageList()
        }
    }
}