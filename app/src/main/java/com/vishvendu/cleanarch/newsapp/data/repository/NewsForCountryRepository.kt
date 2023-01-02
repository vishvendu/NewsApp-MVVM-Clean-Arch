package com.vishvendu.cleanarch.newsapp.data.repository

import com.vishvendu.cleanarch.newsapp.data.api.NetworkService
import com.vishvendu.cleanarch.newsapp.data.model.newsforcountry.Article
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class NewsForCountryRepository @Inject constructor(private val networkService : NetworkService) {

    fun getNewsForCountry(country: String) : Flow<List<Article>> {
        return flow {
            emit(networkService.getNewsForCountry(country))
        }.map {
            it.articles
        }
    }
}