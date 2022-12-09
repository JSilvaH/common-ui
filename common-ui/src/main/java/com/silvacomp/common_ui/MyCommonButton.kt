package com.silvacomp.common_ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SButton(
    text: String,
    background: Color,
    typeButton: TypeButton,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick() },
        shape = returnTypeShape(typeButton),
        modifier = modifier.background(background)

    ) {
        Text(text)
    }

}

private  fun returnTypeShape(typeButton: TypeButton): Shape {
    return when(typeButton){
        TypeButton.Rounded -> RoundedCornerShape(50.dp)
        TypeButton.Squared -> RoundedCornerShape(0.dp)
        TypeButton.Circled -> CircleShape
    }
}

enum class TypeButton{
    Rounded,
    Squared,
    Circled
}



