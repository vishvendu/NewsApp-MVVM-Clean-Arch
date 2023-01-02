package com.vishvendu.cleanarch.newsapp.data.local.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.vishvendu.cleanarch.newsapp.data.local.db.Convertors.class})
@androidx.room.Database(entities = {com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle.class, com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlinesResponse.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/data/local/db/NewsDataBase;", "Landroidx/room/RoomDatabase;", "()V", "topHeadlineDAO", "Lcom/vishvendu/cleanarch/newsapp/data/local/db/dao/TopHeadlineDAO;", "app_debug"})
@javax.inject.Singleton()
public abstract class NewsDataBase extends androidx.room.RoomDatabase {
    
    public NewsDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vishvendu.cleanarch.newsapp.data.local.db.dao.TopHeadlineDAO topHeadlineDAO();
}