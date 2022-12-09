package kz.mechta.seller

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*


const val BASE_URL = "https://www.mechta.kz"

class HomeRepository(private val httpClient: HttpClient) {

    suspend fun getBanners(): String {
        val response = httpClient.get("$BASE_URL/api/v1/main-page/banners")
        val responseBodyString: String = response.body()
        return responseBodyString
    }
}