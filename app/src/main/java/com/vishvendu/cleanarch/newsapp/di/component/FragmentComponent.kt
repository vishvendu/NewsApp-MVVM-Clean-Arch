package com.vishvendu.cleanarch.newsapp.di.component

import com.vishvendu.cleanarch.newsapp.di.FragmentScope
import com.vishvendu.cleanarch.newsapp.di.module.FragmentModule
import com.vishvendu.cleanarch.newsapp.ui.fragment.*
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: CountryListFragment)
    fun inject(fragment: TopHeadlinesFragment)
    fun inject(fragment: NewsSourcesFragment)
    fun inject(fragment: NewsForCountryFragment)
    fun inject(fragment: LanguageListFragment)
    fun inject(fragment: NewsInLanguageFragment)
    fun inject(fragment: SearchNewsFragment)
}