package com.submission.dicoding.githubuser.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.submission.dicoding.githubuser.data.UserRepository
import kotlinx.coroutines.launch

class ThemeViewModel(application: Application) : ViewModel() {
    private val repository = UserRepository(application)

    fun getThemeSettings() = repository.getTheme().asLiveData()

    fun saveThemeSettings(isDarkMode: Boolean) {
        viewModelScope.launch {
            repository.saveTheme(isDarkMode)
        }
    }
}