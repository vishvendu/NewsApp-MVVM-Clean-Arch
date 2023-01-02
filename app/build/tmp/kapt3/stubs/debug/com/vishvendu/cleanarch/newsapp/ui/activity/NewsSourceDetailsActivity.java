package com.vishvendu.cleanarch.newsapp.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0016\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/activity/NewsSourceDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsSourceDetailsAdapter;", "getAdapter", "()Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsSourceDetailsAdapter;", "setAdapter", "(Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsSourceDetailsAdapter;)V", "binding", "Lcom/vishvendu/cleanarch/newsapp/databinding/ActivityNewsSourceDetailsBinding;", "newsSourceDetailsViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsSourceDetailsViewModel;", "getNewsSourceDetailsViewModel", "()Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsSourceDetailsViewModel;", "setNewsSourceDetailsViewModel", "(Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/NewsSourceDetailsViewModel;)V", "getIntentExtra", "", "initObserver", "initView", "injectDependencies", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "renderList", "articleList", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/newssourcedetails/Article;", "Companion", "app_debug"})
public final class NewsSourceDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.vishvendu.cleanarch.newsapp.ui.activity.NewsSourceDetailsActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NEWS_ID = "news_id";
    private com.vishvendu.cleanarch.newsapp.databinding.ActivityNewsSourceDetailsBinding binding;
    @javax.inject.Inject()
    public com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsSourceDetailsViewModel newsSourceDetailsViewModel;
    @javax.inject.Inject()
    public com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceDetailsAdapter adapter;
    
    public NewsSourceDetailsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsSourceDetailsViewModel getNewsSourceDetailsViewModel() {
        return null;
    }
    
    public final void setNewsSourceDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.viewmodel.NewsSourceDetailsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceDetailsAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceDetailsAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getIntentExtra() {
    }
    
    private final void initObserver() {
    }
    
    private final void initView() {
    }
    
    private final void renderList(java.util.List<com.vishvendu.cleanarch.newsapp.data.model.newssourcedetails.Article> articleList) {
    }
    
    private final void injectDependencies() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/activity/NewsSourceDetailsActivity$Companion;", "", "()V", "EXTRA_NEWS_ID", "", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "newsID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getStartIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String newsID) {
            return null;
        }
    }
}