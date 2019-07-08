package com.example.android.movielist.components.movieList

import com.example.android.movielist.models.Movie

interface MovieListView {

    fun initializeRecyclerView(movies: List<Movie>?)
}