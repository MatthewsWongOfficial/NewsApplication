package com.gowiredu.newsbrief.api

import com.gowiredu.newsbrief.models.NewsResponse
import com.gowiredu.newsbrief.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = "61bd1dca695c469aaf72ff22a357e87c"
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = "61bd1dca695c469aaf72ff22a357e87c"
    ): Response<NewsResponse>

}