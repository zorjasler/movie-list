package com.example.android.movielist.viewHolders

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.android.movielist.common.Constants
import com.example.android.movielist.models.Movie
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_movie.view.*

class ViewHolderMovieList(view: View) : RecyclerView.ViewHolder(view) {

    private var posterBaseURL = Constants.BASE_URL

    fun bind(movie: Movie) = with(itemView) {
        Picasso.get().load(posterBaseURL + movie.poster_path).into(poster)
        title.text = movie.title
    }
}