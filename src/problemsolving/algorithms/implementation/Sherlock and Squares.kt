package problemsolving.algorithms.implementation

import java.util.*

// Complete the squares function below.
fun squares(a: Int, b: Int): Int {

    val sqrtA = Math.ceil(Math.sqrt(a.toDouble()))
    val sqrtB = Math.floor(Math.sqrt(b.toDouble()))

    return sqrtB.toInt() - sqrtA.toInt() + 1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val ab = scan.nextLine().split(" ")

        val a = ab[0].trim().toInt()

        val b = ab[1].trim().toInt()

        val result = squares(a, b)

        println(result)
    }
}