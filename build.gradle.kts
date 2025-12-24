plugins {
    id("org.jetbrains.intellij") version "1.17.3"
    kotlin("jvm") version "1.9.22"
}

intellij {
    type.set("PY")
    version.set("2025.3")
}

repositories {
    mavenCentral()
}

tasks.patchPluginXml {
    sinceBuild.set("253")
    untilBuild.set("253.*")
}

tasks.named("buildSearchableOptions") {
    enabled = false
}
