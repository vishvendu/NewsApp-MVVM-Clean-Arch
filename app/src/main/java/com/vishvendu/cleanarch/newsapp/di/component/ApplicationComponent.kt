package com.vishvendu.cleanarch.newsapp.di.component

import android.content.Context
import androidx.room.RoomDatabase
import com.google.gson.Gson
import com.vishvendu.cleanarch.newsapp.MyNewsApplication
import com.vishvendu.cleanarch.newsapp.data.api.NetworkService
import com.vishvendu.cleanarch.newsapp.data.local.JsonHelper
import com.vishvendu.cleanarch.newsapp.data.local.db.NewsDataBase
import com.vishvendu.cleanarch.newsapp.data.repository.NewsSourcesRepository
import com.vishvendu.cleanarch.newsapp.data.repository.TopHeadlineRepository
import com.vishvendu.cleanarch.newsapp.di.ApplicationContext
import com.vishvendu.cleanarch.newsapp.di.NetworkApiKey
import com.vishvendu.cleanarch.newsapp.di.NetworkBASEURL
import com.vishvendu.cleanarch.newsapp.di.module.ApplicationModule
import com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider
import com.vishvendu.cleanarch.newsapp.utils.NetworkManager
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyNewsApplication)

    @ApplicationContext
    fun getContext(): Context

    @NetworkApiKey
    fun getNetworkAPIKey() : String

    @NetworkBASEURL
    fun getNetworkBASEURL() : String

    fun getNetworkService(): NetworkService

    fun getNetworkManager(): NetworkManager

    fun getCountryJsonHelper(): JsonHelper

    fun getGSON(): Gson

    fun getRoomDataBase() : NewsDataBase

    fun getTopHeadlineRepository(): TopHeadlineRepository

    fun getNewsSourcesRepository(): NewsSourcesRepository

    fun getDispatcherProvider(): DefaultDispatcherProvider
}