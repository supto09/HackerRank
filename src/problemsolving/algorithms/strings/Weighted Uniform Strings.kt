package problemsolving.algorithms.strings

import java.util.*


// TODO Don't have a single clue about the question
fun weightedUniformStrings(s: String, queries: Array<Int>): Array<String> {
    //Build a set of weights
    val weights: MutableSet<Int> = HashSet()

    var currentWeight = 0
    var prevLetter = ' '
    for (letter in s.toCharArray()) {
        if (letter != prevLetter) currentWeight = letter - 'a' + 1 else currentWeight += letter - 'a' + 1
        prevLetter = letter
        weights.add(currentWeight)
    }

    val results = Array(queries.size) { "" }
    for (index in queries.indices) {
        results[index] = if (weights.contains(queries[index]))
            "Yes"
        else
            "No"
    }

    return results
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val queriesCount = scan.nextLine().trim().toInt()

    val queries = Array<Int>(queriesCount, { 0 })
    for (i in 0 until queriesCount) {
        val queriesItem = scan.nextLine().trim().toInt()
        queries[i] = queriesItem
    }

    val result = weightedUniformStrings(s, queries)

    println(result.joinToString("\n"))
}
