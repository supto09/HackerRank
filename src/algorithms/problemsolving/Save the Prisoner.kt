package algorithms.problemsolving

import java.util.*

// Complete the saveThePrisoner function below.
fun saveThePrisoner(n: Int, m: Int, s: Int): Int {

    // (sweet % prisoner) + startingPoint - 1
    // 1 is subtracted because startingPoint will be 1 indexed


    val i = (m + s - 1) % n
    if (i == 0) return n
    return i
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nms = scan.nextLine().split(" ")

        val n = nms[0].trim().toInt()

        val m = nms[1].trim().toInt()

        val s = nms[2].trim().toInt()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}