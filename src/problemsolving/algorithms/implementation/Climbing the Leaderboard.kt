package problemsolving.algorithms.implementation

import java.util.*


//       7
//       100 100 50 40 40 20 10
//       4
//       5 25 50 120

// Complete the climbingLeaderboard function below.
fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {

    val resultArray = Array(alice.size) { 0 }
    val distinctScoreArray = scores.distinct().toTypedArray()


    var scoreIndex = distinctScoreArray.lastIndex
    for ((index, score) in alice.withIndex()) {
        while (scoreIndex >= 0) {
            if (score >= distinctScoreArray[scoreIndex])
                scoreIndex--
            else {
                resultArray[index] = scoreIndex + 2
                break
            }
        }
        if (scoreIndex < 0) {
            resultArray[index] = 1
        }
    }

    return resultArray
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val scoresCount = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val aliceCount = scan.nextLine().trim().toInt()

    val alice = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = climbingLeaderboard(scores, alice)

    println(result.joinToString("\n"))
}