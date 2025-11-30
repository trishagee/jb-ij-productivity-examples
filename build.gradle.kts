plugins {
    java
    groovy
}

repositories {
    mavenCentral()
}

dependencies {
    // Spock test dependencies
    testImplementation("org.spockframework:spock-core:2.4-M1-groovy-4.0")
    implementation("org.apache.groovy:groovy:4.0.29")}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("6.0.1")
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

