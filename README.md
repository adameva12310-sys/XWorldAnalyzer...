# XWorld Analyzer (Android source project)

This Android Studio project captures the screen only after the user explicitly approves Android's MediaProjection prompt, then runs on-device ML Kit OCR and displays recognized text. The user manually records wins/losses; the app calculates the observed win rate. It does not log into X World, bypass protections, automate bets, or predict future outcomes.

## Build an APK
1. Install Android Studio on a computer and Android SDK Platform 35.
2. Open this folder (`XWorldAnalyzer`) in Android Studio.
3. Allow Gradle sync and wait for dependencies to download.
4. Select **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
5. Install the generated `app-debug.apk` on the Android phone.

A prebuilt APK is not included because this environment does not have the Android SDK/Gradle build toolchain installed.
