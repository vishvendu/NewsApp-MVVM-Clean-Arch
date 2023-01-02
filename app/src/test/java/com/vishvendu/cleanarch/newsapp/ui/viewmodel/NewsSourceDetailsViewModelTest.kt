package com.vishvendu.cleanarch.newsapp.ui.viewmodel

import app.cash.turbine.test
import com.vishvendu.cleanarch.newsapp.TestDispatcherProvider
import com.vishvendu.cleanarch.newsapp.data.model.newssourcedetails.Article
import com.vishvendu.cleanarch.newsapp.data.repository.NewsSourceDetailsRepository
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
class NewsSourceDetailsViewModelTest {

    @Mock
    private lateinit var newsSourceDetailsRepository: NewsSourceDetailsRepository

    private lateinit var dispatcherProvider : DispatcherProvider

    @Before
    fun setUp(){
        dispatcherProvider = TestDispatcherProvider()
    }

    @Test
    fun givenServerResponse200_whenFetch_shouldReturnSuccess(){
       runTest {
           doReturn(flowOf(emptyList<Article>())).`when`(newsSourceDetailsRepository).getNewsSourcesDetails("Bloomberg")
           val viewModel = NewsSourceDetailsViewModel(newsSourceDetailsRepository,dispatcherProvider)
           viewModel.fetchNewsSourceDetails("Bloomberg")
           viewModel.articleList.test {
               assertEquals(Resource.success(emptyList<Article>()),awaitItem())
               cancelAndIgnoreRemainingEvents()
           }
           verify(newsSourceDetailsRepository).getNewsSourcesDetails("Bloomberg")
       }
    }

    @Test
    fun givenServerResponseError_whenFetch_shouldReturnError(){
        runTest {
            val errorMessage = "Error fetching new source details"
            doReturn(flow<List<Article>>{throw IllegalStateException(errorMessage) }).`when`(newsSourceDetailsRepository).getNewsSourcesDetails("Bloomberg")
            val viewModel = NewsSourceDetailsViewModel(newsSourceDetailsRepository,dispatcherProvider)
            viewModel.fetchNewsSourceDetails("Bloomberg")
            viewModel.articleList.test {
                assertEquals(Resource.error<List<Article>>(IllegalStateException(errorMessage).toString()),awaitItem())
                cancelAndIgnoreRemainingEvents()
            }
            verify(newsSourceDetailsRepository).getNewsSourcesDetails("Bloomberg")
        }
    }

}