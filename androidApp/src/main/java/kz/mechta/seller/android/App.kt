package kz.mechta.seller.android

import android.app.Application
import kz.mechta.seller.android.di.viewModelModule
import kz.mechta.seller.di.networkModule
import kz.mechta.seller.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(viewModelModule, networkModule, repositoryModule)
        }
    }
}