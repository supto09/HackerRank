package problemsolving.algorithms.implementation

import java.util.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>, k: Int): Int {

    var energy = 100
    var position = 0

    do {
        if (c[position] % 2 == 1)
            energy -= 2
        energy--

        position = (position + k) % c.size
    } while (position != 0)

    return energy
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c, k)

    println(result)
}