package problemsolving.algorithms.strings

import java.util.*

// Complete the gameOfThrones function below.
fun gameOfThrones(s: String): String {


    val counterMap = mutableMapOf<Char, Int>()
    for (c in s) {
        val oldCount = counterMap[c] ?: 0
        val newCount = oldCount + 1
        counterMap[c] = newCount
    }

    var tolerance = 0
    counterMap.forEach {
        if (it.value % 2 == 1) {
            tolerance++
        }

        if (tolerance > 1)
            return "NO"

    }

    println("counterMap $counterMap")

    return "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = gameOfThrones(s)

    println(result)
}
