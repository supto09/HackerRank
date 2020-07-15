package algorithms.problemsolving

import java.util.*


// TODO find a good solution with less time complexity
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {


    var count = 0
    for (startingIndex in 0 until ar.lastIndex) {
        for (loopingIndex in startingIndex + 1..ar.lastIndex) {

            if ((ar[startingIndex] + ar[loopingIndex]) % k == 0) {
                println("${ar[startingIndex]}====${ar[loopingIndex]}")
                count++
            }
        }
    }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}