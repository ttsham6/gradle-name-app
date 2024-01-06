plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Use JUnit test framework.
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:32.0.0-android")

    compileOnly("org.projectlombok:lombok")
}

application {
    mainClass.set("gradle.name.app.App")
}

tasks.withType<Test>{
    useJUnitPlatform()
    testLogging {
     events("started", "skipped", "passed", "failed")
   }
}