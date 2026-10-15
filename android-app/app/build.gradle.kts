plugins {
    id("com.android.application")
}

android {
    namespace = "ru.nick.kinodnevnik"
    compileSdk = 35

    defaultConfig {
        applicationId = "ru.nick.kinodnevnik"
        minSdk = 24
        targetSdk = 35
        versionCode = 11
        versionName = "1.10"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
