plugins {
    id( "java-library")
}

repositories {
    mavenCentral()
}

dependencies {
    api( "org.reactivestreams:reactive-streams:1.0.4")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}