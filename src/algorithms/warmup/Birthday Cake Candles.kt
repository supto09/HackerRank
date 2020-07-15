package algorithms.warmup

import java.util.*

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {

    var maximumValue = ar[0]
    var count = 1

    for (index in 1..ar.lastIndex) {
        when {
            ar[index] > maximumValue -> {
                maximumValue = ar[index]
                count = 1
            }
            ar[index] == maximumValue -> count++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}