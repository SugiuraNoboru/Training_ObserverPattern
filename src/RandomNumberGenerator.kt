import java.util.*

class RandomNumberGenerator : NumberGenerator() {
    private val random = Random() // —”¶¬‹@

    // ”‚ğæ“¾‚·‚é
    override var number // Œ»İ‚Ì” = 0
        private set

    override fun execute() {
        for (i in 0..19) {
            number = random.nextInt(50)
            notifyObservers()
        }
    }
}