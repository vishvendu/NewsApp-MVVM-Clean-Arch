package com.vishvendu.cleanarch.newsapp.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import com.vishvendu.cleanarch.newsapp.data.repository.*
import com.vishvendu.cleanarch.newsapp.di.ActivityContext
import com.vishvendu.cleanarch.newsapp.ui.adapter.*
import com.vishvendu.cleanarch.newsapp.ui.base.ViewModelProviderFactory
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.*
import com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider
import com.vishvendu.cleanarch.newsapp.utils.DispatcherProvider
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class FragmentModule(private val fragment: Fragment) {

    @ActivityContext
    @Provides
    fun provideContext(): Context = fragment.requireContext()

    @Provides
    fun provideDummiesAdapter() = TopHeadlinesAdapter(ArrayList())

    @Provides
    fun provideNewsSourceAdapter() = NewsSourceAdapter(fragment.requireContext(),ArrayList())

    @Provides
    fun provideCountryListAdapter() = CountryListAdapter(fragment.requireContext(),ArrayList())

    @Provides
    fun provideNewsForCountryAdapter() = NewsForCountryAdapter(ArrayList())

    @Provides
    fun provideLanguageListAdapter() = LanguageListAdapter(fragment.requireContext(),ArrayList())

    @Provides
    fun provideNewsInLanguageAdapter() = NewsInLanguageAdapter(ArrayList())

    @Provides
    fun provideSearchNewsAdapter() = SearchNewsAdapter(ArrayList())


    @Provides
    fun provideNewsListViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlinesViewModel {
        return ViewModelProvider(fragment,
            ViewModelProviderFactory(TopHeadlinesViewModel::class) {
                TopHeadlinesViewModel(topHeadlineRepository)
            })[TopHeadlinesViewModel::class.java]
    }

    @Provides
    fun provideNewsSourceViewModel(newsSourcesRepository: NewsSourcesRepository,dispatcherProvider: DefaultDispatcherProvider): NewsSourcesViewModel {
        return ViewModelProvider(fragment,
            ViewModelProviderFactory(NewsSourcesViewModel::class) {
                NewsSourcesViewModel(newsSourcesRepository,dispatcherProvider)
            })[NewsSourcesViewModel::class.java]
    }

    @Provides
    fun provideCountryListViewModel(countryListRepository: CountryListRepository, dispatcherProvider: DefaultDispatcherProvider): CountryListViewModel {
        return ViewModelProvider(fragment,
            ViewModelProviderFactory(CountryListViewModel::class) {
                CountryListViewModel(countryListRepository,dispatcherProvider)
            })[CountryListViewModel::class.java]
    }

    @Provides
    fun provideLanguageListViewModel(languageListRepository: LanguageListRepository, dispatcherProvider: DefaultDispatcherProvider): LanguageListViewModel {
        return ViewModelProvider(fragment,
            ViewModelProviderFactory(LanguageListViewModel::class) {
                LanguageListViewModel(languageListRepository,dispatcherProvider)
            })[LanguageListViewModel::class.java]
    }

    @Provides
    fun provideNewsForCountryViewModel(newsForCountryRepository: NewsForCountryRepository, dispatcherProvider: DefaultDispatcherProvider): NewsForCountryViewModel {
        return ViewModelProvider(fragment,
            ViewModelProviderFactory(NewsForCountryViewModel::class) {
                NewsForCountryViewModel(newsForCountryRepository,dispatcherProvider)
            })[NewsForCountryViewModel::class.java]
    }

    @Provides
    fun provideNewsInLanguageViewModel(newsInLanguageRepository: NewsInLanguageRepository,dispatcherProvider: DefaultDispatcherProvider): NewsInLanguageViewModel {
        return ViewModelProvider(fragment,
            ViewModelProviderFactory(NewsInLanguageViewModel::class) {
                NewsInLanguageViewModel(newsInLanguageRepository,dispatcherProvider)
            })[NewsInLanguageViewModel::class.java]
    }

    @Provides
    fun provideSearchNewsViewModel(searchNewsRepository: SearchNewsRepository): SearchNewsViewModel {
        return ViewModelProvider(fragment,
            ViewModelProviderFactory(SearchNewsViewModel::class) {
                SearchNewsViewModel(searchNewsRepository)
            })[SearchNewsViewModel::class.java]
    }

}