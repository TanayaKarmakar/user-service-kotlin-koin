package com.app.users

import com.app.users.repositories.InMemoryUserRepository
import com.app.users.repositories.UserRepository
import com.app.users.services.UserService
import com.app.users.services.UserServiceImpl
import org.koin.dsl.module

val appModule = module {
    single<UserRepository> {
        InMemoryUserRepository()
    }
    single<UserService> {
        UserServiceImpl(get())
    }
}