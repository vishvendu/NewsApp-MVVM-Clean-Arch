package com.vishvendu.cleanarch.newsapp.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010#\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\b\u0010\'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/fragment/LanguageListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/vishvendu/cleanarch/newsapp/databinding/FragmentLanguageListBinding;", "adapter", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/LanguageListAdapter;", "getAdapter", "()Lcom/vishvendu/cleanarch/newsapp/ui/adapter/LanguageListAdapter;", "setAdapter", "(Lcom/vishvendu/cleanarch/newsapp/ui/adapter/LanguageListAdapter;)V", "binding", "getBinding", "()Lcom/vishvendu/cleanarch/newsapp/databinding/FragmentLanguageListBinding;", "languageListViewModel", "Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/LanguageListViewModel;", "getLanguageListViewModel", "()Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/LanguageListViewModel;", "setLanguageListViewModel", "(Lcom/vishvendu/cleanarch/newsapp/ui/viewmodel/LanguageListViewModel;)V", "languageSelectedMap", "Ljava/util/HashMap;", "", "", "injectDependencies", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "renderList", "articleList", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/languagelist/LanguageItem;", "setupObserver", "setupUI", "Companion", "app_debug"})
public final class LanguageListFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.vishvendu.cleanarch.newsapp.ui.fragment.LanguageListFragment.Companion Companion = null;
    private com.vishvendu.cleanarch.newsapp.databinding.FragmentLanguageListBinding _binding;
    @javax.inject.Inject()
    public com.vishvendu.cleanarch.newsapp.ui.adapter.LanguageListAdapter adapter;
    @javax.inject.Inject()
    public com.vishvendu.cleanarch.newsapp.ui.viewmodel.LanguageListViewModel languageListViewModel;
    private java.util.HashMap<java.lang.Integer, java.lang.String> languageSelectedMap;
    
    public LanguageListFragment() {
        super();
    }
    
    private final com.vishvendu.cleanarch.newsapp.databinding.FragmentLanguageListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vishvendu.cleanarch.newsapp.ui.adapter.LanguageListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.adapter.LanguageListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vishvendu.cleanarch.newsapp.ui.viewmodel.LanguageListViewModel getLanguageListViewModel() {
        return null;
    }
    
    public final void setLanguageListViewModel(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.viewmodel.LanguageListViewModel p0) {
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
    
    private final void setupObserver() {
    }
    
    private final void setupUI() {
    }
    
    private final void injectDependencies() {
    }
    
    private final void renderList(java.util.List<com.vishvendu.cleanarch.newsapp.data.model.languagelist.LanguageItem> articleList) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/fragment/LanguageListFragment$Companion;", "", "()V", "newInstance", "Lcom/vishvendu/cleanarch/newsapp/ui/fragment/LanguageListFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vishvendu.cleanarch.newsapp.ui.fragment.LanguageListFragment newInstance() {
            return null;
        }
    }
}