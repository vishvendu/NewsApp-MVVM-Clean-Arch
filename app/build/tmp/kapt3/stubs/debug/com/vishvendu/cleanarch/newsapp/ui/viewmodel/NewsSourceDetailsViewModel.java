package com.vishvendu.cleanarch.newsapp.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsSourceDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsSourceDetailsRepository;", "dispatcherProvider", "Lcom/vishvendu/cleanarch/newsapp/utils/DispatcherProvider;", "(Lcom/vishvendu/cleanarch/newsapp/data/repository/NewsSourceDetailsRepository;Lcom/vishvendu/cleanarch/newsapp/utils/DispatcherProvider;)V", "_articleList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/vishvendu/cleanarch/newsapp/utils/Resource;", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/newssourcedetails/Article;", "articleList", "Lkotlinx/coroutines/flow/StateFlow;", "getArticleList", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchNewsSourceDetails", "", "source", "", "app_debug"})
public final class NewsSourceDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.vishvendu.cleanarch.newsapp.data.repository.NewsSourceDetailsRepository repository = null;
    private final com.vishvendu.cleanarch.newsapp.utils.DispatcherProvider dispatcherProvider = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.newssourcedetails.Article>>> _articleList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.newssourcedetails.Article>>> articleList = null;
    
    public NewsSourceDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.NewsSourceDetailsRepository repository, @org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.utils.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.newssourcedetails.Article>>> getArticleList() {
        return null;
    }
    
    public final void fetchNewsSourceDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
    }
}