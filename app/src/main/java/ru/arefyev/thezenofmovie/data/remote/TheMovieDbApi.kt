package ru.arefyev.thezenofmovie.data.remote

import retrofit2.http.GET
import ru.arefyev.thezenofmovie.data.remote.dto.MoviePopularDto

interface TheMovieDbApi {

    @GET("/3/movie/popular")
    suspend fun getMoviesPopular(): MoviePopularDto
    
}
