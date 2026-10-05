package com.velora.app.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

@Composable
fun VeloraChoiceCard(
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(
                    VeloraDimensions.RadiusMedium
                )
            )
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(
            VeloraDimensions.RadiusMedium
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
        Row(
            modifier = Modifier.padding(
                horizontal = VeloraDimensions.SpaceMD,
                vertical = VeloraDimensions.SpaceMD
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Surface(
                modifier = Modifier.size(20.dp),
                shape = CircleShape,
                color = if (selected) {
                    VeloraColors.Sage
                } else {
                    VeloraColors.Card
                },
                border = BorderStroke(
                    1.dp,
                    if (selected) {
                        VeloraColors.Sage
                    } else {
                        VeloraColors.Taupe
                    }
                )
            ) {}

            Spacer(
                modifier = Modifier.width(
                    VeloraDimensions.SpaceMD
                )
            )

            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}