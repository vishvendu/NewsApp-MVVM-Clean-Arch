package com.vishvendu.cleanarch.newsapp.ui.viewmodel

import app.cash.turbine.test
import com.vishvendu.cleanarch.newsapp.TestDispatcherProvider
import com.vishvendu.cleanarch.newsapp.data.model.newssources.Source
import com.vishvendu.cleanarch.newsapp.data.repository.NewsSourcesRepository
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
class NewsSourcesViewModelTest {

    @Mock
    private lateinit var newsSourcesRepository : NewsSourcesRepository

    private lateinit var dispatcherProvider: DispatcherProvider

    @Before
    fun setUp() {
        dispatcherProvider = TestDispatcherProvider()
    }

    @Test
    fun givenServerResponse200_whenFetch_shouldReturnSuccess(){
         runTest {
             doReturn(flowOf(emptyList<Source>())).`when`(newsSourcesRepository).getNewsSources()
             val viewModel = NewsSourcesViewModel(newsSourcesRepository,dispatcherProvider)
             viewModel.sourceList.test {
                 assertEquals(Resource.success(emptyList<List<Source>>()), awaitItem())
                 cancelAndIgnoreRemainingEvents()
             }
             verify(newsSourcesRepository).getNewsSources()
         }
    }

    @Test
    fun givenServerResponseError_whenFetch_shouldReturnError(){
        runTest {
            val errorMessage = "Error fetching new source"
            doReturn(flow<List<Source>> { throw IllegalStateException(errorMessage) }).`when`(newsSourcesRepository).getNewsSources()
            val viewModel = NewsSourcesViewModel(newsSourcesRepository,dispatcherProvider)
            viewModel.sourceList.test {
                assertEquals(Resource.error<List<Source>>(IllegalStateException(errorMessage).toString()), awaitItem())
                cancelAndIgnoreRemainingEvents()
            }
            verify(newsSourcesRepository).getNewsSources()
        }
    }


}