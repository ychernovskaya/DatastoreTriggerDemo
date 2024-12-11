plugins {
    kotlin("jvm") version "2.0.0"
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    implementation("com.google.cloud.functions:functions-framework-api:1.1.4")
    implementation("io.cloudevents:cloudevents-api:2.0.0")
    implementation("com.google.protobuf:protobuf-java:3.21.12")
    implementation(kotlin("stdlib"))
    implementation("com.google.cloud:google-cloudevent-types:0.16.0")
}