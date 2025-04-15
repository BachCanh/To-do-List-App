package com.example.to_dolist.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import java.time.LocalDate

@Composable
fun TaskInput(
    taskName: TextFieldValue,
    onTaskNameChange: (TextFieldValue) -> Unit,
    taskDueDate: LocalDate?,
    onSelectDate: () -> Unit,
    onAddTask: () -> Unit
) {
    OutlinedTextField(
        value = taskName,
        onValueChange = onTaskNameChange,
        label = { Text("Task Name") },
        modifier = Modifier.fillMaxWidth()
    )

    Spacer(modifier = Modifier.height(8.dp))

    Button(
        onClick = onSelectDate,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = if (taskDueDate != null)
                "Due: $taskDueDate"
            else "Select Due Date"
        )
    }

    Spacer(modifier = Modifier.height(16.dp))

    Button(
        onClick = onAddTask,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Add Task")
    }
}
