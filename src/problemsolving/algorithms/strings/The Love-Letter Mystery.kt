package problemsolving.algorithms.strings

import java.util.*

// Complete the theLoveLetterMystery function below.
fun theLoveLetterMystery(s: String): Int {
    var operationCount = 0

    for (index in 0 until s.length / 2) {
        val first = s[index]
        val last = s[s.lastIndex - index]


        val diff = Math.abs(first - last)
        operationCount += diff
    }
    return operationCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = theLoveLetterMystery(s)

        println(result)
    }
}
