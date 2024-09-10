plugins {
  java
  id("org.springframework.boot") version "3.3.3"
  id("io.spring.dependency-management") version "1.1.6"
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
  }
}

repositories {
  mavenCentral()
}

dependencies {
  // Spring Boot dependencies
  // Project dependencies
  compileOnly("org.jetbrains:annotations:24.1.0")
  implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
  implementation("org.springframework.boot:spring-boot-starter-data-rest")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")

  // Database dependencies
  implementation("org.postgresql:postgresql:42.7.4")

  // Test dependencies
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
  testImplementation("io.projectreactor:reactor-test")
  testImplementation("org.springframework.boot:spring-boot-starter-test")

  annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
}

tasks.withType<Test> {
  useJUnitPlatform()
}
