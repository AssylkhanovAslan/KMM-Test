package kz.mechta.seller.android.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kz.mechta.seller.HomeRepository
import kz.mechta.seller.data.BannerModel
import kz.mechta.seller.data.BaseResponse


class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {

    private val _banners = MutableStateFlow<List<BannerModel>>(emptyList())
    val banners: StateFlow<List<BannerModel>> = _banners

    init {
        loadBanners()
    }

    fun loadBanners() {
        viewModelScope.launch {
            val bannersJson = homeRepository.getBanners()
            val type = object : TypeToken<BaseResponse<List<BannerModel>?>?>() {}.type
            val banners: BaseResponse<List<BannerModel>> =Gson().fromJson(bannersJson, type)
            _banners.emit(banners.data)
        }
    }

}