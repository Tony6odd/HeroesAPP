package com.roja.heroesapp.models

data class User(val email: String, val password : String, val name : String){

    companion object{
        val staticUsers = listOf(
            User(email="Juanito@gmail.com", password="1234567", name = "Juanito"),
            User(email="Ivan@gmail.com", password="1234567", name = "Ivan"),
            User(email="Karla@gmail.com", password="1234567", name = "Karla"),
            User(email="Zara@gmail.com", password="1234567", "Zara")
        )
    }
}
