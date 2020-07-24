package problemsolving.algorithms.implementation

import java.util.*

// Complete the hurdleRace function below.
fun hurdleRace(k: Int, height: Array<Int>): Int {
    var potionCount = 0

    for (index in height.indices) {
        if (height[index] > k)
            potionCount = Math.max(height[index] - k, potionCount)
    }

    return potionCount

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val height = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}