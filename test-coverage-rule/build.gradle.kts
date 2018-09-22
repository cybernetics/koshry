import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
  kotlin("jvm")
  id("java-library")
  id("maven-publish")
  jacoco
}

apply { from("../push.gradle") }

repositories {
  mavenLocal()
  jcenter()
  mavenCentral()
}

group = "io.github.tarek360.koshry.rules"
version = "0.0.1"

dependencies {
  implementation(kotlin("stdlib-jdk8"))
  implementation(project(":rules"))
  testImplementation(project(":rules-test"))
  testImplementation("junit:junit:4.12")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}