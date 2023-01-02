package com.vishvendu.cleanarch.newsapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007J\b\u0010\'\u001a\u00020(H\u0007J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010-\u001a\u00020.H\u0007J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/di/module/FragmentModule;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "provideContext", "Landroid/content/Context;", "provideCountryListAdapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/CountryListAdapter;", "provideCountryListViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/CountryListViewModel;", "countryListRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/CountryListRepository;", "dispatcherProvider", "Lcom/vishvendu/cleanarch/newsapp/utils/DefaultDispatcherProvider;", "provideDummiesAdapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/TopHeadlinesAdapter;", "provideLanguageListAdapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/LanguageListAdapter;", "provideLanguageListViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/LanguageListViewModel;", "languageListRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/LanguageListRepository;", "provideNewsForCountryAdapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsForCountryAdapter;", "provideNewsForCountryViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsForCountryViewModel;", "newsForCountryRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsForCountryRepository;", "provideNewsInLanguageAdapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsInLanguageAdapter;", "provideNewsInLanguageViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsInLanguageViewModel;", "newsInLanguageRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsInLanguageRepository;", "provideNewsListViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/TopHeadlinesViewModel;", "topHeadlineRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/TopHeadlineRepository;", "provideNewsSourceAdapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsSourceAdapter;", "provideNewsSourceViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsSourcesViewModel;", "newsSourcesRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsSourcesRepository;", "provideSearchNewsAdapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/SearchNewsAdapter;", "provideSearchNewsViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/SearchNewsViewModel;", "searchNewsRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/SearchNewsRepository;", "app_debug"})
@dagger.Module()
public final class FragmentModule {
    private final androidx.fragment.app.Fragment fragment = null;
    
    public FragmentModule(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.ActivityContext()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.TopHeadlinesAdapter provideDummiesAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceAdapter provideNewsSourceAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.CountryListAdapter provideCountryListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.NewsForCountryAdapter provideNewsForCountryAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.LanguageListAdapter provideLanguageListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.NewsInLanguageAdapter provideNewsInLanguageAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.SearchNewsAdapter provideSearchNewsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.TopHeadlinesViewModel provideNewsListViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.TopHeadlineRepository topHeadlineRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsSourcesViewModel provideNewsSourceViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.NewsSourcesRepository newsSourcesRepository, @org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider dispatcherProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.CountryListViewModel provideCountryListViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.CountryListRepository countryListRepository, @org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider dispatcherProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.LanguageListViewModel provideLanguageListViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.LanguageListRepository languageListRepository, @org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider dispatcherProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsForCountryViewModel provideNewsForCountryViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.NewsForCountryRepository newsForCountryRepository, @org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider dispatcherProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsInLanguageViewModel provideNewsInLanguageViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.NewsInLanguageRepository newsInLanguageRepository, @org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider dispatcherProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.SearchNewsViewModel provideSearchNewsViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.SearchNewsRepository searchNewsRepository) {
        return null;
    }
}