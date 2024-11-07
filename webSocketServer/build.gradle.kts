plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.3.4"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "org.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	// Web
	implementation("org.springframework.boot:spring-boot-starter-web")

	// Kafka
	implementation("org.springframework.kafka:spring-kafka")

	// WebSocket
	implementation("org.springframework.boot:spring-boot-starter-websocket")

	// Jackson (Kotlin module for JSON serialization/deserialization)
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

	// Kotlin Reflection
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	// Development tools
	developmentOnly("org.springframework.boot:spring-boot-devtools")

	// Test
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	// Kafka Test
	testImplementation("org.springframework.kafka:spring-kafka-test")
}


kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
