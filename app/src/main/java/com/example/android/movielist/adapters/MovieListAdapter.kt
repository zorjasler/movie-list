package com.example.android.movielist.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.android.movielist.R
import com.example.android.movielist.common.inflate
import com.example.android.movielist.models.Movie
import com.example.android.movielist.viewHolders.ViewHolderMovieList

class MovieListAdapter(private val movies: List<Movie>?) : RecyclerView.Adapter<ViewHolderMovieList>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovieList {
        return ViewHolderMovieList(parent.inflate(R.layout.item_movie))
    }

    override fun onBindViewHolder(holder: ViewHolderMovieList, position: Int) {
        val item = movies!![position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return movies!!.size
    }


}