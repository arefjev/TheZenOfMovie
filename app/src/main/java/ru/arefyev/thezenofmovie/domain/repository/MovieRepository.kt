package ru.arefyev.thezenofmovie.domain.repository

import ru.arefyev.thezenofmovie.data.remote.dto.MoviePopularDto

interface MovieRepository {

    suspend fun getMovies(): MoviePopularDto
}