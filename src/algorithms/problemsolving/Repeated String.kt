package algorithms.problemsolving

import java.util.*

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
    val aCountInString = s.count { it == 'a' }
    val fullOccurrence = (n / s.length)
    val remainingStringLength = (n % s.length)
    val aCountInFullString = fullOccurrence * aCountInString
    return aCountInFullString + s.substring(0, remainingStringLength.toInt()).count { it == 'a' }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}