buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.android.tools.build:gradle:4.1.3")
    }
}

group = "com.itmob"
version = "0.0.1"

allprojects {
    repositories {
        mavenCentral()
    }
}