package problemsolving.algorithms.implementation

import java.util.*

// Complete the circularArrayRotation function below.
fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    val results = Array(queries.size) { 0 }

    for (queryIndex in queries.indices) {
        val query = queries[queryIndex]
        val expectedIndex = (query + a.size - (k % a.size)) % a.size
        results[queryIndex] = a[expectedIndex]
    }

    return results
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nkq = scan.nextLine().split(" ")

    val n = nkq[0].trim().toInt()

    val k = nkq[1].trim().toInt()

    val q = nkq[2].trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val queries = Array<Int>(q, { 0 })
    for (i in 0 until q) {
        val queriesItem = scan.nextLine().trim().toInt()
        queries[i] = queriesItem
    }

    val result = circularArrayRotation(a, k, queries)

    println(result.joinToString("\n"))
}