package com.vishvendu.cleanarch.newsapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/di/module/ActivityModule;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "provideContext", "Landroid/content/Context;", "provideNewsInLanguageViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsInLanguageViewModel;", "newsInLanguageRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsInLanguageRepository;", "dispatcherProvider", "Lcom/vishvendu/cleanarch/newsapp/utils/DefaultDispatcherProvider;", "provideNewsSourceDetailsAdapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsSourceDetailsAdapter;", "provideNewsSourceDetailsViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsSourceDetailsViewModel;", "newsSourceDetailsRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsSourceDetailsRepository;", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
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
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceDetailsAdapter provideNewsSourceDetailsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsSourceDetailsViewModel provideNewsSourceDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.NewsSourceDetailsRepository newsSourceDetailsRepository, @org.jetbrains.annotations.NotNull()
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
}