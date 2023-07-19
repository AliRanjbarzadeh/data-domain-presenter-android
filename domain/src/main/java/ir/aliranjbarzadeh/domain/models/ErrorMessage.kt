package ir.aliranjbarzadeh.domain.models

import ir.aliranjbarzadeh.domain.util.HttpErrors

/**
 * Created by Ali Ranjbarzadeh on 9/29/2022 AD.
 */
data class ErrorMessage(
	val message: String?,
	val status: HttpErrors,
)