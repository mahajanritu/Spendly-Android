package com.example.expensetrackerapp.ui.component

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.expensetrackerapp.R

@Composable
fun FloatingButton(showBottomSheet: MutableState<Boolean>) {
    FloatingActionButton(
        modifier = Modifier
            .offset(y = 50.dp)
            .size(70.dp),
        shape = CircleShape,

        // FIXED: Black background ki jagah #7766F7 purple color pass kar diya hai
        containerColor = Color(0xFF7766F7),
        contentColor = Color.White,

        onClick = { showBottomSheet.value = true }
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add",
            modifier = Modifier.size(35.dp)
        )
    }
}