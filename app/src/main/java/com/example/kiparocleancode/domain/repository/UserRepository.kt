package com.example.kiparocleancode.domain.repository

import com.example.kiparocleancode.domain.models.SaveUserNameParam
import com.example.kiparocleancode.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}