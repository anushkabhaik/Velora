package com.velora.app.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

@Composable
fun VeloraSelectableChip(
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .clip(
                RoundedCornerShape(
                    VeloraDimensions.RadiusLarge
                )
            )
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(
            VeloraDimensions.RadiusLarge
        ),
        color = if (selected) {
            VeloraColors.SoftSage
        } else {
            VeloraColors.Card
        },
        border = BorderStroke(
            width = 1.dp,
            color = if (selected) {
                VeloraColors.Sage
            } else {
                VeloraColors.Divider
            }
        )
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(
                horizontal = VeloraDimensions.SpaceMD,
                vertical = VeloraDimensions.SpaceSM
            ),
            style = MaterialTheme.typography.bodyMedium,
            color = if (selected) {
                VeloraColors.DeepSage
            } else {
                MaterialTheme.colorScheme.onBackground
            }
        )
    }
}