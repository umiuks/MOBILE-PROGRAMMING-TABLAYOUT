package com.umikhotimatus.acer.myviewpager.rest

import com.umikhotimatus.acer.myviewpager.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("posts/")
    fun getAllPosts(): Observable<List<Post>>
}