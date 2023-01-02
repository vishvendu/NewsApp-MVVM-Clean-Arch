package com.vishvendu.cleanarch.newsapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/data/repository/LanguageListRepository;", "", "jsonHelper", "Lcom/vishvendu/cleanarch/newsapp/data/local/JsonHelper;", "context", "Landroid/content/Context;", "(Lcom/vishvendu/cleanarch/newsapp/data/local/JsonHelper;Landroid/content/Context;)V", "getLanguageList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/languagelist/LanguageItem;", "app_debug"})
public final class LanguageListRepository {
    private final com.vishvendu.cleanarch.newsapp.data.local.JsonHelper jsonHelper = null;
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public LanguageListRepository(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.local.JsonHelper jsonHelper, @org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.languagelist.LanguageItem>> getLanguageList() {
        return null;
    }
}