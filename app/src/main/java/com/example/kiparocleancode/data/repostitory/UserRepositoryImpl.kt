package com.example.kiparocleancode.data.repostitory

import android.content.Context
import com.example.kiparocleancode.data.DEFAULT_LAST_NAME
import com.example.kiparocleancode.data.KEY_FIRST_NAME
import com.example.kiparocleancode.data.KEY_LAST_NAME
import com.example.kiparocleancode.data.SHARED_PREFS_NAME
import com.example.kiparocleancode.domain.models.SaveUserNameParam
import com.example.kiparocleancode.domain.models.UserName
import com.example.kiparocleancode.domain.repository.UserRepository

class UserRepositoryImpl(context: Context) : UserRepository {

    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        sharedPreferences.edit().putString(KEY_FIRST_NAME, saveParam.name).apply()
        return true
    }

    override fun getName(): UserName {

        val firstName = sharedPreferences.getString(KEY_FIRST_NAME, "") ?: ""
        val lastName = sharedPreferences.getString(KEY_LAST_NAME, DEFAULT_LAST_NAME) ?: DEFAULT_LAST_NAME
        return UserName(firstName = firstName, lastName = lastName)
    }
}