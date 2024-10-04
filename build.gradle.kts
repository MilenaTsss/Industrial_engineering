plugins {
    kotlin("jvm") version "1.9.23"
    id("com.palantir.docker") version "0.36.0"
}

group = "org.hse"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    testImplementation(kotlin("test"))
}

//tasks.test {
//    useJUnitPlatform()
//}
kotlin {
    jvmToolchain(19)
}