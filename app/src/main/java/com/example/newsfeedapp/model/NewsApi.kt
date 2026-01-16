package com.example.newsfeedapp.model
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/everything")
    suspend fun getNews(
        @Query("q") query: String = "bitcoin",
        @Query("apiKey") apiKey: String,
        ) : Response<NewsModel>
}