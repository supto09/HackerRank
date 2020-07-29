package problemsolving.algorithms.strings

import java.util.*

// Complete the gemstones function below.
fun gemstones(arr: Array<String>): Int {

    var tempSet = arr[0].toSet()
    for (index in 1..arr.lastIndex) {
        val resultIntersect = tempSet.intersect(arr[index].toSet())
        tempSet = resultIntersect
    }

    return tempSet.count()

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array(n) { "" }
    for (i in 0 until n) {
        val arrItem = scan.nextLine()
        arr[i] = arrItem
    }

    val result = gemstones(arr)

    println(result)
}
