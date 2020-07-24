package problemsolving.algorithms.implementation

import java.util.*

// Complete the findDigits function below.
fun findDigits(n: Int): Int {

    var tempNumber = n
    var count = 0

    while (tempNumber > 0) {
        val lastDigit = tempNumber % 10
        tempNumber /= 10

        if (lastDigit == 0)
            continue

        if (n % lastDigit == 0)
            count++
    }

    return count

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}