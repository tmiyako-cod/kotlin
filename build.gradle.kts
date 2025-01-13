plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
    // reflectを使うための依存関係
    implementation(kotlin("reflect"))
    // Project Reactorを使うための依存関係
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.1.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}