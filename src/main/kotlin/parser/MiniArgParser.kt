package parser

import com.xenomachina.argparser.ArgParser
import com.xenomachina.argparser.default

class MiniArgParser(parser: ArgParser) {
    val jdk by parser.storing("-j", "--jdk", help = "set non-default jdk location")
            .default(System.getProperty("java.home"))
    val init by parser.storing("-i", "--init", help = "setup a new project directory")
            .default("NO_INIT")
    val build by parser.flagging("-b", "--build", help = "build the project")
    val run by parser.flagging("-r", "--run", help = "run the project")
}