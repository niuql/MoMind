plugins {
    kotlin("js")
}

group = "com.itmob"
version = "0.0.1"

repositories {
    jcenter()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        nodejs {

        }
    }
}