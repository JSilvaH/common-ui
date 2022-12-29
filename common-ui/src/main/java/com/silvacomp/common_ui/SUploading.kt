package com.silvacomp.common_ui

import android.icu.text.CaseMap.Title
import androidx.annotation.RawRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun SUploading(
    title: String?= null,
    onDismiss: () -> Unit

) {
    Dialog(onDismissRequest = {
        onDismiss()
    }) {
        Box(modifier = Modifier.size(120.dp).background(color = Color.White, RoundedCornerShape(10.dp)) ){
            Column(
                modifier = Modifier.fillMaxSize()
            ){
                UploadingAnimation(modifier = Modifier)
                Text(
                    text = title?:"",
                    color = Color.Black
                )
            }

        }
    }
}


@Composable
fun UploadingAnimation(
    modifier: Modifier
) {
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.uploading))
    LottieAnimation(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        modifier = modifier
    )

}