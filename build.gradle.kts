val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    application
    kotlin("jvm") version "1.5.21"
                id("org.jetbrains.kotlin.plugin.serialization") version "1.5.21"
}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("com.example.ApplicationKt")
}

repositories {
    mavenCentral()
    mavenLocal()

}

dependencies {
    implementation("io.ktor:ktor-serialization:$ktor_version")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-gson:$ktor_version")
    implementation("io.ktor:ktor-auth-jwt:$ktor_version")
    implementation("io.ktor:ktor-auth:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlin_version")

    // Ktor Client
    implementation ("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("io.ktor:ktor-client-serialization:$ktor_version")
    implementation ("io.ktor:ktor-client-gson:$ktor_version")
    implementation ("io.ktor:ktor-client-jackson:$ktor_version")

    // database
//    compile ("org.jetbrains.exposed:exposed:0.12.1")
//    compile 'com.zaxxer:HikariCP:2.7.8'
//    compile "org.postgresql:postgresql:42.2.2"
    implementation("org.jetbrains.exposed:exposed-core:0.32.1")
//    implementation("org.jetbrains.exposed:exposed:0.17.9")
    implementation("com.zaxxer:HikariCP:2.3.13")
    implementation("org.postgresql:postgresql:42.2.23")
    runtimeOnly("org.jetbrains.exposed:exposed-jdbc:0.32.1")
}