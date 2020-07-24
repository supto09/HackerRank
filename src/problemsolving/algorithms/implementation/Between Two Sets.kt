package problemsolving.algorithms.implementation

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

/**
 * Mathematics went above my head. Copy pasted from online
 */


fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here


    val f = lcm(a)
    val l = gcd(b)
    var count = 0

    var i = f
    var j = 2
    while (i <= l) {
        if (l % i == 0)
            count++

        i = f * j
        j++
    }

    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}


fun gcd(input1: Int, input2: Int): Int {
    var a = input1
    var b = input2
    while (b > 0) {
        val temp = b
        b = a % b // % is remainder
        a = temp
    }
    return a
}

fun gcd(input: Array<Int>): Int {
    var result = input[0]
    for (i in 1 until input.size) {
        result = gcd(result, input[i])
    }
    return result
}

fun lcm(a: Int, b: Int): Int {
    return a * (b / gcd(a, b))
}

fun lcm(input: Array<Int>): Int {
    var result = input[0]
    for (i in 1 until input.size) {
        result = lcm(result, input[i])
    }
    return result
}