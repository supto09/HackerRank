package problemsolving.algorithms.implementation

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {

    val resultArray = Array(5) { 0 }
    for (index in 0..arr.lastIndex) {
        val value = arr[index]
        var count = resultArray[value - 1]
        count++
        resultArray[value - 1] = count
    }

    var maxValue = resultArray[0]
    var maxCountIndex = 0
    for (index in resultArray.indices) {
        if (resultArray[index] > maxValue) {
            maxValue = resultArray[index]
            maxCountIndex = index
        }
    }

    return maxCountIndex + 1
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
