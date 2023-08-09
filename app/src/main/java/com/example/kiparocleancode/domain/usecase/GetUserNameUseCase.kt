package com.example.kiparocleancode.domain.usecase

import com.example.kiparocleancode.domain.models.UserName

class GetUserNameUseCase {

    fun execute(): UserName {
        return UserName(firstName = "Kiparo", lastName = "Hello")
    }
}