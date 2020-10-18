package io

import java.nio.file.Files
import java.nio.file.Path

class JarReader(private val location: Path) {
    public fun read() {
        val potentialImports = Files.readAllLines(location)
    }
}