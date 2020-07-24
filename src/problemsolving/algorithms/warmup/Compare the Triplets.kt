package problemsolving.algorithms.warmup

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aPoint = 0
    var bPoint = 0
    for (index in a.indices) {
        if (a[index] > b[index])
            aPoint++
        else if (a[index] < b[index])
            bPoint++
    }

    return arrayOf(aPoint, bPoint)
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}