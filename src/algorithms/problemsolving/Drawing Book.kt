package algorithms.problemsolving

import java.util.*

/*
 * Complete the pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {
    /*
     * Write your code here.
     */


    val fromLeft = p / 2
    val fromRight = (n / 2 - p / 2)

    return Math.min(fromLeft, fromRight)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}