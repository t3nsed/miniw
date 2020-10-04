package execute

import com.google.common.io.CharStreams
import java.io.InputStreamReader

class JavaProcess : Process() {

    public override fun createAndReturn(line: String): String {
        return super.createAndReturn("java $line")
    }
}