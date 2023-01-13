package com.ifs.desafiomovies.data

import com.ifs.desafiomovies.data.exception.ResponseError

sealed class Resource<out T>(
    val data: T? = null,
    val error: ResponseError? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class DataError<T>(error: ResponseError) : Resource<T>(null, error)
}