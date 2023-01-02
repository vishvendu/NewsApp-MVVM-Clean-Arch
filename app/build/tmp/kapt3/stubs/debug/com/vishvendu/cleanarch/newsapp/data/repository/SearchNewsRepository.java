package com.vishvendu.cleanarch.newsapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/data/repository/SearchNewsRepository;", "", "networkService", "Lcom/vishvendu/cleanarch/newsapp/data/api/NetworkService;", "(Lcom/vishvendu/cleanarch/newsapp/data/api/NetworkService;)V", "getNewsSources", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/searchnews/Article;", "query", "", "app_debug"})
public final class SearchNewsRepository {
    private final com.vishvendu.cleanarch.newsapp.data.api.NetworkService networkService = null;
    
    @javax.inject.Inject()
    public SearchNewsRepository(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.api.NetworkService networkService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.searchnews.Article>> getNewsSources(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}