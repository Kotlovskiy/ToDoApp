package com.unewexp.todoapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel: ViewModel() {
    val task = MutableLiveData<List<Task>>()
}