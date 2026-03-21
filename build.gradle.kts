plugins {
    java
    id("com.gradleup.shadow") version "8.3.6"
}

group = "com.potetogroove"
version = "1.0.0-SNAPSHOT"
description = "PG-economy"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.release = 21
    }

    shadowJar {
        archiveClassifier = ""
    }

    build {
        dependsOn(shadowJar)
    }
}
