plugins {
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.3.5"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "org.hse"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    implementation("org.liquibase:liquibase-core")

    implementation("org.jetbrains.exposed:exposed-core:0.56.0")
    implementation("org.jetbrains.exposed:exposed-dao:0.56.0")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.56.0")
    implementation("org.jetbrains.exposed:exposed-kotlin-datetime:0.56.0")
//    implementation("org.jetbrains.exposed:exposed-java-time:0.56.0")
//    implementation("org.jetbrains.exposed:exposed-json:0.56.0")
//    implementation("org.jetbrains.exposed:exposed-money:0.56.0")
//    implementation("org.jetbrains.exposed:exposed-spring-boot-starter:0.56.0")

    implementation("org.postgresql:postgresql")

    implementation("javax.annotation:javax.annotation-api:1.3.2")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("com.h2database:h2")
//    testImplementation(kotlin("test"))
//    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
//    testImplementation("io.mockk:mockk:1.10.4")
//    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//    testImplementation("org.junit.jupiter:junit-jupiter-api")
//    testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.hse.WishlistApplication"
    }
}
