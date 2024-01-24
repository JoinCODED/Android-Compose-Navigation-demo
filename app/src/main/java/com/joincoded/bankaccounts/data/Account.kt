package com.joincoded.bankaccounts.data



data class Account(
    val id: Int,
    val name: String,
    var amount: Double,
    val currency: String
)
