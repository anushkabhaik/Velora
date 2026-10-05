package com.velora.app.features.onboarding

import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.Arrangement
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

private val interests = listOf(
    "Journaling",
    "Affirmations",
    "Self-care",
    "Manifestation",
    "Glow-up challenges",
    "Mindfulness",
    "Personal growth",
    "Wellness"
)

@Composable
fun InterestsScreen(
    selectedInterests: Set<String>,
    onInterestToggle: (String) -> Unit,
    onBack: () -> Unit,
    onComplete: () -> Unit
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
                    text = "5 of 5",
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
                currentStep = 5,
                totalSteps = 5
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXXL
                )
            )

            Text(
                text = "What would you like\nto explore?",
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceSM
                )
            )

            Text(
                text = "Choose anything you'd like Velora to bring into your space.",
                style = MaterialTheme.typography.bodyLarge,
                color = VeloraColors.TextSecondary
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXL
                )
            )

            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(
                    VeloraDimensions.SpaceSM
                ),
                verticalArrangement = Arrangement.spacedBy(
                    VeloraDimensions.SpaceSM
                )
            ) {

                interests.forEach { interest ->

                    VeloraSelectableChip(
                        text = interest,
                        selected = interest in selectedInterests,
                        onClick = {
                            onInterestToggle(interest)
                        }
                    )
                }
            }

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXXL
                )
            )

            VeloraButton(
                text = "Complete",
                onClick = onComplete,
                enabled = selectedInterests.isNotEmpty()
            )
        }
    }
}