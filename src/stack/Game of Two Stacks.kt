package stack

import java.util.*

/*
 * Complete the twoStacks function below.
 */
fun twoStacks(x: Int, a: Array<Int>, b: Array<Int>): Int {
    /*
     * Write your code here.
     */


    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val g = scan.nextLine().trim().toInt()

    for (gItr in 1..g) {
        val nmx = scan.nextLine().split(" ")

        val n = nmx[0].trim().toInt()

        val m = nmx[1].trim().toInt()

        val x = nmx[2].trim().toInt()

        val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val b = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val result = twoStacks(x, a, b)

        println(result)
    }
}