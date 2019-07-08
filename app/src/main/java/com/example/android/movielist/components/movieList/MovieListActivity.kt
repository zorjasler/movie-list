package com.example.android.movielist.components.movieList

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.android.movielist.R
import com.example.android.movielist.adapters.MovieListAdapter
import com.example.android.movielist.models.Movie
import com.example.android.movielist.repository.MovieListRepositoryImpl
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity(), MovieListView {

    var repository: MovieListRepositoryImpl = MovieListRepositoryImpl()
    var presenter: MovieListPresenter = MovieListPresenter(this, repository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        presenter.onCreate()
    }

    override fun initializeRecyclerView(movies: List<Movie>?) {
        moviesRecyclerView.layoutManager = LinearLayoutManager(this)
        moviesRecyclerView.adapter = MovieListAdapter(movies)
    }
}
