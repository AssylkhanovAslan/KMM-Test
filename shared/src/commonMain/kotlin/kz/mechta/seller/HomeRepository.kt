package kz.mechta.seller

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kz.mechta.seller.data.BannerModel
import kz.mechta.seller.data.BaseResponse


const val BASE_URL = "https://www.mechta.kz"

class HomeRepository(private val httpClient: HttpClient) {

    suspend fun getBanners(): BaseResponse<List<BannerModel>> {
        val response = httpClient.get("$BASE_URL/api/v1/main-page/banners")
        return response.body()
    }
}