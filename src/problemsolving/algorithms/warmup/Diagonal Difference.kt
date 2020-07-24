package problemsolving.algorithms.warmup

import java.lang.Math


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here

    var leftDiagonal = 0
    for (index in 0..arr.lastIndex) {
        leftDiagonal += arr[index][index]
    }
    var rightDiagonal = 0
    for (row in 0..arr.lastIndex) {
        rightDiagonal += arr[arr.lastIndex - row][row]
    }

    return Math.abs(leftDiagonal - rightDiagonal)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}