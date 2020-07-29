package problemsolving.algorithms.strings

import java.util.*

// Complete the funnyString function below.
fun funnyString(s: String): String {

    var isFunny = true
    for (index in 0 until s.lastIndex) {
        val straightDiff = Math.abs(s[index] - s[index + 1])
        val reverseDiff = Math.abs(s[s.lastIndex - index] - s[s.lastIndex - index - 1])

        if (straightDiff != reverseDiff)
            isFunny = false
    }

    return if (isFunny) "Funny" else "Not Funny"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = funnyString(s)

        println(result)
    }
}
