package com.vishvendu.cleanarch.newsapp.ui.viewmodel

import app.cash.turbine.test
import com.vishvendu.cleanarch.newsapp.TestDispatcherProvider
import com.vishvendu.cleanarch.newsapp.data.model.searchnews.Article
import com.vishvendu.cleanarch.newsapp.data.repository.SearchNewsRepository
import com.vishvendu.cleanarch.newsapp.utils.DispatcherProvider
import com.vishvendu.cleanarch.newsapp.utils.Resource
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
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

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class SearchNewsViewModelTest {

    @Mock
    private lateinit var searchNewsRepository : SearchNewsRepository

    private lateinit var dispatcherProvider: DispatcherProvider

    @Before
    fun setUp() {
        dispatcherProvider = TestDispatcherProvider()
    }

    @Test
    fun givenServerResponse200_whenFetch_shouldReturnSuccess(){
        runTest {
            doReturn(flowOf(emptyList<Article>())).`when`(searchNewsRepository).getNewsSources("INDIA")
            val viewModel = SearchNewsViewModel(searchNewsRepository)
            viewModel.searchNews("INDIA")
            viewModel.searchNewsList.test {
                assertEquals(Resource.success(emptyList<List<Article>>()), awaitItem())
                cancelAndIgnoreRemainingEvents()
            }
            verify(searchNewsRepository).getNewsSources("INDIA")
        }
    }
}