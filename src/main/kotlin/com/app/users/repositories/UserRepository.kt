package com.app.users.repositories

import com.app.users.models.User

interface UserRepository {
    fun addUser(user: User): User

    fun getUsers(): List<User>

    fun getUserById(userId: String): User

    fun updateUser(user: User): User

    fun deleteUser(userId: String): String
}