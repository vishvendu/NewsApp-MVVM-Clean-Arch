package com.vishvendu.cleanarch.newsapp.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsInLanguageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsInLanguageAdapter$DataViewHolder;", "article", "Ljava/util/ArrayList;", "Lcom/vishvendu/cleanarch/newsapp/data/model/newsinlanguage/Article;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "addData", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DataViewHolder", "app_debug"})
public final class NewsInLanguageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vishvendu.cleanarch.newsapp.ui.adapter.NewsInLanguageAdapter.DataViewHolder> {
    private final java.util.ArrayList<com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage.Article> article = null;
    
    public NewsInLanguageAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage.Article> article) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vishvendu.cleanarch.newsapp.ui.adapter.NewsInLanguageAdapter.DataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.adapter.NewsInLanguageAdapter.DataViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage.Article> list) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsInLanguageAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/vishvendu/cleanarch/newsapp/databinding/NewsInLanguageItemsBinding;", "(Lcom/vishvendu/cleanarch/newsapp/databinding/NewsInLanguageItemsBinding;)V", "bind", "", "source", "Lcom/vishvendu/cleanarch/newsapp/data/model/newsinlanguage/Article;", "app_debug"})
    public static final class DataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.vishvendu.cleanarch.newsapp.databinding.NewsInLanguageItemsBinding binding = null;
        
        public DataViewHolder(@org.jetbrains.annotations.NotNull()
        com.vishvendu.cleanarch.newsapp.databinding.NewsInLanguageItemsBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage.Article source) {
        }
    }
}