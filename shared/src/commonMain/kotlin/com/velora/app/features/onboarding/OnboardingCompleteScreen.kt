package com.velora.app.features.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.velora.app.components.VeloraButton
import com.velora.app.components.VeloraSelectableChip
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

@Composable
fun OnboardingCompleteScreen(
    onboardingState: OnboardingState,
    onBack: () -> Unit,
    onEnterVelora: () -> Unit
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
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TextButton(
                onClick = onBack,
                modifier = Modifier.align(Alignment.Start)
            ) {
                Text(
                    text = "← Back",
                    color = MaterialTheme.colorScheme.primary
                )
            }

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceLG
                )
            )

            Text(
                text = "✦",
                fontSize = 30.sp,
                color = VeloraColors.Sage
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceMD
                )
            )

            Text(
                text = "Your space is ready,\n${onboardingState.name}.",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceMD
                )
            )

            Text(
                text = "We've shaped your Velora experience around what matters most to you.",
                style = MaterialTheme.typography.bodyLarge,
                color = VeloraColors.TextSecondary,
                textAlign = TextAlign.Center,
                modifier = Modifier.widthIn(max = 400.dp)
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXL
                )
            )

            PersonalizationSection(
                title = "YOUR FOCUS"
            ) {
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(
                        VeloraDimensions.SpaceXS
                    ),
                    verticalArrangement = Arrangement.spacedBy(
                        VeloraDimensions.SpaceXS
                    )
                ) {
                    onboardingState.focusAreas.forEach { area ->
                        VeloraSelectableChip(
                            text = area,
                            selected = true,
                            onClick = {}
                        )
                    }
                }
            }

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceLG
                )
            )

            PersonalizationSection(
                title = "YOUR RHYTHM"
            ) {
                Text(
                    text = onboardingState.preferredTime
                        ?: "Flexible — whenever I need it",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceLG
                )
            )

            PersonalizationSection(
                title = "YOU'D LIKE TO EXPLORE"
            ) {
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(
                        VeloraDimensions.SpaceXS
                    ),
                    verticalArrangement = Arrangement.spacedBy(
                        VeloraDimensions.SpaceXS
                    )
                ) {
                    onboardingState.interests.forEach { interest ->
                        VeloraSelectableChip(
                            text = interest,
                            selected = true,
                            onClick = {}
                        )
                    }
                }
            }

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXL
                )
            )

            VeloraButton(
                text = "Enter Velora",
                onClick = onEnterVelora
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceLG
                )
            )
        }
    }
}

@Composable
private fun PersonalizationSection(
    title: String,
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = title,
            style = MaterialTheme.typography.labelMedium.copy(
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 1.5.sp
            ),
            color = VeloraColors.TextMuted,
            textAlign = TextAlign.Center
        )

        Spacer(
            modifier = Modifier.height(
                VeloraDimensions.SpaceSM
            )
        )

        content()
    }
}