package algorithms.warmup

import java.util.*

fun staircase(n: Int): Unit {
    for (row in 1..n) {
        for (space in n - 1 downTo row)
            print(" ")
        for (symbol in 1..row)
            print("#")
        println()
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    staircase(n)
}