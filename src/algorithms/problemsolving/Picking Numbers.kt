package algorithms.problemsolving

import java.util.*
import kotlin.collections.ArrayList

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here

    val count = IntArray(a.size - 1)
    Arrays.sort(a)
    for (i in 0 until a.size - 1) {
        val arr = ArrayList<Int>()
        arr.add(a[i])
        for (j in i + 1 until a.size) {
            if (Math.abs(a[i] - a[j]) === 0 || Math.abs(a[i] - a[j]) === 1) {
                arr.add(a[j])
            }
        }
        count[i] = arr.size
    }
    Arrays.sort(count)
    return count[count.size - 1]
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}