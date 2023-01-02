package com.vishvendu.cleanarch.newsapp.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u0010\u001a\u00020\u00112\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015`\u0016R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsInLanguageViewModel;", "Landroidx/lifecycle/ViewModel;", "newsInLanguageRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsInLanguageRepository;", "dispatcherProvider", "Lcom/vishvendu/cleanarch/newsapp/utils/DispatcherProvider;", "(Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsInLanguageRepository;Lcom/vishvendu/cleanarch/newsapp/utils/DispatcherProvider;)V", "_newsList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/vishvendu/cleanarch/newsapp/utils/Resource;", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/newsinlanguage/Article;", "newsList", "Lkotlinx/coroutines/flow/StateFlow;", "getNewsList", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchNewsInTheLanguage", "", "country", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "app_debug"})
public final class NewsInLanguageViewModel extends androidx.lifecycle.ViewModel {
    private final com.vishvendu.cleanarch.newsapp.data.repository.NewsInLanguageRepository newsInLanguageRepository = null;
    private final com.vishvendu.cleanarch.newsapp.utils.DispatcherProvider dispatcherProvider = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage.Article>>> _newsList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage.Article>>> newsList = null;
    
    public NewsInLanguageViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.NewsInLanguageRepository newsInLanguageRepository, @org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.utils.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage.Article>>> getNewsList() {
        return null;
    }
    
    public final void fetchNewsInTheLanguage(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, java.lang.String> country) {
    }
}