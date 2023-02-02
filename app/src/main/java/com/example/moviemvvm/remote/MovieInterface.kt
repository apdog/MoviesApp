package com.example.moviemvvm.remote

import com.example.moviemvvm.data.MoviesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieInterface {

    @GET()
    suspend fun getAllMovies(
        @Query("api_key") apiKey: String,
        @Query("language") language: String,
        @Query("page") page: Int
    ) : Response<MoviesResponse>

}