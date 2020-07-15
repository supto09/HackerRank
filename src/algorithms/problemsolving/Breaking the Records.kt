package algorithms.problemsolving

import java.util.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {

    var minimum = scores[0]
    var maximum = scores[0]

    var minimumRecordCount = 0
    var maximumRecordCount = 0

    for (index in 1..scores.lastIndex) {

        if (scores[index] < minimum) {
            minimum = scores[index]
            minimumRecordCount++
        }
        if (scores[index] > maximum) {
            maximum = scores[index]
            maximumRecordCount++
        }
    }

    return arrayOf(maximumRecordCount, minimumRecordCount)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
