package ru.arefyev.thezenofmovie.data.remote

import retrofit2.http.GET

interface TheMovieDbApi {

    @GET("/3/movie/popular")
    suspend fun getMoviesPopular()
    
}
