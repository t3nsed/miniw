import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "nil"
version = "0.0.1"

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.slf4j:slf4j-simple:1.7.29")
    implementation("io.github.microutils:kotlin-logging:1.12.0")
    implementation("com.xenomachina:kotlin-argparser:2.0.7")
    implementation("com.google.guava:guava:29.0-jre")
    testImplementation(kotlin("test-junit5"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}