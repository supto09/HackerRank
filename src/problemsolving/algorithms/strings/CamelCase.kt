package problemsolving.algorithms.strings

import java.util.*

// Complete the camelcase function below.
fun camelcase(s: String): Int {

    return s.count {
        it in 'A'..'Z'
    } + 1

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = camelcase(s)

    println(result)
}
