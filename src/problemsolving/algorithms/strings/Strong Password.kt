package problemsolving.algorithms.strings

import java.util.*

// Complete the minimumNumber function below.
fun minimumNumber(n: Int, password: String): Int {
    // Return the minimum number of characters to make the password strong
    var count = 0

    if (!password.matches(".*[a-z].*".toRegex())) {
        count++
    }

    if (!password.matches(".*[A-Z].*".toRegex())) {
        count++
    }

    if (!password.matches(".*[0-9].*".toRegex())) {
        count++
    }

    if (password.matches("[a-zA-Z0-9]*".toRegex())) {
        count++
    }

    val lengthDifference: Int = 6 - password.length

    return if (lengthDifference > 0 && count <= lengthDifference) {
        lengthDifference
    } else count

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val password = scan.nextLine()

    val answer = minimumNumber(n, password)

    println(answer)
}
