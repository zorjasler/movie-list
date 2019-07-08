package com.example.android.movielist.repository

import com.example.android.movielist.models.Movie

interface MovieListRepository {

    fun getMovieList(): List<Movie>?
}