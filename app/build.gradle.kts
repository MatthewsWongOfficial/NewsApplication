plugins {
    kotlin("android") version "1.6.10"
    kotlin("kapt") version "1.6.10"
}

android {
    compileSdkVersion(31)

    defaultConfig {
        applicationId = "com.matthewswong.mandirinews"
        minSdkVersion(16)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.10")
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")
    implementation("androidx.room:room-runtime:2.4.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")
    kapt("androidx.room:room-compiler:2.4.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("com.google.dagger:dagger:2.40.5")
    kapt("com.google.dagger:dagger-compiler:2.40.5")
}

kapt {
    correctErrorTypes = true
}

android {
    buildFeatures {
        viewBinding = true
    }
}

kotlin {
    android {
        experimental {
            coroutines "enable"
        }
    }
}

// Add your custom configurations or tasks here if needed
