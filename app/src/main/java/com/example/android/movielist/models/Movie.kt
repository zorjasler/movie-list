package com.example.android.movielist.models

data class Movie(val id: Int,
                 val vote_average: Double,
                 val title: String,
                 val poster_path: String,
                 val overview: String,
                 val adult: Boolean)