package kz.mechta.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import kz.mechta.seller.android.ui.theme.CustomTypography
import kz.mechta.seller.android.ui.theme.LocalCustomTypography
import kz.mechta.seller.android.ui.theme.getTypography

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MechtaTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalCustomColors provides getColors(isDark),
        LocalCustomTypography provides getTypography(isDark),
    ) {
        MaterialTheme(
            content = content,
            colors = if (isDark)
                lightColors(primary = MechtaTheme.colors.brand01)
            else
                lightColors(primary = MechtaTheme.colors.brand01)
        )
    }
}

object MechtaTheme {
    val colors: CustomColors
        @Composable
        get() = LocalCustomColors.current
    val typography: CustomTypography
        @Composable
        get() = LocalCustomTypography.current
}