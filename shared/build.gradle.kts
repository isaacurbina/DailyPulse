plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
	kotlin("plugin.serialization") version "1.9.20"
	alias(libs.plugins.sqlDelight)
	alias(libs.plugins.composeMultiplatformPlugin)
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
				implementation(compose.runtime)
				implementation(compose.foundation)
				implementation(compose.components.resources)
				implementation(compose.material3)
				implementation(libs.compose.material)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
    }
}

android {
    namespace = "com.petros.efthymiou.dailypulse"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}
