package com.example.myapplication

class UsersFactory {
    private val usersList = mutableListOf<User>()

    fun sortUsersByAge(): Collection<User>{
        return usersList.sortedBy {it.age > 20}
    }

    fun addUser(user: User){
        usersList.add(user)
    }

    fun returnUsers(): Collection<User> {
        return usersList.toList()
    }
    
}