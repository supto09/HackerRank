package algorithms.problemsolving

import java.util.*

// Complete the appendAndDelete function below.
// TODO This code is copied from stackOverflow
fun appendAndDelete(s: String, t: String, k: Int): String {
    if (s == t) return if (k >= s.length * 2 || k % 2 == 0) "Yes" else "No"

    var commonlength = 0

    for (i in 0 until s.length.coerceAtMost(t.length)) {
        if (t[i] != s[i]) break
        commonlength++
    }

    val cs: Int = s.length - commonlength
    val ct: Int = t.length - commonlength
    val tot = cs + ct

    return if (tot == k || tot < k && (tot - k) % 2 == 0 || tot + 2 * commonlength <= k) "Yes" else "No"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val t = scan.nextLine()

    val k = scan.nextLine().trim().toInt()

    val result = appendAndDelete(s, t, k)

    println(result)
}