package algorithms.problemsolving

import java.math.BigInteger
import java.util.*

// Complete the extraLongFactorials function below.
fun extraLongFactorials(n: Int): Unit {
    val result = factorial(n.toBigInteger())
    println(result)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    extraLongFactorials(n)
}


fun factorial(number: BigInteger): BigInteger {
    if (number == BigInteger.ONE)
        return BigInteger.ONE

    if (number == BigInteger.ZERO)
        return BigInteger.ONE


    return number * factorial(number - BigInteger.ONE)
}