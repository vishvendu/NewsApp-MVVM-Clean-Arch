package com.vishvendu.cleanarch.newsapp.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/data/api/NetworkService;", "", "getNewsForCountry", "Lcom/vishvendu/cleanarch/newsapp/data/model/newsforcountry/NewsForCountryResponse;", "country", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsInLanguage", "Lcom/vishvendu/cleanarch/newsapp/data/model/newsinlanguage/NewsInLanguageResponse;", "getNewsSources", "Lcom/vishvendu/cleanarch/newsapp/data/model/newssources/NewsSources;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsSourcesDetails", "Lcom/vishvendu/cleanarch/newsapp/data/model/newssourcedetails/NewsSourceDetailsReponse;", "source", "getSearchNews", "Lcom/vishvendu/cleanarch/newsapp/data/model/searchnews/SearchNewsResponse;", "search", "getTopHeadlines", "Lcom/vishvendu/cleanarch/newsapp/data/model/topheadlines/TopHeadlinesResponse;", "app_debug"})
@javax.inject.Singleton()
public abstract interface NetworkService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines")
    public abstract java.lang.Object getTopHeadlines(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "country")
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlinesResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines/sources")
    public abstract java.lang.Object getNewsSources(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vishvendu.cleanarch.newsapp.data.model.newssources.NewsSources> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines")
    public abstract java.lang.Object getNewsSourcesDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sources")
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vishvendu.cleanarch.newsapp.data.model.newssourcedetails.NewsSourceDetailsReponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines")
    public abstract java.lang.Object getNewsForCountry(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "country")
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vishvendu.cleanarch.newsapp.data.model.newsforcountry.NewsForCountryResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines")
    public abstract java.lang.Object getNewsInLanguage(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "language")
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage.NewsInLanguageResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "everything")
    public abstract java.lang.Object getSearchNews(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vishvendu.cleanarch.newsapp.data.model.searchnews.SearchNewsResponse> continuation);
}