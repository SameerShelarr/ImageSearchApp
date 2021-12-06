package com.sameershelar.imagesearchapp.api

import com.sameershelar.imagesearchapp.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashAPI {

    companion object{
        const val BASE_URL = "https://api.unsplash.com/"
        const val ACCESS_KEY = BuildConfig.UNSPLASH_ACCESS_KEY
    }

    @Headers("Accept-Version: v1", "Authorization Client-ID $ACCESS_KEY")
    @GET(value = "search/photos")
    suspend fun searchPhotos(
        @Query(value = "query") query: String,
        @Query(value = "page") page: Int,
        @Query(value = "per_page") perPage: Int,
    ): UnsplashResponse
}