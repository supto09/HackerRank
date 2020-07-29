package problemsolving.algorithms.strings

import java.util.*

// Complete the anagram function below.
fun anagram(s: String): Int {

    val subStringOne = s.substring(0, s.length / 2)
    val subStringTwo = s.substring(s.length / 2, s.length)

    if (subStringOne.length != subStringTwo.length)
        return -1
//    println("s $s  subStringOne $subStringOne subStringTwo $subStringTwo ")

    var count = 0
    for (index in subStringOne.indices) {
        if (subStringOne[index] != subStringTwo[subStringTwo.lastIndex - index]) {
            count++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = anagram(s)

        println(result)
    }
}
