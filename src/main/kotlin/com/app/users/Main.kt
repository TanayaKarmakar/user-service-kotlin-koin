package com.app.users

import com.app.users.controllers.UserController
import com.app.users.models.Address
import com.app.users.models.User
import org.koin.core.context.GlobalContext.startKoin

fun main() {

    startKoin {
        modules(appModule)
    }

    val userController = UserController()
    addUser(userController)

    getAllUsers(userController)

    getUserById("1", userController) // test with existent ID

    getUserById("2", userController) //test with non existent id
}

fun getUserById(userId: String, userController: UserController) {
    println(userController.getUserById(userId))
}

fun addUser(userController: UserController) {
    val user1 = User("1",
            "John Doe",
            "12-04-1989",
            Address("Chicago", "123 Main Street", "IL", "US", "12345"))

    println(userController.addUser(user1))
}

fun getAllUsers(userController: UserController) {
    println("Listing all users")
    println(userController.getUsers())
}