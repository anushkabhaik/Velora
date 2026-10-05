package com.velora.app.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.velora.app.core.design.VeloraColors

@Composable
fun VeloraProgressIndicator(
    currentStep: Int,
    totalSteps: Int,
    modifier: Modifier = Modifier
) {
    val progress = currentStep.toFloat() / totalSteps.toFloat()

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(4.dp)
            .background(
                color = VeloraColors.Divider,
                shape = RoundedCornerShape(100)
            )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progress)
                .height(4.dp)
                .background(
                    color = VeloraColors.Sage,
                    shape = RoundedCornerShape(100)
                )
        )
    }
}