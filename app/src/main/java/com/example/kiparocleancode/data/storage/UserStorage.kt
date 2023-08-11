package com.example.kiparocleancode.data.storage

import com.example.kiparocleancode.data.storage.models.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}