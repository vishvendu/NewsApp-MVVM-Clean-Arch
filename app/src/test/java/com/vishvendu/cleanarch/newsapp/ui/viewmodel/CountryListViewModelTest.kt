package com.vishvendu.cleanarch.newsapp.ui.viewmodel

import app.cash.turbine.test
import com.vishvendu.cleanarch.newsapp.TestDispatcherProvider
import com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem
import com.vishvendu.cleanarch.newsapp.data.model.newssourcedetails.Article
import com.vishvendu.cleanarch.newsapp.data.repository.CountryListRepository
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
import org.mockito.junit.MockitoJUnitRunner

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class CountryListViewModelTest {

    @Mock
    private lateinit var countryListRepository: CountryListRepository

    private lateinit var dispatcherProvider: DispatcherProvider

    @Before
    fun setUp() {
        dispatcherProvider = TestDispatcherProvider()
    }

    @Test
    fun givenServerResponse200_whenFetch_shouldReturnSuccess() {
        runTest {
            Mockito.doReturn(flowOf(emptyList<CountryListItem>())).`when`(countryListRepository)
                .getCountryList()
            val viewModel = CountryListViewModel(countryListRepository, dispatcherProvider)
            viewModel.countryList.test {
                assertEquals(Resource.success(emptyList<CountryListItem>()), awaitItem())
                cancelAndIgnoreRemainingEvents()
            }
            Mockito.verify(countryListRepository).getCountryList()
        }
    }

    @Test
    fun givenServerResponseError_whenFetch_shouldReturnError() {
        runTest {
            val errorMessage = "Error fetching country list"
            Mockito.doReturn(flow<List<CountryListItem>> { throw IllegalStateException(errorMessage) })
                .`when`(countryListRepository).getCountryList()
            val viewModel = CountryListViewModel(countryListRepository, dispatcherProvider)
            viewModel.countryList.test {
                assertEquals(
                    Resource.error<List<CountryListItem>>(
                        IllegalStateException(
                            errorMessage
                        ).toString()
                    ), awaitItem()
                )
                cancelAndIgnoreRemainingEvents()
            }
            Mockito.verify(countryListRepository).getCountryList()
        }
    }

}