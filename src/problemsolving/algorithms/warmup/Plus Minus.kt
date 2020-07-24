package problemsolving.algorithms.warmup

import java.text.DecimalFormat
import java.util.*

fun plusMinus(arr: Array<Int>): Unit {

    var positiveCount = 0F
    var zeroCount = 0F
    var negativeCount = 0F

    for (index in arr.indices) {
        when {
            arr[index] < 0 -> negativeCount++
            arr[index] > 0 -> positiveCount++
            else -> zeroCount++
        }
    }

    val decim = DecimalFormat("0.000000")

    println(decim.format(positiveCount / arr.size))
    println(decim.format(negativeCount / arr.size))
    println(decim.format(zeroCount / arr.size))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
