package com.example.android.movielist.repository

import android.util.Log
import com.example.android.movielist.api.ApiFactory
import com.example.android.movielist.models.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MovieListRepositoryImpl : MovieListRepository {

    /**
     * Gets the movie list
     */
    override fun getMovieList(): List<Movie>? {
        val service = ApiFactory.api
        var movies = emptyList<Movie>()

        GlobalScope.launch(Dispatchers.Main) {
            val request = service.getPopularMovie()
            try {
                val response = request.await()
                if (response.isSuccessful) {
                    val movieResponse = response.body()
                    movies = movieResponse!!.results
                    Log.d("MOVIE LIST ->", movies.toString())
                } else {
                    Log.d("ERROR -> ", response.errorBody().toString())
                }
            } catch (e: Exception) {

            }
        }

        return movies
    }
}