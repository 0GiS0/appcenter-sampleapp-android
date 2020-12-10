#Compilamos con gradle la aplicación
./gradlew assembleDebug #Compilar un APK de depuración - https://developer.android.com/studio/build/building-cmdline?hl=es-419#DebugMode
./gradlew assembleDebugAndroidTest #Compilar un APK 


    appcenter test run espresso --app "giselat/SampleApp-Android" --devices "giselat/google-phones" \
    --app-path /Users/gis/Dev/appcenter-sampleapp-android/app/build/outputs/apk/debug/app-debug.apk \
    --build-dir /Users/gis/Dev/appcenter-sampleapp-android/app/build/outputs/apk/androidTest/debug \
    --test-series "imac" --locale "en_US" --debug
