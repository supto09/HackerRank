package problemsolving.algorithms.implementation

import java.util.*

// Complete the utopianTree function below.
fun utopianTree(n: Int): Int {

    var height = 1

    for (cycle in 1..n) {
        if (cycle % 2 == 1)
            height *= 2
        else
            height++
    }
    return height
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}
