package problemsolving.algorithms.strings

import java.util.*

// Complete the alternatingCharacters function below.
fun alternatingCharacters(s: String): Int {
    if (s.length in 0..1)
        return 0

    var count = 0
    for (index in 0 until s.lastIndex) {
        if (s[index] == s[index + 1])
            count++
    }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = alternatingCharacters(s)

        println(result)
    }
}
