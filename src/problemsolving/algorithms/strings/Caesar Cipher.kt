package problemsolving.algorithms.strings

import java.util.*


fun caesarCipher(s: String, k: Int): String {

    var result = ""
    for (c in s) {
        result += when (c) {
            in 'a'..'z' -> {
                val base: Int = 'a'.toInt()
                (((c.toInt() + k - base) % 26) + base).toChar()
            }
            in 'A'..'Z' -> {
                val base: Int = 'A'.toInt()
                (((c.toInt() + k - base) % 26) + base).toChar()
            }
            else -> c
        }
    }
    return result
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val k = scan.nextLine().trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}
