package com.app.users.repositories

import com.app.users.exceptions.DuplicateEntryException
import com.app.users.exceptions.NotFoundException
import com.app.users.models.User

class InMemoryUserRepository: UserRepository {
    private val userMap: MutableMap<String, User> = mutableMapOf()

    override fun addUser(user: User): User {
        if(userMap.containsKey(user.userId)) {
            throw DuplicateEntryException("User with ID: ${user.userId} already exists")
        }
        userMap[user.userId] = user
        return user
    }

    override fun getUsers(): List<User> {
        return userMap.values.toList()
    }

    override fun getUserById(userId: String): User {
        if(!userMap.containsKey(userId)) {
            throw NotFoundException("User with ID: $userId does not exist in the system")
        }
        return userMap[userId]!!
    }

    override fun updateUser(user: User): User {
        if(!userMap.containsKey(user.userId)) {
            throw NotFoundException("User with ID: ${user.userId} does not exist in the system")
        }
        userMap[user.userId] = user
        return user
    }

    override fun deleteUser(userId: String): String {
        if(!userMap.containsKey(userId)) {
            throw NotFoundException("User with ID: $userId does not exist in the system")
        }
        userMap.remove(userId)
        return "User with $userId deleted successfully"
    }
}