# Кинодневник

Личный трекер просмотренных фильмов: автономная веб-версия и Android-приложение на WebView.

## Скачать Android-приложение

[Скачать Kinodnevnik 1.11 APK](https://github.com/ScumEater/Kinodnevnik/releases/latest)

APK собирается GitHub Actions и прикрепляется к релизу `v1.11`.

## Веб-версия

Откройте `movie_tracker.html` в современном браузере. Фильмы сохраняются локально в браузере: используется IndexedDB с резервным переходом на `localStorage`. При переносе в другой браузер экспортируйте библиотеку в JSON и импортируйте её там.

## Android

Исходный проект находится в `android-app/`. Откройте эту папку в Android Studio и соберите APK через **Build → Build APK(s)**. Для сборки нужны JDK 17 и Android SDK Platform 35. Параметры приложения: `ru.nick.kinodnevnik`, минимальная версия Android — 7.0 (API 24), версия — 1.11.

Android-приложение хранит библиотеку в IndexedDB внутри WebView и переносит прежние данные из `localStorage`. Для нового пользователя начальный список импортируется из `android-app/app/src/main/assets/UliyanaFIlms.json`.

## Данные библиотеки

`movie-library.json` и `android-app/app/src/main/assets/UliyanaFIlms.json` содержат опубликованную вместе с проектом коллекцию фильмов. При желании используйте её как пример импорта или замените своей копией. Собственные изменения в приложении сохраняются на устройстве.
