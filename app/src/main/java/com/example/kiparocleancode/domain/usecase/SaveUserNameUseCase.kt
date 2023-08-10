package com.example.kiparocleancode.domain.usecase

import com.example.kiparocleancode.domain.models.SaveUserNameParam
import com.example.kiparocleancode.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {
        return userRepository.saveName(param)
    }
}