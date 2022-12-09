package kz.mechta.seller.android.ui.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kz.mechta.seller.PLACEHOLDERS_COUNT
import kz.mechta.seller.data.BannerModel
import kz.mechta.seller.data.emptyBannerModel


@OptIn(ExperimentalPagerApi::class)
@Composable
fun BannersHorizontalPager(
    banners: List<BannerModel>,
    onBannerClick: () -> Unit,
    showAsPlaceholder: Boolean = false,
) {

    val bannersToShow = if (showAsPlaceholder) {
        MutableList(PLACEHOLDERS_COUNT) { emptyBannerModel() }
    } else {
        banners
    }

    val pagerState = rememberPagerState()

    HorizontalPager(
        modifier = Modifier.fillMaxWidth(),
        state = pagerState,
        count = bannersToShow.size, contentPadding = PaddingValues(start = 16.dp, end = 40.dp),
        itemSpacing = 16.dp,
    ) { index ->
        BannerListItem(
            bannerModel = bannersToShow[index],
            onBannerClick = { },
            showAsPlaceholder = showAsPlaceholder,
        )
    }
}

@Composable
fun BannerListItem(
    bannerModel: BannerModel,
    onBannerClick: (BannerModel) -> Unit,
    showAsPlaceholder: Boolean = false,
) {
    MechtaImageView(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(2.1f, true)
            .clip(RoundedCornerShape(8.dp))
            .clickable {
                if (!bannerModel.url.isNullOrBlank()) {
                    onBannerClick(bannerModel)
                }
            },
        model = bannerModel.images.mobile,
    )
}