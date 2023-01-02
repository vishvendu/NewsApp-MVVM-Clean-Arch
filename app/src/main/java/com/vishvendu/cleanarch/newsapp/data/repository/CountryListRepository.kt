package com.vishvendu.cleanarch.newsapp.data.repository

import android.content.Context
import com.vishvendu.cleanarch.newsapp.data.api.NetworkService
import com.vishvendu.cleanarch.newsapp.data.local.JsonHelper
import com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryList
import com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem
import com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle
import com.vishvendu.cleanarch.newsapp.di.ApplicationContext
import com.vishvendu.cleanarch.newsapp.utils.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

// avoid writing android classes in the repo
class CountryListRepository @Inject constructor(private val jsonHelper: JsonHelper) {

    fun getCountryList(): User {
        return flow {
            emit(jsonHelper.getCountries())
        }.map {
            it
        }
    }
}

