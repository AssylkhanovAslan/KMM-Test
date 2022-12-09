package kz.mechta.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

fun getColors(isDark: Boolean) : CustomColors {
    return CustomColors(
        brand01 = if (isDark) Color(0xFFE61771) else Color(0xFFE61771),
        brand02 = if (isDark) Color(0xFF394F62) else Color(0xFF394F62),
        ui01 = if (isDark) Color(0xFFFFFFFF) else Color(0xFFFFFFFF),
        ui02 = if (isDark) Color(0xFFF7F7F7) else Color(0xFFF7F7F7),
        ui03 = if (isDark) Color(0xFFEDEDEF) else Color(0xFFEDEDEF),
        ui04 = if (isDark) Color(0xFFE3E2E7) else Color(0xFFE3E2E7),
        ui05 = if (isDark) Color(0xFFC0BDCB) else Color(0xFFC0BDCB),
        text01 = if (isDark) Color(0xFF332D40) else Color(0xFF332D40),
        text02 = if (isDark) Color(0xFF979797) else Color(0xFF979797),
        links = if (isDark) Color(0xFF0075CD) else Color(0xFF0075CD),
        support01 = if (isDark) Color(0xFFEC0000) else Color(0xFFEC0000),
        support02 = if (isDark) Color(0xFF0F991B) else Color(0xFF0F991B),
        support03 = if (isDark) Color(0xFF39C2C9) else Color(0xFF39C2C9),
        support04 = if (isDark) Color(0xFFFFD400) else Color(0xFFFFD400),
        support05 = if (isDark) Color(0xFFB20087) else Color(0xFFB20087),
    )
}

@Immutable
data class CustomColors(
    val brand01: Color,
    val brand02: Color,
    val ui01: Color,
    val ui02: Color,
    val ui03: Color,
    val ui04: Color,
    val ui05: Color,
    val text01: Color,
    val text02: Color,
    val links: Color,
    val support01: Color,
    val support02: Color,
    val support03: Color,
    val support04: Color,
    val support05: Color,
)

val LocalCustomColors = staticCompositionLocalOf {
    CustomColors(
        brand01 = Color.Unspecified,
        brand02 = Color.Unspecified,
        ui01 = Color.Unspecified,
        ui02 = Color.Unspecified,
        ui03 = Color.Unspecified,
        ui04 = Color.Unspecified,
        ui05 = Color.Unspecified,
        text01 = Color.Unspecified,
        text02 = Color.Unspecified,
        links = Color.Unspecified,
        support01 = Color.Unspecified,
        support02 = Color.Unspecified,
        support03 = Color.Unspecified,
        support04 = Color.Unspecified,
        support05 = Color.Unspecified,
    )
}