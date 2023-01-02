package com.vishvendu.cleanarch.newsapp.ui.viewmodel

import app.cash.turbine.test
import com.vishvendu.cleanarch.newsapp.TestDispatcherProvider
import com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage.Article
import com.vishvendu.cleanarch.newsapp.data.repository.NewsInLanguageRepository
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
import org.mockito.Mockito.doReturn
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner


@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class NewsInLanguageViewModelTest{

    @Mock
    private lateinit var newsInLanguageRepository : NewsInLanguageRepository

    private lateinit var dispatcherProvider: DispatcherProvider

    @Before
    fun setUp(){
        dispatcherProvider = TestDispatcherProvider()
    }

    @Test
    fun givenServerResponse200_whenFetch_shouldReturnSuccess(){
        runTest {
            val map = HashMap<Int,String>()
            map[0] = "ar"
            doReturn(flowOf(emptyList<Article>())).`when`(newsInLanguageRepository).getNewsInLanguage("ar")
            val viewModel = NewsInLanguageViewModel(newsInLanguageRepository,dispatcherProvider)
            viewModel.fetchNewsInTheLanguage(map)
            viewModel.newsList.test {
                assertEquals(Resource.success(emptyList<Article>()),awaitItem())
                cancelAndIgnoreRemainingEvents()
            }
            verify(newsInLanguageRepository).getNewsInLanguage("ar")
        }
    }

}