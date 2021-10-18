package ru.arefyev.thezenofmovie.domain.use_case.get_movies_popular

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import ru.arefyev.thezenofmovie.common.Resource
import ru.arefyev.thezenofmovie.domain.model.Movie
import ru.arefyev.thezenofmovie.domain.repository.MovieRepository
import java.io.IOException
import javax.inject.Inject

class GetMoviesPopularUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(): Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val moviesPopular = repository.getMovies()


        } catch (e: HttpException) {

        } catch (e: IOException) {

        }
    }
}