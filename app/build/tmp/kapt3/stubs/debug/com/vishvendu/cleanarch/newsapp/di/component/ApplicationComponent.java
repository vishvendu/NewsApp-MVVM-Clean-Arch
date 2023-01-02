package com.vishvendu.cleanarch.newsapp.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&\u00a8\u0006\u001b"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/di/component/ApplicationComponent;", "", "getContext", "Landroid/content/Context;", "getCountryJsonHelper", "Lcom/vishvendu/cleanarch/newsapp/data/local/JsonHelper;", "getDispatcherProvider", "Lcom/vishvendu/cleanarch/newsapp/utils/DefaultDispatcherProvider;", "getGSON", "Lcom/google/gson/Gson;", "getNetworkAPIKey", "", "getNetworkBASEURL", "getNetworkManager", "Lcom/vishvendu/cleanarch/newsapp/utils/NetworkManager;", "getNetworkService", "Lcom/vishvendu/cleanarch/newsapp/data/api/NetworkService;", "getNewsSourcesRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsSourcesRepository;", "getRoomDataBase", "Lcom/vishvendu/cleanarch/newsapp/data/local/db/NewsDataBase;", "getTopHeadlineRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/TopHeadlineRepository;", "inject", "", "application", "Lcom/vishvendu/cleanarch/newsapp/MyNewsApplication;", "app_debug"})
@dagger.Component(modules = {com.vishvendu.cleanarch.newsapp.di.module.ApplicationModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.MyNewsApplication application);
    
    @org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.ApplicationContext()
    public abstract android.content.Context getContext();
    
    @org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.NetworkApiKey()
    public abstract java.lang.String getNetworkAPIKey();
    
    @org.jetbrains.annotations.NotNull()
    @com.vishvendu.cleanarch.newsapp.di.NetworkBASEURL()
    public abstract java.lang.String getNetworkBASEURL();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vishvendu.cleanarch.newsapp.data.api.NetworkService getNetworkService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vishvendu.cleanarch.newsapp.utils.NetworkManager getNetworkManager();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vishvendu.cleanarch.newsapp.data.local.JsonHelper getCountryJsonHelper();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.gson.Gson getGSON();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vishvendu.cleanarch.newsapp.data.local.db.NewsDataBase getRoomDataBase();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vishvendu.cleanarch.newsapp.data.repository.TopHeadlineRepository getTopHeadlineRepository();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vishvendu.cleanarch.newsapp.data.repository.NewsSourcesRepository getNewsSourcesRepository();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vishvendu.cleanarch.newsapp.utils.DefaultDispatcherProvider getDispatcherProvider();
}