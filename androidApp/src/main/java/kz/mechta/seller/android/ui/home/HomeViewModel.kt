package kz.mechta.seller.android.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kz.mechta.seller.HomeRepository
import kz.mechta.seller.data.BannerModel


class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {

    private val _banners = MutableStateFlow<List<BannerModel>>(emptyList())
    val banners: StateFlow<List<BannerModel>> = _banners

    init {
        loadBanners()
    }

    fun loadBanners() {
        viewModelScope.launch {
            val banners = homeRepository.getBaseResponse()
            _banners.emit(banners.data)
            println(Json.encodeToString(banners))
        }
    }

}