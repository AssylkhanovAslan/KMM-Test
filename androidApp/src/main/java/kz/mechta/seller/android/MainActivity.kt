package kz.mechta.seller.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import kz.mechta.seller.android.ui.home.HomeViewModel
import kz.mechta.seller.android.ui.views.BannersHorizontalPager
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(homeViewModel: HomeViewModel = koinViewModel()) {
    val banners = homeViewModel.banners.collectAsState()
    BannersHorizontalPager(banners = banners.value, onBannerClick = { })
}
