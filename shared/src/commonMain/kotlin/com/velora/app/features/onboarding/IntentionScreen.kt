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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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

private val intentions = listOf(
    "I want to feel more grounded",
    "I want to build better habits",
    "I want to understand myself",
    "I want to grow my confidence",
    "I want to focus on self-care",
    "I'm entering a new chapter"
)

@Composable
fun IntentionScreen(
    selectedIntention: String?,
    onIntentionSelected: (String) -> Unit,
    onBack: () -> Unit,
    onContinue: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(
                horizontal = VeloraDimensions.MobileHorizontalPadding
            )
    ) {

        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
                .widthIn(max = VeloraDimensions.MaxFormWidth)
                .verticalScroll(rememberScrollState())
                .padding(
                    vertical = VeloraDimensions.SpaceLG
                )
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
                    text = "2 of 5",
                    style = MaterialTheme.typography.labelMedium,
                    color = VeloraColors.TextSecondary
                )
            }

            Spacer(
                Modifier.height(VeloraDimensions.SpaceSM)
            )

            VeloraProgressIndicator(
                currentStep = 2,
                totalSteps = 5
            )

            Spacer(
                Modifier.height(VeloraDimensions.SpaceXL)
            )

            Text(
                text = "What brings you\nto Velora?",
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(
                Modifier.height(VeloraDimensions.SpaceLG)
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(
                    VeloraDimensions.SpaceSM
                )
            ) {
                intentions.forEach { intention ->

                    VeloraChoiceCard(
                        text = intention,
                        selected = selectedIntention == intention,
                        onClick = {
                            onIntentionSelected(intention)
                        }
                    )
                }
            }

            Spacer(
                Modifier.height(VeloraDimensions.SpaceXL)
            )

            VeloraButton(
                text = "Continue",
                onClick = onContinue,
                enabled = selectedIntention != null
            )

            Spacer(
                Modifier.height(VeloraDimensions.SpaceLG)
            )
        }
    }
}