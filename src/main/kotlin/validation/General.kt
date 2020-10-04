package validation

class General {
     public fun javaWorks(jdkLocation: String): Boolean {
         val result = JavaExecuter().run(jdkLocation + "java --Version")
         if(result != null && result.contains("openjdk version")) {
             return true
         }
         return false
     }
}