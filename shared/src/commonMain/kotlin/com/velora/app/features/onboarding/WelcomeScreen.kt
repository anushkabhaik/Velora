package com.velora.app.features.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.velora.app.components.VeloraButton
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

@Composable
fun WelcomeScreen(
    onGetStarted: () -> Unit,
    onLogin: () -> Unit
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
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "✦",
                fontSize = 28.sp,
                color = VeloraColors.Sage
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceMD
                )
            )

            Text(
                text = "VELORA",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 5.sp
                ),
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXXL
                )
            )

            Text(
                text = "Illuminate your\ninner world.",
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceLG
                )
            )

            Text(
                text = "A gentle space to reflect, grow, manifest, and become.",
                style = MaterialTheme.typography.bodyLarge,
                color = VeloraColors.TextSecondary,
                textAlign = TextAlign.Center,
                modifier = Modifier.widthIn(max = 380.dp)
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceXXL
                )
            )

            VeloraButton(
                text = "Get Started",
                onClick = onGetStarted,
                modifier = Modifier.widthIn(max = 420.dp)
            )

            Spacer(
                modifier = Modifier.height(
                    VeloraDimensions.SpaceSM
                )
            )

            TextButton(
                onClick = onLogin
            ) {
                Text(
                    text = "I already have an account",
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}