package com.vishvendu.cleanarch.newsapp.data.repository

import com.vishvendu.cleanarch.newsapp.data.api.NetworkService
import com.vishvendu.cleanarch.newsapp.data.model.searchnews.Article
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class SearchNewsRepository @Inject constructor(private val networkService: NetworkService) {

    fun getNewsSources(query : String) : Flow<List<Article>> {
        return flow {
            emit(networkService.getSearchNews(query))
        }.map {
            it.articles
        }
    }
}