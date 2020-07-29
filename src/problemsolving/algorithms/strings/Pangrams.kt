package problemsolving.algorithms.strings

import java.util.*

// Complete the pangrams function below.
fun pangrams(s: String): String {
    val characterSet = mutableSetOf<Char>()
    s.map {
        val lowerCaseChar = it.toLowerCase()
        if (lowerCaseChar in 'a'..'z')
            characterSet.add(lowerCaseChar)
    }

    return if (characterSet.count() == 26) "pangram" else "not pangram"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = pangrams(s)

    println(result)
}
