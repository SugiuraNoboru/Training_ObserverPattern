class DigitObserver : Observer {
    override fun update(generator: NumberGenerator) {
        println("DigitObserver:" + generator.number)
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
        }
    }
}