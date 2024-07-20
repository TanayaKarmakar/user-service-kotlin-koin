package com.app.users.controllers

import com.app.users.models.User
import com.app.users.services.UserService
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class UserController: KoinComponent {
    private val userService: UserService by inject()

    fun addUser(user: User): User {
        return userService.addUser(user)
    }

    fun getUsers(): List<User> {
        return userService.getUsers()
    }

    fun getUserById(userId: String): User {
        return userService.getUserById(userId)
    }

    fun updateUser(user: User): User {
        return userService.updateUser(user)
    }

    fun deleteUser(userId: String): String {
        return userService.deleteUser(userId)
    }
}