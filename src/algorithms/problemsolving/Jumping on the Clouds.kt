package algorithms.problemsolving

import java.util.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>): Int {


    var jumpCount = 0
    var position = 0

    while (position < c.lastIndex) {
        if ((position < c.size - 2) && c[position + 2] == 0)
            position += 2
        else
            position++

        jumpCount++
    }

    return jumpCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}
