package problemsolving.algorithms.strings

import java.util.*

// Complete the beautifulBinaryString function below.
fun beautifulBinaryString(b: String): Int {
    if (b.length < 3)
        return 0

    var count = 0
    var index = 0
    while (index <= b.lastIndex - 2) {
        if (b[index] == '0' && b[index + 1] == '1' && b[index + 2] == '0') {
            count++
            index += 2
        }
        index++
    }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val b = scan.nextLine()

    val result = beautifulBinaryString(b)

    println(result)
}
