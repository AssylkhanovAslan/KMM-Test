package kz.mechta.seller.di

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import org.koin.dsl.module

val networkModule = module {
    factory { HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                ignoreUnknownKeys = true
                isLenient = true
                @OptIn(ExperimentalSerializationApi::class)
                explicitNulls = false
                useArrayPolymorphism = true
                useAlternativeNames = true
            })
        }
    } }
}