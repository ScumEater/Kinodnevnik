# Кинодневник для Android

Android WebView-приложение с упакованным кинотрекером. Библиотека хранится локально в IndexedDB; данные из прежнего localStorage автоматически переносятся при запуске. Если IndexedDB недоступна, приложение использует localStorage. В APK включён список из `UliyanaFIlms.json`: он импортируется при первом запуске, если база приложения ещё пуста.

## Сборка

Откройте `android-app` в Android Studio и соберите APK через **Build → Build APK(s)**. Либо из этой папки выполните `gradle assembleDebug`. APK будет создан в `app/build/outputs/apk/debug/app-debug.apk`.

Требуются JDK 17 и Android SDK Platform 35.
