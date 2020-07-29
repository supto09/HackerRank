package problemsolving.algorithms.strings

import java.util.*

// TODO Copied fromm online
fun separateNumbers(s: String): Unit {
    val result = solve(s)
    println(if (result > 0) "YES $result" else "NO")

}

private fun solve(s: String): Long {
    if (s[0] == '0') {
        return -1
    }

    var length = 1
    while (length * 2 <= s.length) {
        val firstNumber = s.substring(0, length).toLong()
        val sequence = StringBuilder()
        var number = firstNumber
        while (sequence.length < s.length) {
            sequence.append(number)
            number++
        }
        if (sequence.toString() == s) {
            return firstNumber
        }
        length++
    }
    return -1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        separateNumbers(s)
    }
}
