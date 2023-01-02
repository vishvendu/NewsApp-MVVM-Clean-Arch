package com.vishvendu.cleanarch.newsapp.di.component;

import java.lang.System;

@com.vishvendu.cleanarch.newsapp.di.FragmentScope()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/di/component/FragmentComponent;", "", "inject", "", "fragment", "Lcom/vishvendu/cleanarch/newsapp/ui/fragment/CountryListFragment;", "Lcom/vishvendu/cleanarch/newsapp/ui/fragment/LanguageListFragment;", "Lcom/vishvendu/cleanarch/newsapp/ui/fragment/NewsForCountryFragment;", "Lcom/vishvendu/cleanarch/newsapp/ui/fragment/NewsInLanguageFragment;", "Lcom/vishvendu/cleanarch/newsapp/ui/fragment/NewsSourcesFragment;", "Lcom/vishvendu/cleanarch/newsapp/ui/fragment/SearchNewsFragment;", "Lcom/vishvendu/cleanarch/newsapp/ui/fragment/TopHeadlinesFragment;", "app_debug"})
@dagger.Component(dependencies = {com.vishvendu.cleanarch.newsapp.di.component.ApplicationComponent.class}, modules = {com.vishvendu.cleanarch.newsapp.di.module.FragmentModule.class})
public abstract interface FragmentComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.fragment.CountryListFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.fragment.TopHeadlinesFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.fragment.NewsSourcesFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.fragment.NewsForCountryFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.fragment.LanguageListFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.fragment.NewsInLanguageFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.fragment.SearchNewsFragment fragment);
}