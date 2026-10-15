# Кинодневник

Личный трекер просмотренных фильмов: автономная веб-версия и Android-приложение на WebView.

## Скачать

- [Android APK 1.10](https://github.com/ScumEater/Kinodnevnik/releases/download/v1.10/Kinodnevnik-1.10.apk)
- [Исходный проект (ZIP)](https://github.com/ScumEater/Kinodnevnik/raw/refs/heads/main/Kinodnevnik-project.zip)

## Веб-версия

Файл `movie_tracker.html` работает в современном браузере. Фильмы сохраняются локально: используется IndexedDB с резервным переходом на `localStorage`. Для переноса библиотеки между браузерами используйте JSON-экспорт и импорт.

## Android

Исходники находятся в `android-app/`. Откройте папку в Android Studio и выполните **Build → Build APK(s)**. Для сборки нужны JDK 17 и Android SDK Platform 35. Минимальная версия Android — 7.0 (API 24); текущая версия приложения — 1.10.

Android-приложение хранит библиотеку в IndexedDB внутри WebView и переносит прежние данные из `localStorage`. При первом запуске начальный список импортируется из `android-app/app/src/main/assets/UliyanaFIlms.json`.

## Данные библиотеки

Файл `movie-library.json` и стартовая копия `UliyanaFIlms.json` содержат коллекцию фильмов, опубликованную вместе с проектом. Её можно использовать для примера импорта или заменить своей копией. Изменения пользователя сохраняются локально на устройстве.
