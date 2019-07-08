package com.example.android.movielist.api

import com.example.android.movielist.common.Constants

object ApiFactory {

    val api: Api = RetrofitFactory.retrofit(Constants.BASE_URL).create(Api::class.java)
}