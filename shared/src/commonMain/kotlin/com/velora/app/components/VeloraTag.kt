package com.velora.app.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

@Composable
fun VeloraTag(
    text: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(
            VeloraDimensions.RadiusLarge
        ),
        color = VeloraColors.SoftSage,
        border = BorderStroke(
            width = 1.dp,
            color = VeloraColors.Sage
        )
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(
                horizontal = VeloraDimensions.SpaceMD,
                vertical = VeloraDimensions.SpaceSM
            ),
            style = MaterialTheme.typography.bodyMedium,
            color = VeloraColors.DeepSage
        )
    }
}