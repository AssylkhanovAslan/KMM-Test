plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-parcelize")
}

android {
    namespace = "kz.mechta.seller.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "kz.mechta.seller.android"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.2.1")
    implementation("androidx.compose.ui:ui-tooling:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.1")
    implementation("androidx.compose.foundation:foundation:1.2.1")
    implementation("androidx.compose.material:material:1.2.1")
    implementation("androidx.activity:activity-compose:1.5.1")
    //Coil
    implementation("io.coil-kt:coil-compose:2.2.0")
    implementation("io.coil-kt:coil-svg:2.2.0")
    //Pager
    implementation("com.google.accompanist:accompanist-pager:0.25.1")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.25.1")

    // Koin main features for Android
    val koinAndroidVersion = "3.3.0"
    implementation("io.insert-koin:koin-android:$koinAndroidVersion")
    implementation("io.insert-koin:koin-androidx-compose:$koinAndroidVersion")
    // Java Compatibility
    implementation("io.insert-koin:koin-android-compat:$koinAndroidVersion")
    // Jetpack WorkManager
    implementation("io.insert-koin:koin-androidx-workmanager:$koinAndroidVersion")
    // Navigation Graph
    implementation("io.insert-koin:koin-androidx-navigation:$koinAndroidVersion")

    implementation("com.google.code.gson:gson:2.10")
}