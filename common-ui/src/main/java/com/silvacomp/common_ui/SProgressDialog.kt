package com.silvacomp.common_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun SProgressDialog(
    text: String,
    colorIndicator: ColorIndicator,
    onDismiss: () -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp)
                ),
            contentAlignment = Alignment.Center

            ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ProgressIndicator(
                    modifier = Modifier.size(150.dp),
                    colorIndicator = colorIndicator,
                )
                Text(text = text, fontSize = 28.sp)

            }
        }

    }

}