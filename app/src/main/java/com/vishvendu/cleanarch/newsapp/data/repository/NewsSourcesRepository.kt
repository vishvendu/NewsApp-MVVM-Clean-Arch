package com.vishvendu.cleanarch.newsapp.data.repository

import com.vishvendu.cleanarch.newsapp.data.api.NetworkService
import com.vishvendu.cleanarch.newsapp.data.model.newssources.Source
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsSourcesRepository  @Inject constructor(private val networkService: NetworkService) {

    fun getNewsSources() : Flow<List<Source>>{
        return flow {
            emit(networkService.getNewsSources())
        }.map {
            it.sources
        }
    }
}