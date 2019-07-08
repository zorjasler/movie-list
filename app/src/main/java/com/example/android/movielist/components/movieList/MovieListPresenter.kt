package com.example.android.movielist.components.movieList

import com.example.android.movielist.models.Movie
import com.example.android.movielist.repository.MovieListRepository

class MovieListPresenter(private val view: MovieListView, private val repository: MovieListRepository) {

    fun getMovieList(): List<Movie>? {
        return repository.getMovieList()
    }

    fun onCreate() {
        val movies = getMovieList()
        view.initializeRecyclerView(movies)
    }
}