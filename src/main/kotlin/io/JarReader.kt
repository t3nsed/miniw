package io

import java.nio.file.Files
import java.nio.file.Path

class JarReader {
    public fun read() {
        Files.readAllLines(Path.of())
    }
}