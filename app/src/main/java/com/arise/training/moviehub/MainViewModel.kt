package com.arise.training.moviehub

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class MainViewModel: ViewModel() {
    private val _number = MutableLiveData<Int>()
    val number: MutableLiveData<Int> = _number

    fun counter() {
        _number.value = (_number.value ?: 0) + 1
    }

    override fun onCleared() {
        super.onCleared()
        Timber.d("onCleared")
    }
}