import java.util.*

abstract class NumberGenerator {
    private val observers: ArrayList<*> = ArrayList<Any?>() // Observer������ێ�
    fun addObserver(observer: Observer?) {    // Observer��ǉ�
        observers.add(observer)
    }

    fun deleteObserver(observer: Observer?) { // Observer���폜
        observers.remove(observer)
    }

    fun notifyObservers() {               // Observer�֒ʒm
        val it: Iterator<*> = observers.iterator()
        while (it.hasNext()) {
            val o = it.next() as Observer
            o.update(this)
        }
    }

    // �����擾����
    abstract val number: Int
    abstract fun execute() // ���𐶐�����
}