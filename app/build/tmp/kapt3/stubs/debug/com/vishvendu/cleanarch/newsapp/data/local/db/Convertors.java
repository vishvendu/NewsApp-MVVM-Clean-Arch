package com.vishvendu.cleanarch.newsapp.data.local.db;

import java.lang.System;

@androidx.room.ProvidedTypeConverter()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0007J\u0019\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b\"\u0006\b\u0000\u0010\r\u0018\u0001H\u0082\bJ\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/data/local/db/Convertors;", "", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "fromCountryLangList", "", "countryLang", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/topheadlines/TopHeadlineArticle;", "genericType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "T", "toCountryLangList", "countryLangString", "app_debug"})
public final class Convertors {
    private final com.google.gson.Gson gson = null;
    
    @javax.inject.Inject()
    public Convertors(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromCountryLangList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle> countryLang) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.vishvendu.cleanarch.newsapp.data.model.topheadlines.TopHeadlineArticle> toCountryLangList(@org.jetbrains.annotations.Nullable()
    java.lang.String countryLangString) {
        return null;
    }
}