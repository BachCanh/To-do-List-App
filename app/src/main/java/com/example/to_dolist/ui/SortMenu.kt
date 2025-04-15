package com.example.to_dolist.ui

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.to_dolist.model.SortOption

@Composable
fun SortMenu(
    expanded: Boolean,
    onDismiss: () -> Unit,
    onSortOptionSelected: (SortOption) -> Unit
) {
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismiss
    ) {
        DropdownMenuItem(
            onClick = {
                onSortOptionSelected(SortOption.NAME)
                onDismiss()
            },
            text = { Text("Sort by name") }
        )
        DropdownMenuItem(
            onClick = {
                onSortOptionSelected(SortOption.DATE)
                onDismiss()
            },
            text = { Text("Sort by date") }
        )
    }
}
