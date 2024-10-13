plugins {
    kotlin("jvm") version "1.9.23"
    application
}

group = "org.hse"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("org.hse.MainKt")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.hse.MainKt"
    }
}
