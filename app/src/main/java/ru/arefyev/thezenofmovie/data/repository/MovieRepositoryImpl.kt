package ru.arefyev.thezenofmovie.data.repository

import javax.inject.Inject
import ru.arefyev.thezenofmovie.data.remote.TheMovieDbApi
import ru.arefyev.thezenofmovie.data.remote.dto.MoviePopularDto
import ru.arefyev.thezenofmovie.domain.repository.MovieRepository

class MovieRepositoryImpl @Inject constructor(
    private val api: TheMovieDbApi
) : MovieRepository {

    override suspend fun getMovies(): MoviePopularDto {
        TODO("Not yet implemented")
    }

}