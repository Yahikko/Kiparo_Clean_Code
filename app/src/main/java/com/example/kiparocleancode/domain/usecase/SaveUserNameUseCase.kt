package com.example.kiparocleancode.domain.usecase

import com.example.kiparocleancode.domain.models.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(param: SaveUserNameParam): Boolean {
        return param.name.isNotEmpty()
    }
}