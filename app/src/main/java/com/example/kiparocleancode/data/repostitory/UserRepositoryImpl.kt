package com.example.kiparocleancode.data.repostitory

import com.example.kiparocleancode.data.DEFAULT_LAST_NAME
import com.example.kiparocleancode.data.storage.UserStorage
import com.example.kiparocleancode.data.storage.models.User
import com.example.kiparocleancode.domain.models.SaveUserNameParam
import com.example.kiparocleancode.domain.models.UserName
import com.example.kiparocleancode.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val user = mapToStorage(saveParam)
        return userStorage.save(user)
    }

    override fun getName(): UserName {
        val user = userStorage.get()
        return matToDomain(user)
    }

    private fun mapToStorage(saveParam: SaveUserNameParam): User {
        return User(firstName = saveParam.name, lastName = DEFAULT_LAST_NAME)
    }

    private fun matToDomain(user: User): UserName {
        return UserName(firstName = user.firstName, lastName = user.lastName)
    }
}