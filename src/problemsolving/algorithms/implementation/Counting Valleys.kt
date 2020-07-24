package problemsolving.algorithms.implementation

import java.util.*

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {

    var valleyCount = 0
    var level = 0

    for (index in s.indices) {
        when (s[index]) {
            'D' -> {
                level--
            }
            'U' -> {
                if (level == -1)
                    valleyCount++

                level++
            }
        }
    }


    return valleyCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
