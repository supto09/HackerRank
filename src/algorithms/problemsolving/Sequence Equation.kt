package algorithms.problemsolving

import java.util.*

// Complete the permutationEquation function below.
fun permutationEquation(p: Array<Int>): Array<Int> {
    val map = mutableMapOf<Int, Int>()
    for (index in p.indices) {
        map.put(p[index], index + 1)
    }


    val resultArray = Array(p.size) { 0 }

    for (index in p.indices) {
        val result = map[map[index + 1]] ?: 0
        resultArray[index] = result
    }


    return resultArray
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}