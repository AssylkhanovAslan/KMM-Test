package kz.mechta.seller.android.ui.home

import androidx.compose.runtime.Composable
import kz.mechta.seller.android.ui.views.BannersHorizontalPager

@Composable
fun HomePage() {
//    val bannersLoading = uiState.bannersLoading.value
//    if (bannersList.isNotEmpty() || bannersLoading) {


    BannersHorizontalPager(
        banners = emptyList(),
        onBannerClick = { },
        showAsPlaceholder = false
    )
}
