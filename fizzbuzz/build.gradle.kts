plugins {
  application
  id("io.freefair.lombok") version "8.0.1"
}

version = "1.1.0"

java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

repositories { mavenCentral() }

dependencies {
  implementation("org.slf4j:slf4j-api:2.0.7")
  implementation("ch.qos.logback:logback-core:1.4.7")
  implementation("ch.qos.logback:logback-classic:1.4.7")
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}

application { mainClass.set("mazeneko.fizzbuzz.App") }

tasks.withType<JavaCompile>().configureEach { options.encoding = "UTF-8" }

tasks.named<Test>("test") { useJUnitPlatform() }
