package execute

import com.google.common.io.CharStreams
import exceptions.ProjectStructureCreatorException
import java.io.InputStreamReader


open class Process {
    public open fun create(command : String): Boolean {
        val processBuilder = ProcessBuilder("bash", "-c", command)
        val process = processBuilder.start()

        if(process != null) {
            return true
        }
        Application.logger.error { "couldn't get process '$command' to start" }
        throw ProjectStructureCreatorException()
    }

    public open fun createAndReturn(command: String): String {
        val processBuilder = ProcessBuilder("bash", "-c", command)
        val process = processBuilder.start()

        val potentialReturn = CharStreams.toString(InputStreamReader(process.inputStream))

        if(potentialReturn != null) {
            return potentialReturn
        } else {
            Application.logger.warn { "process '$command' did not return a value, but was expected to do so" }
            return ""
        }
    }
}