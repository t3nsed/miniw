package validation

import execute.Process

class General {
    public fun javaWorks(jdkLocation: String): Boolean {
        val result = Process().createAndReturn(jdkLocation + "java --Version")
        if (result.isBlank() && result.contains("openjdk version")) {
            return true
        }
        return false
    }
}