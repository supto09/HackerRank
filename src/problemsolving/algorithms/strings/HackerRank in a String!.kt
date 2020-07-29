package problemsolving.algorithms.strings

import java.util.*

// Complete the hackerrankInString function below.
fun hackerrankInString(s: String): String {
    val lordOfWord = "hackerrank"


    var lordWordPosition = 0
    var slaveWordPosition = 0

    while (lordWordPosition < lordOfWord.lastIndex && slaveWordPosition < s.lastIndex) {
        if (lordOfWord[lordWordPosition] == s[slaveWordPosition]) {
            lordWordPosition++
            slaveWordPosition++
        } else {
            slaveWordPosition++
        }
    }

    return if (lordWordPosition == lordOfWord.lastIndex) "YES" else "NO"

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = hackerrankInString(s)

        println(result)
    }
}
