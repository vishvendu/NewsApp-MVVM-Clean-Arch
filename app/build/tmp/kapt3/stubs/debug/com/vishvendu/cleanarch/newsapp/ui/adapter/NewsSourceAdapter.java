package com.vishvendu.cleanarch.newsapp.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsSourceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsSourceAdapter$ViewHolder;", "context", "Landroid/content/Context;", "source", "Ljava/util/ArrayList;", "Lcom/vishvendu/cleanarch/newsapp/data/model/newssources/Source;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "addData", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class NewsSourceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.vishvendu.cleanarch.newsapp.data.model.newssources.Source> source = null;
    
    public NewsSourceAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.vishvendu.cleanarch.newsapp.data.model.newssources.Source> source) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.adapter.NewsSourceAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vishvendu.cleanarch.newsapp.data.model.newssources.Source> list) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/adapter/NewsSourceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/vishvendu/cleanarch/newsapp/databinding/NewsSourcesItemLayoutBinding;", "(Lcom/vishvendu/cleanarch/newsapp/databinding/NewsSourcesItemLayoutBinding;)V", "bind", "", "source", "Lcom/vishvendu/cleanarch/newsapp/data/model/newssources/Source;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.vishvendu.cleanarch.newsapp.databinding.NewsSourcesItemLayoutBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.vishvendu.cleanarch.newsapp.databinding.NewsSourcesItemLayoutBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.vishvendu.cleanarch.newsapp.data.model.newssources.Source source, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}