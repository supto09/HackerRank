package problemsolving.algorithms.strings

import java.util.*

// Complete the makingAnagrams function below.
fun makingAnagrams(a: String, b: String): Int {
    val s1counter = mutableMapOf<Char, Int>()
    for (c in a) {
        val oldCount = s1counter[c] ?: 0
        val newCount = oldCount + 1
        s1counter[c] = newCount
    }

    for (c in b) {
        val oldCount = s1counter[c] ?: 0
        val newCount = oldCount - 1
        s1counter[c] = newCount
    }

    var count = 0
    s1counter.map {
        count += Math.abs(it.value)
    }


    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s1 = scan.nextLine()

    val s2 = scan.nextLine()

    val result = makingAnagrams(s1, s2)

    println(result)
}
