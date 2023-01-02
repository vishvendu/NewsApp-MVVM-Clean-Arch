package com.vishvendu.cleanarch.newsapp.utils

import com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem
import kotlinx.coroutines.flow.Flow

typealias ItemClickListener<T> = (data: T) -> Unit

typealias User = Flow<List<CountryListItem>>