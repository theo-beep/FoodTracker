package com.theolinnaidoo.foodtracker.common


sealed class DataResult<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : DataResult<T>(data)
    class Error<T>(message: String, data: T? = null) : DataResult<T>(data, message)
    class Loading<T>(data: T? = null) : DataResult<T>(data)
}