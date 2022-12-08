package com.silvacomp.common_ui

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyButton(text: String) {
    Button(onClick = {
        Log.d("Test library", "PEPE")
    }) {
        Text(text = text)
    }
}


@Preview
@Composable
fun MyButtonPrev() {
    MyButton("Test")
}