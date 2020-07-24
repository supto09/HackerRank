package problemsolving.algorithms.implementation

import java.util.*

// Complete the equalizeArray function below.
fun equalizeArray(arr: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    for (number in arr) {
        val currentValue = map[number] ?: 0
        map[number] = currentValue + 1
    }


    var maxOccupancyOfNumber = 0
    map.forEach { (key, value) ->
        maxOccupancyOfNumber = Math.max(value, maxOccupancyOfNumber)
    }

    return arr.size - maxOccupancyOfNumber
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = equalizeArray(arr)

    println(result)
}
