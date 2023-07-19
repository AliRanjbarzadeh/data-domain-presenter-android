package ir.aliranjbarzadeh.domain.util

import ir.aliranjbarzadeh.domain.models.ErrorMessage

sealed class NetworkResult<T> {
	data class Success<T>(val data: T) : NetworkResult<T>()
	data class Error<T>(val error: ErrorMessage) : NetworkResult<T>()
	data class Loading<T>(val loading: Boolean) : NetworkResult<T>()
}