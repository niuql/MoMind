pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    
}
rootProject.name = "MobMind"


include(":androidApp")
include(":desktopApp")
include(":common")
include(":browserApp")
include(":nodejsApp")

