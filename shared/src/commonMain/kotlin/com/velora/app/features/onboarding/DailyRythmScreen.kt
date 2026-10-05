package com.velora.app.features.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import com.velora.app.components.VeloraChoiceCard
import com.velora.app.components.VeloraProgressIndicator
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

private val dailyRhythms = listOf(
    "Morning — start my day intentionally",
    "Midday — take a mindful pause",
    "Evening — reflect and unwind",
    "Flexible — whenever I need it"
)

@Composable
fun DailyRhythmScreen(
    selectedTime: String?,
    onTimeSelected: (String) -> Unit,
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
                TextButton(
                    onClick = onBack
                ) {
                    Text(
                        text = "← Back",
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                Spacer(
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "4 of 5",
                    style = MaterialTheme.typography.labelMedium,
                    color = VeloraColors.TextSecondary
                )
            }

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceSM
                )
            )

            VeloraProgressIndicator(
                currentStep = 4,
                totalSteps = 5
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXXL
                )
            )

            Text(
                text = "When would you like\ntime for yourself?",
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceSM
                )
            )

            Text(
                text = "Choose the rhythm that feels most natural to you.",
                style = MaterialTheme.typography.bodyLarge,
                color = VeloraColors.TextSecondary
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXL
                )
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(
                    VeloraDimensions.SpaceSM
                )
            ) {
                dailyRhythms.forEach { rhythm ->

                    VeloraChoiceCard(
                        text = rhythm,
                        selected = selectedTime == rhythm,
                        onClick = {
                            onTimeSelected(rhythm)
                        }
                    )
                }
            }

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXL
                )
            )

            VeloraButton(
                text = "Continue",
                onClick = onContinue,
                enabled = selectedTime != null
            )
        }
    }
}