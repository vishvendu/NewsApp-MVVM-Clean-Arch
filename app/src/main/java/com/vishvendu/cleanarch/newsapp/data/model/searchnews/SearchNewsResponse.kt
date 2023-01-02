package com.vishvendu.cleanarch.newsapp.data.model.searchnews


import com.google.gson.annotations.SerializedName

data class SearchNewsResponse(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)