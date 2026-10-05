package com.velora.app.features.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.velora.app.components.VeloraButton
import com.velora.app.components.VeloraProgressIndicator
import com.velora.app.components.VeloraSelectableChip
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

private val focusAreas = listOf(
    "Self-love",
    "Confidence",
    "Mindfulness",
    "Journaling",
    "Wellness",
    "Growth",
    "Gratitude",
    "Routine"
)

@Composable
fun FocusAreasScreen(
    selectedAreas: Set<String>,
    onAreaToggle: (String) -> Unit,
    onBack: () -> Unit,
    onContinue: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(
                horizontal = VeloraDimensions.MobileHorizontalPadding,
                vertical = VeloraDimensions.SpaceLG
            ),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = VeloraDimensions.MaxFormWidth)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(onClick = onBack) {
                    Text(
                        text = "← Back",
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                Spacer(Modifier.weight(1f))

                Text(
                    text = "3 of 5",
                    style = MaterialTheme.typography.labelMedium,
                    color = VeloraColors.TextSecondary
                )
            }

            Spacer(
                Modifier.height(VeloraDimensions.SpaceSM)
            )

            VeloraProgressIndicator(
                currentStep = 3,
                totalSteps = 5
            )

            Spacer(
                Modifier.height(VeloraDimensions.SpaceXXL)
            )

            Text(
                text = "What would you\nlike to nurture?",
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(
                Modifier.height(VeloraDimensions.SpaceSM)
            )

            Text(
                text = "Select all that feel right.",
                style = MaterialTheme.typography.bodyLarge,
                color = VeloraColors.TextSecondary
            )

            Spacer(
                Modifier.height(VeloraDimensions.SpaceXL)
            )

            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(
                    VeloraDimensions.SpaceSM
                ),
                verticalArrangement = Arrangement.spacedBy(
                    VeloraDimensions.SpaceSM
                )
            ) {
                focusAreas.forEach { area ->

                    VeloraSelectableChip(
                        text = area,
                        selected = area in selectedAreas,
                        onClick = {
                            onAreaToggle(area)
                        }
                    )
                }
            }

            Spacer(
                Modifier.height(VeloraDimensions.SpaceXXL)
            )

            VeloraButton(
                text = "Continue",
                onClick = onContinue,
                enabled = selectedAreas.isNotEmpty()
            )
        }
    }
}