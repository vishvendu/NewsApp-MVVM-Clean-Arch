package com.vishvendu.cleanarch.newsapp.data.model.newsinlanguage


import com.google.gson.annotations.SerializedName

data class NewsInLanguageResponse(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)