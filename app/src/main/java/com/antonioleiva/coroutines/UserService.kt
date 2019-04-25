package com.antonioleiva.coroutines

import android.support.annotation.WorkerThread

class UserService {

    @WorkerThread
    fun doLogin(username: String, password: String): User {
        Thread.sleep(2000)
        return User(username, "http://lorempixel.com/200/200/people/1/")
    }

    @WorkerThread
    fun requestCurrentFriends(user: User): List<User> {
        Thread.sleep(2000)
        return (1..10).map { User("Friend $it", "http://lorempixel.com/200/200/people/$it/") }
    }

    @WorkerThread
    fun requestSuggestedFriends(user: User): List<User> {
        Thread.sleep(2000)
        return (1..10).map { User("Friend $it", "http://lorempixel.com/200/200/people/$it/") }
    }
}