import java.util.*

class RandomNumberGenerator : NumberGenerator() {
    private val random = Random() // ���������@

    // �����擾����
    override var number // ���݂̐� = 0
        private set

    override fun execute() {
        for (i in 0..19) {
            number = random.nextInt(50)
            notifyObservers()
        }
    }
}