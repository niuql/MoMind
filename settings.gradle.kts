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


include(":apps:androidApp")
include(":apps:desktopApp")
include(":apps:browserApp")
include(":compose-ui")

