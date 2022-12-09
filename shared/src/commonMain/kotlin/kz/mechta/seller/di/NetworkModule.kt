package kz.mechta.seller.di

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import org.koin.dsl.module

val networkModule = module {
    factory { HttpClient(CIO) {
        install(ContentNegotiation) {

        }
    } }
}