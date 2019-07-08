package com.example.android.movielist.api

import com.example.android.movielist.models.MovieResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("movie/popular")
    fun getPopularMovie(): Deferred<Response<MovieResponse>>
}