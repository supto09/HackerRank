package problemsolving.algorithms.implementation

import java.util.*

// TODO Copy pasted from google. Don't like thisproblem
fun formingMagicSquare(s: Array<Array<Int>>): Int {

    val possiblePermutations = arrayOf(
            arrayOf(intArrayOf(8, 1, 6), intArrayOf(3, 5, 7), intArrayOf(4, 9, 2)),
            arrayOf(intArrayOf(6, 1, 8), intArrayOf(7, 5, 3), intArrayOf(2, 9, 4)),
            arrayOf(intArrayOf(4, 9, 2), intArrayOf(3, 5, 7), intArrayOf(8, 1, 6)),
            arrayOf(intArrayOf(2, 9, 4), intArrayOf(7, 5, 3), intArrayOf(6, 1, 8)),
            arrayOf(intArrayOf(8, 3, 4), intArrayOf(1, 5, 9), intArrayOf(6, 7, 2)),
            arrayOf(intArrayOf(4, 3, 8), intArrayOf(9, 5, 1), intArrayOf(2, 7, 6)),
            arrayOf(intArrayOf(6, 7, 2), intArrayOf(1, 5, 9), intArrayOf(8, 3, 4)),
            arrayOf(intArrayOf(2, 7, 6), intArrayOf(9, 5, 1), intArrayOf(4, 3, 8)))


    var minCost = Int.MAX_VALUE
    for (permutation in 0..7) {
        var permutationCost = 0
        for (i in 0..2) {
            for (j in 0..2) permutationCost += Math.abs(s[i][j] - possiblePermutations[permutation][i][j])
        }
        minCost = Math.min(minCost, permutationCost)
    }
    return minCost
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}