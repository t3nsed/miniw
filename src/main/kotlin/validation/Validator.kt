package validation

import execute.Process

class Validator {
    fun javaWorks(jdkLocation: String): Boolean {
        if (jdkLocation.isBlank()) {
            val javaHome = System.getenv("JAVA_HOME")
            if (javaHome.isBlank()) {
                return false
            }
            return javaWorks(javaHome)
        }
        val result = Process().createAndReturn(jdkLocation + "java --Version")
        if (result.isBlank() && result.contains("openjdk version")) {
            return true
        }
        return false
    }
}