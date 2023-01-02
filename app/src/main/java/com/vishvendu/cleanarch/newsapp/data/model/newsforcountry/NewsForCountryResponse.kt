package com.vishvendu.cleanarch.newsapp.data.model.newsforcountry


import com.google.gson.annotations.SerializedName

data class NewsForCountryResponse(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)