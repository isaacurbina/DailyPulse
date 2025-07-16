plugins {
	alias(libs.plugins.kotlinMultiplatform)
	alias(libs.plugins.composeMultiplatformPlugin)
}

kotlin {
	jvm {
		withJava()
	}

	sourceSets {
		named("jvmMain") {
			dependencies {
				implementation(compose.desktop.currentOs)
				implementation(libs.koin.core)
				implementation(projects.shared)
			}
		}
	}
}
