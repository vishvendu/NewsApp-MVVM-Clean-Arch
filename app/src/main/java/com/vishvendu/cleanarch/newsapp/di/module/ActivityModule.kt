package com.vishvendu.cleanarch.newsapp.di.module

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.vishvendu.cleanarch.newsapp.data.repository.NewsForCountryRepository
import com.vishvendu.cleanarch.newsapp.data.repository.NewsInLanguageRepository
import com.vishvendu.cleanarch.newsapp.data.repository.NewsSourceDetailsRepository
import com.vishvendu.cleanarch.newsapp.di.ActivityContext
import com.vishvendu.cleanarch.newsapp.di.ApplicationContext
import com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceDetailsAdapter
import com.vishvendu.cleanarch.newsapp.ui.base.ViewModelProviderFactory
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsForCountryViewModel
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsInLanguageViewModel
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsSourceDetailsViewModel
import com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @ActivityContext
    @Provides
    fun provideContext() : Context {
        return activity
    }

    @Provides
    fun provideNewsSourceDetailsAdapter() = NewsSourceDetailsAdapter(ArrayList())


    @Provides
    fun provideNewsSourceDetailsViewModel(newsSourceDetailsRepository: NewsSourceDetailsRepository, dispatcherProvider: DefaultDispatcherProvider): NewsSourceDetailsViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(NewsSourceDetailsViewModel::class) {
                NewsSourceDetailsViewModel(newsSourceDetailsRepository,dispatcherProvider)
            })[NewsSourceDetailsViewModel::class.java]
    }

    @Provides
    fun provideNewsInLanguageViewModel(newsInLanguageRepository: NewsInLanguageRepository, dispatcherProvider: DefaultDispatcherProvider): NewsInLanguageViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(NewsInLanguageViewModel::class) {
                NewsInLanguageViewModel(newsInLanguageRepository,dispatcherProvider)
            })[NewsInLanguageViewModel::class.java]
    }

}