package com.vishvendu.cleanarch.newsapp.data.local.db

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.vishvendu.cleanarch.newsapp.data.model.languagelist.Language
import com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle
import com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineSource
import java.lang.reflect.Type
import javax.inject.Inject

@ProvidedTypeConverter
class Convertors @Inject constructor(private val gson: Gson){
    private inline fun <reified T> genericType() = object: TypeToken<T>() {}.type
    @TypeConverter
    fun fromCountryLangList(countryLang: List<TopHeadlineArticle?>?): String? {
        if (countryLang == null) {
            return null
        }


        val type: Type = genericType<List<TopHeadlineArticle?>?>()
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toCountryLangList(countryLangString: String?): List<TopHeadlineArticle>? {
        if (countryLangString == null) {
            return null
        }
        val type: Type = genericType<List<TopHeadlineArticle?>?>()
        return gson.fromJson(countryLangString, type)
       // return gson.fromJson<List<TopHeadlineArticle>>(countryLangString, type)
    }

}