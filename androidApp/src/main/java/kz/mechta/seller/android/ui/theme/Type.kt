package kz.mechta.seller.android.ui.theme


import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import kz.mechta.seller.android.R

private val Tahoma = FontFamily(
    Font(R.font.tahoma_regular),
    Font(R.font.tahoma_bold, FontWeight.Bold),
)

fun getTypography(isDark: Boolean) : CustomTypography {
    return CustomTypography(

        h1 = TextStyle(
            fontFamily = Tahoma,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            lineHeight = 29.sp
        ),
        h2 = TextStyle(
            fontFamily = Tahoma,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            lineHeight = 21.sp
        ),
        h3 = TextStyle(
            fontFamily = Tahoma,
            fontSize = 18.sp,
            lineHeight = 19.sp
        ),
        h4 = TextStyle(
            fontFamily = Tahoma,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 19.sp
        ),
        h5 = TextStyle(
            fontFamily = Tahoma,
            fontWeight = FontWeight.Bold,
            fontSize = 10.sp,
            lineHeight = 13.sp
        ),
        button = TextStyle(
            fontFamily = Tahoma,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            lineHeight = 17.sp
        ),
        body1 = TextStyle(
            fontFamily = Tahoma,
            fontSize = 16.sp,
            lineHeight = 23.sp
        ),
        body2 = TextStyle(
            fontFamily = Tahoma,
            fontSize = 14.sp,
            lineHeight = 19.sp
        ),
        subtitle1 = TextStyle(
            fontFamily = Tahoma,
            fontSize = 14.sp,
            lineHeight = 19.sp
        ),
        subtitle2 = TextStyle(
            fontFamily = Tahoma,
            fontSize = 12.sp,
            lineHeight = 16.sp
        ),
        oldPrice = TextStyle(
            fontFamily = Tahoma,
            fontSize = 12.sp,
            textDecoration = TextDecoration.LineThrough,
            lineHeight = 16.sp
        ),
        tagline = TextStyle(
            fontFamily = Tahoma,
            fontWeight = FontWeight.Bold,
            fontSize = 10.sp,
            lineHeight = 14.sp
        ),
        caption = TextStyle(
            fontFamily = Tahoma,
            fontSize = 10.sp,
            lineHeight = 14.sp
        ),
    )
}

@Immutable
data class CustomTypography(
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val h4: TextStyle,
    val h5: TextStyle,
    val button: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val subtitle1: TextStyle,
    val subtitle2: TextStyle,
    val oldPrice: TextStyle,
    val tagline: TextStyle,
    val caption: TextStyle,
)

val LocalCustomTypography = staticCompositionLocalOf {
    CustomTypography(
        h1 = TextStyle.Default,
        h2 = TextStyle.Default,
        h3 = TextStyle.Default,
        h4 = TextStyle.Default,
        h5 = TextStyle.Default,
        button = TextStyle.Default,
        body1 = TextStyle.Default,
        body2 = TextStyle.Default,
        subtitle1 = TextStyle.Default,
        subtitle2 = TextStyle.Default,
        oldPrice = TextStyle.Default,
        tagline = TextStyle.Default,
        caption = TextStyle.Default,
    )
}