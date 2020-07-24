package problemsolving.algorithms.implementation

import java.util.*


// Complete the cutTheSticks function below.
fun cutTheSticks(arr: Array<Int>): Array<Int> {

    val result = mutableListOf<Int>()

    //QuickSort sticks in ascending order
    //The built in sort function performs a dual pivot quick sort that rarely degrades to n^2
    //QuickSort sticks in ascending order
    //The built in sort function performs a dual pivot quick sort that rarely degrades to n^2
    Arrays.sort(arr)


    var sticksLeft: Int = arr.size

    var curr: Int = arr[0]
    var currCount = 0

    result.add(arr.size)
    //Works by decrementing sticksLeft by the frequency of the smallest stick each time

    //Works by decrementing sticksLeft by the frequency of the smallest stick each time
    for (i in arr.indices) {
        if (curr == arr[i]) {
            currCount++
        } else {
            sticksLeft -= currCount
            currCount = 1
            curr = arr[i]
            result.add(sticksLeft)
        }
    }


    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = cutTheSticks(arr)

    println(result.joinToString("\n"))
}