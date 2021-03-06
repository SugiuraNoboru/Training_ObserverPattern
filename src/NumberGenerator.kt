import java.util.*

abstract class NumberGenerator {
    private val observers: ArrayList<*> = ArrayList<Any?>() // Observerたちを保持
    fun addObserver(observer: Observer?) {    // Observerを追加
        observers.add(observer)
    }

    fun deleteObserver(observer: Observer?) { // Observerを削除
        observers.remove(observer)
    }

    fun notifyObservers() {               // Observerへ通知
        val it: Iterator<*> = observers.iterator()
        while (it.hasNext()) {
            val o = it.next() as Observer
            o.update(this)
        }
    }

    // 数を取得する
    abstract val number: Int
    abstract fun execute() // 数を生成する
}