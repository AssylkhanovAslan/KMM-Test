package kz.mechta.seller.di

import kz.mechta.seller.HomeRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { HomeRepository(get()) }
}