package com.vishvendu.cleanarch.newsapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/di/module/ApplicationModule;", "", "application", "Lcom/vishvendu/cleanarch/newsapp/MyNewsApplication;", "(Lcom/vishvendu/cleanarch/newsapp/MyNewsApplication;)V", "provideAPIKeyInterceptor", "Lcom/vishvendu/cleanarch/newsapp/data/api/APIKeyInterceptor;", "provideApiKey", "", "provideBaseURL", "provideContext", "Landroid/content/Context;", "provideCountryJsonHelper", "Lcom/vishvendu/cleanarch/newsapp/data/local/JsonHelper;", "provideDispatcher", "Lcom/vishvendu/cleanarch/newsapp/utils/DefaultDispatcherProvider;", "provideGson", "Lcom/google/gson/Gson;", "provideGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "provideNetworkManager", "Lcom/vishvendu/cleanarch/newsapp/utils/NetworkManager;", "provideNetworkService", "Lcom/vishvendu/cleanarch/newsapp/data/api/NetworkService;", "baseurl", "gsonConverterFactory", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideOkHttp", "provideRoomDataBase", "Lcom/vishvendu/cleanarch/newsapp/data/local/db/NewsDataBase;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final com.vishvendu.cleanarch.newsapp.MyNewsApplication application = null;
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.MyNewsApplication application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.ApplicationContext()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.data.api.NetworkService provideNetworkService(@org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.NetworkBASEURL()
    java.lang.String baseurl, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.data.local.JsonHelper provideCountryJsonHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttp(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.api.APIKeyInterceptor provideAPIKeyInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.data.api.APIKeyInterceptor provideAPIKeyInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.utils.NetworkManager provideNetworkManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.data.local.db.NewsDataBase provideRoomDataBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.NetworkApiKey()
    @dagger.Provides()
    public final java.lang.String provideApiKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.NetworkBASEURL()
    @dagger.Provides()
    public final java.lang.String provideBaseURL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider provideDispatcher() {
        return null;
    }
}