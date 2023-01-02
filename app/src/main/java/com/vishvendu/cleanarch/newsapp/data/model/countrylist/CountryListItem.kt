package com.vishvendu.cleanarch.newsapp.data.model.countrylist


import com.google.gson.annotations.SerializedName

data class CountryListItem(
    @SerializedName("code")
    val code: String,
    @SerializedName("label")
    val label: String
)