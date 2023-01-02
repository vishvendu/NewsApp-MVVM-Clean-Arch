package com.vishvendu.cleanarch.newsapp.data.model.newssourcedetails


import com.google.gson.annotations.SerializedName

data class NewsSourceDetailsReponse(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)