package algorithms.problemsolving

import java.util.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {


    val pairMap = mutableMapOf<Int, Int>()
    for (index in ar.indices) {
        var currentColorSockCount = pairMap[ar[index]] ?: 0
        currentColorSockCount++
        pairMap[ar[index]] = currentColorSockCount
    }


    var pairedSockCount = 0
    pairMap.map {
        pairedSockCount += it.value / 2
    }

    return pairedSockCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}