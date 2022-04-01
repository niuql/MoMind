import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.1.1"
    id("com.android.library")
}

group = "com.itmob"
version = "1.0.0"

kotlin {
    android()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val commonMain by getting {
            @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.materialIconsExtended)
                implementation("androidx.compose.ui:ui:1.2.0-alpha03")
                implementation("androidx.compose.ui:ui-graphics:1.1.0")
            }
        }

        val androidMain by getting {
            dependencies {
            }
        }

        val desktopMain by getting {
            dependencies {
            }
        }
    }
}

android {
    compileSdk = 31
    sourceSets.named("main") {
        manifest.srcFile("src/androidMain/AndroidManifest.xml")
        res.srcDirs("src/commonMain/resources")
    }
    defaultConfig {
        minSdk = 21
        targetSdk =31
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
