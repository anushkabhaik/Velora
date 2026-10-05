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
import androidx.compose.ui.text.style.TextAlign
import com.velora.app.components.VeloraButton
import com.velora.app.components.VeloraProgressIndicator
import com.velora.app.components.VeloraTextField
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

@Composable
fun NameScreen(
    name: String,
    onNameChange: (String) -> Unit,
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
                .widthIn(max = VeloraDimensions.MaxFormWidth),
            verticalArrangement = Arrangement.Center
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
                    text = "1 of 5",
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
                currentStep = 1,
                totalSteps = 5
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXXL
                )
            )

            Text(
                text = "Let's make this\nspace yours.",
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceLG
                )
            )

            Text(
                text = "What should we call you?",
                style = MaterialTheme.typography.bodyLarge,
                color = VeloraColors.TextSecondary
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceMD
                )
            )

            VeloraTextField(
                value = name,
                onValueChange = onNameChange,
                placeholder = "Your name",
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXL
                )
            )

            VeloraButton(
                text = "Continue",
                onClick = onContinue,
                enabled = name.isNotBlank()
            )
        }
    }
}