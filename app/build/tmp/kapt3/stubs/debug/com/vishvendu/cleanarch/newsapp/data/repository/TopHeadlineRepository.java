package com.vishvendu.cleanarch.newsapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/data/repository/TopHeadlineRepository;", "", "networkService", "Lcom/vishvendu/cleanarch/newsapp/data/api/NetworkService;", "db", "Lcom/vishvendu/cleanarch/newsapp/data/local/db/NewsDataBase;", "networkManager", "Lcom/vishvendu/cleanarch/newsapp/utils/NetworkManager;", "(Lcom/vishvendu/cleanarch/newsapp/data/api/NetworkService;Lcom/vishvendu/cleanarch/newsapp/data/local/db/NewsDataBase;Lcom/vishvendu/cleanarch/newsapp/utils/NetworkManager;)V", "dao", "Lcom/vishvendu/cleanarch/newsapp/data/local/db/dao/TopHeadlineDAO;", "getTopHeadlines", "Lkotlinx/coroutines/flow/Flow;", "Lcom/vishvendu/cleanarch/newsapp/utils/Resource;", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/topheadlines/TopHeadlineArticle;", "country", "", "updateHeadlineInDB", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class TopHeadlineRepository {
    private final com.vishvendu.cleanarch.newsapp.data.api.NetworkService networkService = null;
    private final com.vishvendu.cleanarch.newsapp.data.local.db.NewsDataBase db = null;
    private final com.vishvendu.cleanarch.newsapp.utils.NetworkManager networkManager = null;
    private final com.vishvendu.cleanarch.newsapp.data.local.db.dao.TopHeadlineDAO dao = null;
    
    @javax.inject.Inject()
    public TopHeadlineRepository(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.api.NetworkService networkService, @org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.local.db.NewsDataBase db, @org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.utils.NetworkManager networkManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle>>> getTopHeadlines(@org.jetbrains.annotations.NotNull()
    java.lang.String country) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateHeadlineInDB(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vishvendu.cleanarch.newsapp.utils.Resource<? extends java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle>>> continuation) {
        return null;
    }
}