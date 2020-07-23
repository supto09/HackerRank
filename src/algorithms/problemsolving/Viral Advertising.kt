package algorithms.problemsolving

import java.util.*

// Complete the viralAdvertising function below.
fun viralAdvertising(n: Int): Int {

    var totalLiked = 0
    var shared = 5

    for (day in 1..n) {
        val liked = shared / 2
        totalLiked += liked

        shared = liked * 3
    }

    return totalLiked
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}