package com.jobnimbus.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jobnimbus.domain.MainUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class MainViewModel(
    private val useCase: MainUseCase,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {

    private val _data = MutableStateFlow("")
    val data: StateFlow<String>
        get() = _data

    fun fetchData() {
        viewModelScope.launch(dispatcher){
            _data.update { useCase() }
        }
    }
}