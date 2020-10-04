package io

import execute.Process

class ProjectStructureCreator {
    val processor = Process()

    fun init(projectName : String): String {
        supportedOS()
        mkdir(projectName)
        mkdir("$projectName/src")
        touch("$projectName/miniw.src")
        return pwd() + "/$projectName"
    }

    fun supportedOS() {
        if(processor.createAndReturn("uname") != "linux") {
            Application.logger.warn() { "Unsupported OS. BSD/MacOS will most certainly still work, but windows won't"}
        }
    }


    private fun mkdir(dirName : String): Boolean {
        return processor.create("mkdir $dirName")
    }

    private fun touch(fileName : String): Boolean {
         return processor.create("touch $fileName")
    }

    private fun pwd(): String {
        return processor.createAndReturn("pwd")
    }
}