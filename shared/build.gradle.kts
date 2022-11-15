plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {
    android()
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    val ktorVersion = "2.1.3"
    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-core:$ktorVersion")
                implementation("io.ktor:ktor-client-cio:$ktorVersion")

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
            }
        }
        val androidMain by getting
        val iosMain by creating {
            dependsOn(commonMain)
        }
    }
}

android {
    namespace = "kz.mechta.seller"
    compileSdk = 33
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
}