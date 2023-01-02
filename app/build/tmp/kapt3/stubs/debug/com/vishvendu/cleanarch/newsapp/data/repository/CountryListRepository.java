package com.vishvendu.cleanarch.newsapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006j\u0002`\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/vishvendu/cleanarch/newsapp/data/repository/CountryListRepository;", "", "jsonHelper", "Lcom/vishvendu/cleanarch/newsapp/data/local/JsonHelper;", "(Lcom/vishvendu/cleanarch/newsapp/data/local/JsonHelper;)V", "getCountryList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/vishvendu/cleanarch/newsapp/data/model/countrylist/CountryListItem;", "Lcom/vishvendu/cleanarch/newsapp/utils/User;", "app_debug"})
public final class CountryListRepository {
    private final com.vishvendu.cleanarch.newsapp.data.local.JsonHelper jsonHelper = null;
    
    @javax.inject.Inject()
    public CountryListRepository(@org.jetbrains.annotations.NotNull()
    com.vishvendu.cleanarch.newsapp.data.local.JsonHelper jsonHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem>> getCountryList() {
        return null;
    }
}