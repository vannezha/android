plugins {
    kotlin("jvm") version "1.6.21"
    java
}

group = "com.vanny.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.21")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}