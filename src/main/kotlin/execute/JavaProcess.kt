package execute

class JavaProcess : Process() {

    public override fun createAndReturn(command: String): String {
        return super.createAndReturn("java $command")
    }

    public override fun create(command: String): Boolean {
        return super.create("java $command")
    }
}