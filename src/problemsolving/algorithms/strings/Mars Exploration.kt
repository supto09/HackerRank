package problemsolving.algorithms.strings

import java.util.*

// Complete the marsExploration function below.
fun marsExploration(s: String): Int {

    var count = 0
    for (position in s.indices) {
        when (position % 3) {
            0 -> if (s[position] != 'S') count++
            1 -> if (s[position] != 'O') count++
            2 -> if (s[position] != 'S') count++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = marsExploration(s)

    println(result)
}
