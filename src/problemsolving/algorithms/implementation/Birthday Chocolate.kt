package problemsolving.algorithms.implementation

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    var count = 0
    for (rootIndex in 0..(s.size - m)) {
        var sum = 0
        for (subArrayIndex in 0 until m) {
            sum += s[rootIndex + subArrayIndex]
        }

        if (sum == d)
            count++
    }
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}