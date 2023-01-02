package com.vishvendu.cleanarch.newsapp.ui.viewmodel

import app.cash.turbine.test
import com.vishvendu.cleanarch.newsapp.TestDispatcherProvider
import com.vishvendu.cleanarch.newsapp.data.model.newsforcountry.Article
import com.vishvendu.cleanarch.newsapp.data.repository.NewsForCountryRepository
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
import org.mockito.Mockito.doReturn
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner


@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class NewsForCountryViewModelTest {

    @Mock
    private lateinit var newsForCountryRepository: NewsForCountryRepository

    private lateinit var dispatcherProvider: DispatcherProvider

    @Before
    fun setUp() {
        dispatcherProvider = TestDispatcherProvider()
    }

    @Test
    fun givenServerResponse200_whenFetch_shouldReturnSuccess() {
        runTest {
            doReturn(flowOf(emptyList<Article>())).`when`(newsForCountryRepository)
                .getNewsForCountry("AE")
            val viewModel = NewsForCountryViewModel(newsForCountryRepository, dispatcherProvider)
            viewModel.fetchNewsForTheCountry("AE")
            viewModel.newsList.test {
                assertEquals(Resource.success(emptyList<Article>()), awaitItem())
                cancelAndIgnoreRemainingEvents()
            }
            verify(newsForCountryRepository).getNewsForCountry("AE")
        }
    }

    @Test
    fun givenServerResponseError_whenFetch_shouldReturnError() {
        runTest {
            val errorMessage = "Error fetching country list"
            doReturn(flow<List<Article>> { throw IllegalStateException(errorMessage) })
                .`when`(newsForCountryRepository).getNewsForCountry("AE")
            val viewModel = NewsForCountryViewModel(newsForCountryRepository, dispatcherProvider)
            viewModel.fetchNewsForTheCountry("AE")
            viewModel.newsList.test {
                assertEquals(
                    Resource.error<List<Article>>(
                        IllegalStateException(
                            errorMessage
                        ).toString()
                    ), awaitItem()
                )
                cancelAndIgnoreRemainingEvents()
            }
            verify(newsForCountryRepository).getNewsForCountry("AE")
        }
    }
}
