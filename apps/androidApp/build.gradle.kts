plugins {
    id("org.jetbrains.compose") version "1.1.1"
    id("com.android.application")
    kotlin("android")
}

group = "com.itmob"
version = "0.0.1"

repositories {
    google()
    jcenter()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(project(":compose-ui"))
    implementation("androidx.activity:activity-compose:1.4.0")
}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.itmob.androidApp"
        minSdkVersion(24)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}