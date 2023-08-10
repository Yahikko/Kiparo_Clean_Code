package com.example.kiparocleancode.domain.usecase

import com.example.kiparocleancode.domain.models.UserName
import com.example.kiparocleancode.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}