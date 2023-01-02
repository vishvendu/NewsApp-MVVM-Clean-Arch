package com.vishvendu.cleanarch.newsapp.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R?\u0010\n\u001a\'\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u000bj\b\u0012\u0004\u0012\u00020\u0007`\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/adapter/CountryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/CountryListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "countryList", "Ljava/util/ArrayList;", "Lcom/vishvendu/cleanarch/newsapp/data/model/countrylist/CountryListItem;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "itemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "", "Lcom/vishvendu/cleanarch/newsapp/utils/ItemClickListener;", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "addData", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class CountryListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vishvendu.cleanarch.newsapp.ui.adapter.CountryListAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem> countryList = null;
    public kotlin.jvm.functions.Function1<? super com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem, kotlin.Unit> itemClickListener;
    
    public CountryListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem> countryList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vishvendu.cleanarch.newsapp.ui.adapter.CountryListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.adapter.CountryListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem> list) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012+\u0010\u0004\u001a\'\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R3\u0010\u0004\u001a\'\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/adapter/CountryListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/vishvendu/cleanarch/newsapp/databinding/CountryListItemsBinding;", "itemClickListener", "Lkotlin/Function1;", "Lcom/vishvendu/cleanarch/newsapp/data/model/countrylist/CountryListItem;", "Lkotlin/ParameterName;", "name", "data", "", "Lcom/vishvendu/cleanarch/newsapp/utils/ItemClickListener;", "(Lcom/vishvendu/cleanarch/newsapp/databinding/CountryListItemsBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "source", "context", "Landroid/content/Context;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.vishvendu.cleanarch.newsapp.databinding.CountryListItemsBinding binding = null;
        private final kotlin.jvm.functions.Function1<com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem, kotlin.Unit> itemClickListener = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.vishvendu.cleanarch.newsapp.databinding.CountryListItemsBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem, kotlin.Unit> itemClickListener) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem source, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}