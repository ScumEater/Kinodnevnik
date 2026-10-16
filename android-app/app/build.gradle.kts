plugins {
    id("com.android.application")
}

android {
    namespace = "ru.nick.kinodnevnik"
    compileSdk = 35
    buildToolsVersion = "35.0.1"

    defaultConfig {
        applicationId = "ru.nick.kinodnevnik"
        minSdk = 24
        targetSdk = 35
        versionCode = 13
        versionName = "1.12"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

