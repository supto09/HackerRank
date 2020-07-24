package problemsolving.algorithms.warmup

import java.util.*

fun miniMaxSum(arr: Array<Int>): Unit {

    var minimum = arr[0].toLong()
    var maximum = arr[0].toLong()
    var sum = arr[0].toLong()
    for (index in 1..arr.lastIndex) {
        sum += arr[index]
        if (arr[index] < minimum)
            minimum = arr[index].toLong()

        if (arr[index] > maximum)
            maximum = arr[index].toLong()
    }

    val maximumPossibleValue = sum - minimum
    val minimumPossibleValue = sum - maximum

    println("$minimumPossibleValue $maximumPossibleValue")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}