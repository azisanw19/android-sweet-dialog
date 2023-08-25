plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.can.sweetdialog"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("com.intuit.sdp:sdp-android:1.1.0")
    implementation("com.airbnb.android:lottie:6.1.0")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                pom {
                    name.set("Sweet Dialog")
                    description.set("Sweet Dialog")
                    url.set("https://github.com/azisanw19/android-sweet-dialog")

                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("https://github.com/azisanw19/android-sweet-dialog/blob/main/LICENSE.txt")
                        }
                    }
                    developers {
                        developer {
                            id.set("azisanw19")
                            name.set("Aziz Anwar")
                            email.set("azisanw19@gmail.com")
                        }
                    }
                }

                from(components.findByName("release"))

                groupId = "com.github.azisanw19"
                artifactId = "sweetdialog"
                version = "0.0.1-alpha14"


            }
        }
    }
}
