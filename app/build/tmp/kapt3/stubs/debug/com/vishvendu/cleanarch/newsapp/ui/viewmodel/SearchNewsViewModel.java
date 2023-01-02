package com.vishvendu.cleanarch.newsapp.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/SearchNewsViewModel;", "Landroidx/lifecycle/ViewModel;", "searchNewsRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/SearchNewsRepository;", "(Lcom/vishvendu/cleanarch/newsapp/data/repository/SearchNewsRepository;)V", "_searchNewsList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/vishvendu/cleanarch/newsapp/utils/Resource;", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/searchnews/Article;", "searchNewsList", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchNewsList", "()Lkotlinx/coroutines/flow/StateFlow;", "failure", "", "e", "", "searchNews", "Lkotlinx/coroutines/flow/Flow;", "query", "", "success", "list", "app_debug"})
public final class SearchNewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.vishvendu.cleanarch.newsapp.data.repository.SearchNewsRepository searchNewsRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.searchnews.Article>>> _searchNewsList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.searchnews.Article>>> searchNewsList = null;
    
    public SearchNewsViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.SearchNewsRepository searchNewsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.searchnews.Article>>> getSearchNewsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.searchnews.Article>> searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public final void success(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vishvendu.cleanarch.newsapp.data.model.searchnews.Article> list) {
    }
    
    public final void failure(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
}