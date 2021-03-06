import java.util.*

class RandomNumberGenerator : NumberGenerator() {
    private val random = Random() // 乱数生成機

    // 数を取得する
    override var number // 現在の数 = 0
        private set

    override fun execute() {
        for (i in 0..19) {
            number = random.nextInt(50)
            notifyObservers()
        }
    }
}