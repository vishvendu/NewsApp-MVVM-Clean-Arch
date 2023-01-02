package com.vishvendu.cleanarch.newsapp.data.local.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bH\'J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/data/local/db/dao/TopHeadlineDAO;", "", "deleteAllTopHeadline", "", "getAllTopHeadline", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/topheadlines/TopHeadlineArticle;", "getAllTopHeadlineFlow", "Lkotlinx/coroutines/flow/Flow;", "insert", "topHeadlineArticle", "update", "(Lcom/vishvendu/cleanarch/newsapp/data/model/topheadlines/TopHeadlineArticle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TopHeadlineDAO {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle> topHeadlineArticle);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle topHeadlineArticle, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Query(value = "delete from top_headline_table")
    public abstract void deleteAllTopHeadline();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from top_headline_table")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle>> getAllTopHeadlineFlow();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from top_headline_table")
    public abstract java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle> getAllTopHeadline();
}