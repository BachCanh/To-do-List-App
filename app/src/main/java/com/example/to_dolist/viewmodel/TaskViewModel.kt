package com.example.to_dolist.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.to_dolist.data.Task
import com.example.to_dolist.model.SortOption
import java.time.LocalDate

class TaskViewModel : ViewModel() {

    var tasks by mutableStateOf(listOf<Task>())
        private set

    var currentSortOption by mutableStateOf(SortOption.NAME)
        private set

    fun addTask(name: String, dueDate: LocalDate) {
        if (name.isNotBlank()) {
            tasks = tasks + Task(name, dueDate)
        }
    }

    fun updateSortOption(sortOption: SortOption) {
        currentSortOption = sortOption
    }

    fun getSortedTasks(): List<Task> = when (currentSortOption) {
        SortOption.NAME -> tasks.sortedBy { it.name.lowercase() }
        SortOption.DATE -> tasks.sortedBy { it.dueDate }
    }
}
