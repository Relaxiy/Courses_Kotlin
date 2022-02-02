package com.example.myapplication

class User(var firstName: String, var secondName: String, var age: Int){
    override fun toString(): String {
        return "firstName = $firstName \nsecondName = $secondName \nage = $age"
    }
}