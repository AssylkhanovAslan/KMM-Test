package kz.mechta.seller.android.di

import kz.mechta.seller.android.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel

import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}