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
        versionCode = 12
        versionName = "1.11"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
