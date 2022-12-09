package kz.mechta.seller.android.di

import kz.mechta.seller.Greeting
import org.koin.dsl.module


val testModule = module {
    factory { Greeting() }
}