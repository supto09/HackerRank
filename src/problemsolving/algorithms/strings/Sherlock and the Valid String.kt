package problemsolving.algorithms.strings

import java.util.*
import kotlin.collections.*

// Complete the isValid function below.
fun isValid(s: String): String {
    if (s.length in 0..1)
        return "YES"


    val counterMap = mutableMapOf<Char, Int>()
    for (c in s) {
        val oldCount = counterMap[c] ?: 0
        val newCount = oldCount + 1
        counterMap[c] = newCount
    }

    println("counter $counterMap")

    val maxCounterMap = mutableMapOf<Int, Int>()
    counterMap.forEach {
        val oldCount = maxCounterMap[it.value] ?: 0
        val newCount = oldCount + 1
        maxCounterMap[it.value] = newCount
    }

    println("counter $maxCounterMap")

    var maxOccuranceValue = Int.MIN_VALUE
    var maxOccurancekey = 0
    maxCounterMap.forEach {
        if (it.value > maxOccuranceValue) {
            maxOccuranceValue = it.value
            maxOccurancekey = it.key
        }
    }

    var tolerance = 0
    counterMap.forEach {
        println("minCount $maxOccurancekey   key ${it.key}  value ${it.value}")
        if (maxOccurancekey != it.value) {
            if (Math.abs(maxOccurancekey - it.value) == 1 || it.value == 1)
                tolerance++
            else
                return "NO"

            if (tolerance > 1) {
                return "NO"
            }
        }
    }


    return "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = isValid(s)

    println(result)
}
