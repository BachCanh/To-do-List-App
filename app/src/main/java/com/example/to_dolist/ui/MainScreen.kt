package com.example.to_dolist.ui

import android.app.DatePickerDialog
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.to_dolist.model.SortOption
import com.example.to_dolist.viewmodel.TaskViewModel
import java.time.LocalDate
import java.util.Calendar

@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MainScreen(taskViewModel: TaskViewModel = viewModel()) {
    var taskName by remember { mutableStateOf(TextFieldValue("")) }
    var taskDueDate by remember { mutableStateOf<LocalDate?>(null) }
    var showDatePicker by remember { mutableStateOf(false) }
    var menuExpanded by remember { mutableStateOf(false) }
    val context = LocalContext.current

    val sortedTasks = taskViewModel.getSortedTasks()

    if (showDatePicker) {
        val today = Calendar.getInstance()
        DatePickerDialog(
            context,
            { _, year, month, dayOfMonth ->
                taskDueDate = LocalDate.of(year, month + 1, dayOfMonth)
                showDatePicker = false
            },
            today.get(Calendar.YEAR),
            today.get(Calendar.MONTH),
            today.get(Calendar.DAY_OF_MONTH)
        ).apply {
            setOnCancelListener { showDatePicker = false }
        }.show()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Task Manager") },
                actions = {
                    IconButton(onClick = { menuExpanded = true }) {
                        Icon(
                            imageVector = androidx.compose.material.icons.Icons.Default.MoreVert,
                            contentDescription = "Menu"
                        )
                    }
                    SortMenu(
                        expanded = menuExpanded,
                        onDismiss = { menuExpanded = false },
                        onSortOptionSelected = { sortOption ->
                            taskViewModel.updateSortOption(sortOption)
                        }
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            TaskInput(
                taskName = taskName,
                onTaskNameChange = { taskName = it },
                taskDueDate = taskDueDate,
                onSelectDate = { showDatePicker = true },
                onAddTask = {
                    if (taskName.text.isNotBlank() && taskDueDate != null) {
                        taskViewModel.addTask(taskName.text, taskDueDate!!)
                        taskName = TextFieldValue("")
                        taskDueDate = null
                    }
                }
            )
            Spacer(modifier = Modifier.height(24.dp))
            TaskList(tasks = sortedTasks)
        }
    }
}
