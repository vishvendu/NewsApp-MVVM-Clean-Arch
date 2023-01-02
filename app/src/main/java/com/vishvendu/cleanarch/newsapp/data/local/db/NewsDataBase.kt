package com.vishvendu.cleanarch.newsapp.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.vishvendu.cleanarch.newsapp.data.local.db.dao.TopHeadlineDAO
import com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle
import com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlinesResponse
import javax.inject.Singleton

@Singleton
@Database(entities = [TopHeadlineArticle::class, TopHeadlinesResponse::class], version = 1)
@TypeConverters(Convertors::class)
abstract class NewsDataBase : RoomDatabase(){
    abstract fun topHeadlineDAO() : TopHeadlineDAO
}