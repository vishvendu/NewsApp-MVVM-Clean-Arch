package com.vishvendu.cleanarch.newsapp.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001eJ\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000Rg\u0010\f\u001aO\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0016`\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/adapter/LanguageListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vishvendu/cleanarch/newsapp/ui/adapter/LanguageListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "languageList", "Ljava/util/ArrayList;", "Lcom/vishvendu/cleanarch/newsapp/data/model/languagelist/LanguageItem;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "isEnabled", "", "itemClickListener", "Lkotlin/Function1;", "Ljava/util/HashMap;", "", "", "Lkotlin/ParameterName;", "name", "data", "", "Lcom/vishvendu/cleanarch/newsapp/utils/ItemClickListener;", "Lkotlin/collections/HashMap;", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "languageSelectedMap", "addData", "list", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class LanguageListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vishvendu.cleanarch.newsapp.ui.adapter.LanguageListAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private java.util.ArrayList<com.vishvendu.cleanarch.newsapp.data.model.languagelist.LanguageItem> languageList;
    public kotlin.jvm.functions.Function1<? super java.util.HashMap<java.lang.Integer, java.lang.String>, kotlin.Unit> itemClickListener;
    private final java.util.HashMap<java.lang.Integer, java.lang.String> languageSelectedMap = null;
    private boolean isEnabled = false;
    
    public LanguageListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.vishvendu.cleanarch.newsapp.data.model.languagelist.LanguageItem> languageList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.util.HashMap<java.lang.Integer, java.lang.String>, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.HashMap<java.lang.Integer, java.lang.String>, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vishvendu.cleanarch.newsapp.ui.adapter.LanguageListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.ui.adapter.LanguageListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vishvendu.cleanarch.newsapp.data.model.languagelist.LanguageItem> list) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u008e\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n\u0012S\u0010\u000b\u001aO\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fj$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n`\u0011\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bJD\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\b2\"\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R[\u0010\u000b\u001aO\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fj$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n`\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/ui/adapter/LanguageListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/vishvendu/cleanarch/newsapp/databinding/LanguageListItemsBinding;", "isEnabled", "", "languageSelectedMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "itemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "", "Lcom/vishvendu/cleanarch/newsapp/utils/ItemClickListener;", "(Lcom/vishvendu/cleanarch/newsapp/databinding/LanguageListItemsBinding;ZLjava/util/HashMap;Lkotlin/jvm/functions/Function1;)V", "bind", "source", "Lcom/vishvendu/cleanarch/newsapp/data/model/languagelist/LanguageItem;", "position", "selectItem", "hashMap", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.vishvendu.cleanarch.newsapp.databinding.LanguageListItemsBinding binding = null;
        private boolean isEnabled;
        private java.util.HashMap<java.lang.Integer, java.lang.String> languageSelectedMap;
        private kotlin.jvm.functions.Function1<? super java.util.HashMap<java.lang.Integer, java.lang.String>, kotlin.Unit> itemClickListener;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.vishvendu.cleanarch.newsapp.databinding.LanguageListItemsBinding binding, boolean isEnabled, @org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.Integer, java.lang.String> languageSelectedMap, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.HashMap<java.lang.Integer, java.lang.String>, kotlin.Unit> itemClickListener) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.vishvendu.cleanarch.newsapp.data.model.languagelist.LanguageItem source, int position) {
        }
        
        private final void selectItem(com.vishvendu.cleanarch.newsapp.databinding.LanguageListItemsBinding binding, com.vishvendu.cleanarch.newsapp.data.model.languagelist.LanguageItem source, int position, java.util.HashMap<java.lang.Integer, java.lang.String> hashMap) {
        }
    }
}