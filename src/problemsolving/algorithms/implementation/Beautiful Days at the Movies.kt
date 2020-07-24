package problemsolving.algorithms.implementation

import java.util.*

// Complete the beautifulDays function below.
fun beautifulDays(i: Int, j: Int, k: Int): Int {

    var beautifulDaysCount = 0
    for (number in i..j) {
        if ((Math.abs(number - reverseNumber(number))) % k == 0) {
            beautifulDaysCount++
        }
    }

    return beautifulDaysCount
}

fun reverseNumber(inputNo: Int): Int {
    var reversedNo = 0
    var tempNo = inputNo
    while (tempNo > 0) {
        reversedNo = (reversedNo * 10) + tempNo % 10
        tempNo = tempNo / 10
    }


    return reversedNo
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val ijk = scan.nextLine().split(" ")

    val i = ijk[0].trim().toInt()

    val j = ijk[1].trim().toInt()

    val k = ijk[2].trim().toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}