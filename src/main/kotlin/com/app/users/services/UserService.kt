package com.app.users.services

import com.app.users.models.User
import com.app.users.repositories.UserRepository

interface UserService {
    fun addUser(user: User): User

    fun getUsers(): List<User>

    fun getUserById(userId: String): User

    fun updateUser(user: User): User

    fun deleteUser(userId: String): String
}


class UserServiceImpl(private val userRepository: UserRepository): UserService {
    override fun addUser(user: User): User {
        return userRepository.addUser(user)
    }

    override fun getUsers(): List<User> {
        return userRepository.getUsers()
    }

    override fun getUserById(userId: String): User {
        return userRepository.getUserById(userId)
    }

    override fun updateUser(user: User): User {
        return userRepository.updateUser(user)
    }

    override fun deleteUser(userId: String): String {
        return userRepository.deleteUser(userId)
    }

}