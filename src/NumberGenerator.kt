import java.util.*

abstract class NumberGenerator {
    private val observers: ArrayList<*> = ArrayList<Any?>() // Observer‚½‚¿‚ğ•Û
    fun addObserver(observer: Observer?) {    // Observer‚ğ’Ç‰Á
        observers.add(observer)
    }

    fun deleteObserver(observer: Observer?) { // Observer‚ğíœ
        observers.remove(observer)
    }

    fun notifyObservers() {               // Observer‚Ö’Ê’m
        val it: Iterator<*> = observers.iterator()
        while (it.hasNext()) {
            val o = it.next() as Observer
            o.update(this)
        }
    }

    // ”‚ğæ“¾‚·‚é
    abstract val number: Int
    abstract fun execute() // ”‚ğ¶¬‚·‚é
}