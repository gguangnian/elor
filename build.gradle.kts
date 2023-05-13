val junit4Version by extra("4.12")

plugins {
    java
    id("org.springframework.boot") version "2.1.7.RELEASE"
}
apply(plugin = "io.spring.dependency-management")
group = "com.github.gguangnian"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.springframework:spring-expression")
    testImplementation("junit", "junit")
    testImplementation("org.springframework:spring-expression")
    constraints {
        testImplementation("junit", "junit", "$junit4Version")
    }
}
configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}