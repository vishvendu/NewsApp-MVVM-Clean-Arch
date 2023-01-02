package com.vishvendu.cleanarch.newsapp.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/TopHeadlinesViewModel;", "Landroidx/lifecycle/ViewModel;", "topHeadlineRepository", "Lcom/vishvendu/cleanarch/newsapp/data/repository/TopHeadlineRepository;", "(Lcom/vishvendu/cleanarch/newsapp/data/repository/TopHeadlineRepository;)V", "_TopHeadline_ArticleList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/vishvendu/cleanarch/newsapp/utils/Resource;", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/topheadlines/TopHeadlineArticle;", "_TopHeadline_ArticleList_LiveData", "Landroidx/lifecycle/MutableLiveData;", "topHeadlineArticleList", "Lkotlinx/coroutines/flow/StateFlow;", "getTopHeadlineArticleList", "()Lkotlinx/coroutines/flow/StateFlow;", "topHeadlineArticleList_livedata", "Landroidx/lifecycle/LiveData;", "getTopHeadlineArticleList_livedata", "()Landroidx/lifecycle/LiveData;", "fetchNews", "", "fetchNewsWithCoroutine", "app_debug"})
public final class TopHeadlinesViewModel extends androidx.lifecycle.ViewModel {
    private final com.vishvendu.cleanarch.newsapp.data.repository.TopHeadlineRepository topHeadlineRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle>>> _TopHeadline_ArticleList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle>>> topHeadlineArticleList = null;
    private final androidx.lifecycle.MutableLiveData<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle>>> _TopHeadline_ArticleList_LiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle>>> topHeadlineArticleList_livedata = null;
    
    public TopHeadlinesViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.repository.TopHeadlineRepository topHeadlineRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle>>> getTopHeadlineArticleList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.vishvendu.cleanarch.newsapp.utils.Resource<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle>>> getTopHeadlineArticleList_livedata() {
        return null;
    }
    
    private final void fetchNews() {
    }
    
    private final void fetchNewsWithCoroutine() {
    }
}