package com.silvacomp.common_ui


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.*

@Composable
fun ProgressIndicator(modifier: Modifier, colorIndicator: ColorIndicator ) {
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(
        returnColorIndicator(colorIndicator)
    ))

    LottieAnimation(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        modifier = modifier
    )
}

private fun returnColorIndicator(colorIndicator: ColorIndicator): Int{
    return when(colorIndicator){
        ColorIndicator.Red -> R.raw.loading_red
        ColorIndicator.Blue -> R.raw.loading_blue
        ColorIndicator.Yellow -> R.raw.loading_yellow
        ColorIndicator.Green -> R.raw.loading_gree
        ColorIndicator.Purple -> R.raw.loading_purple
    }
}

enum class ColorIndicator{
    Red,
    Blue,
    Yellow,
    Green,
    Purple
}