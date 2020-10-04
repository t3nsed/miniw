import com.xenomachina.argparser.ArgParser
import com.xenomachina.argparser.mainBody
import io.ProjectStructureCreator
import mu.KLogging
import parser.MiniArgParser

class Application {
    companion object: KLogging()

    fun main(args: Array<String>) = mainBody {
        logger.info() { "Starting miniw..." }
        val parsedArgs = ArgParser(args).parseInto(::MiniArgParser).run {
            var projectLocation = "";

            if("$init" = )

            projectLocation = ProjectStructureCreator().init(parsedArgs.init.toString())
        }



    }
}


