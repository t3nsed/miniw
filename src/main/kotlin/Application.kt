import com.xenomachina.argparser.ArgParser
import io.ProjectStructureCreator
import mu.KLogging
import parser.MiniArgParser
import validation.Validator

class Application {
    companion object : KLogging()

    fun main(args: Array<String>) {
        logger.info() { "Starting miniw..." }
        runWith(args)
    }

    private fun runWith(args: Array<String>): Boolean {
        val config = ArgParser(args).parseInto(::MiniArgParser).run {
            // TODO: if 'init' -> create structure
            // else if 'build' -> fetch dependencies, start java
            if (!Validator().javaWorks(jdk)) {
                logger.error() { "Couldn't evaluate where the jdk is; make sure you either have a " +
                        "valid jdk in \$JAVA_HOME or specified it in the args with --jdk <jdk>" }
                return false
            }
            if (!init.equals("NO_INIT")) {
                ProjectStructureCreator().init(init)
                return true
            }
            if (run) {
                // build and run
                return true
            }
            if (build) {
                // only build
                return true
            }
        }
        return true
    }
}


