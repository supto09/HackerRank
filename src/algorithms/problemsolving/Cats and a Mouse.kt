package algorithms.problemsolving

import java.util.*

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {

    return when {
        Math.abs(z - x) < Math.abs(z - y) -> "Cat A"
        Math.abs(z - x) > Math.abs(z - y) -> "Cat B"
        else -> "Mouse C"
    }


}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}