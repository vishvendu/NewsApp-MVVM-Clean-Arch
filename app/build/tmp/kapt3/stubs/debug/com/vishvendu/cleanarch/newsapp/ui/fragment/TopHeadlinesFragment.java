package com.vishvendu.cleanarch.newsapp.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006&"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/fragment/TopHeadlinesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/vishvendu/cleanarch/newsapp/databinding/FragmentTopHeadlinesBinding;", "adapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/TopHeadlinesAdapter;", "getAdapter", "()Lcom/vishvendu/cleanarch/newsapp/ui/adapter/TopHeadlinesAdapter;", "setAdapter", "(Lcom/vishvendu/cleanarch/newsapp/ui/adapter/TopHeadlinesAdapter;)V", "binding", "getBinding", "()Lcom/vishvendu/cleanarch/newsapp/databinding/FragmentTopHeadlinesBinding;", "topHeadlinesViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/TopHeadlinesViewModel;", "getTopHeadlinesViewModel", "()Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/TopHeadlinesViewModel;", "setTopHeadlinesViewModel", "(Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/TopHeadlinesViewModel;)V", "injectDependencies", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "renderList", "topHeadlineArticleList", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/topheadlines/TopHeadlineArticle;", "setupObserver", "setupUI", "Companion", "app_debug"})
public final class TopHeadlinesFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.vishvendu.cleanarch.newsapp.ui.fragment.TopHeadlinesFragment.Companion Companion = null;
    private com.vishvendu.cleanarch.newsapp.databinding.FragmentTopHeadlinesBinding _binding;
    @javax.inject.Inject()
    public com.vishvendu.cleanarch.newsapp.ui.adapter.TopHeadlinesAdapter adapter;
    @javax.inject.Inject()
    public com.vishvendu.cleanarch.newsapp.ui.viewmodel.TopHeadlinesViewModel topHeadlinesViewModel;
    
    public TopHeadlinesFragment() {
        super();
    }
    
    private final com.vishvendu.cleanarch.newsapp.databinding.FragmentTopHeadlinesBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.TopHeadlinesAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.adapter.TopHeadlinesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.TopHeadlinesViewModel getTopHeadlinesViewModel() {
        return null;
    }
    
    public final void setTopHeadlinesViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.viewmodel.TopHeadlinesViewModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void injectDependencies() {
    }
    
    private final void setupObserver() {
    }
    
    private final void renderList(java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle> topHeadlineArticleList) {
    }
    
    private final void setupUI() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/fragment/TopHeadlinesFragment$Companion;", "", "()V", "newInstance", "Lcom/vishvendu/cleanarch/newsapp/ui/fragment/TopHeadlinesFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vishvendu.cleanarch.newsapp.ui.fragment.TopHeadlinesFragment newInstance() {
            return null;
        }
    }
}