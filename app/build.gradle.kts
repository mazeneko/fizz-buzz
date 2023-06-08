plugins {
  application
  id("io.freefair.lombok") version "8.0.1"
}

java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

repositories { mavenCentral() }

dependencies { testImplementation("org.junit.jupiter:junit-jupiter:5.9.1") }

application { mainClass.set("mazeneko.fizzbuzz.App") }

tasks.withType<JavaCompile>().configureEach { options.encoding = "UTF-8" }

tasks.named<Test>("test") { useJUnitPlatform() }
