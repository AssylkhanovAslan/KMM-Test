package kz.mechta.seller

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*

class Api {
    val client = HttpClient(CIO)

    suspend fun getHleb(): String {
        val response = client.get("https://www.mechta.kz/api/v1/main-page/banners")
        val body = response.body<String>()
        println("Response = ${response.status}, Body = $body")
        return body
    }
}