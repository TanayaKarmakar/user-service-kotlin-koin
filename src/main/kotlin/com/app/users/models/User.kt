package com.app.users.models

data class User(
        val userId: String,
        val name: String,
        val dateOfBirth: String,
        val address: Address
)
