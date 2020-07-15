package algorithms.problemsolving

import java.util.*

//// Complete the countApplesAndOranges function below.
//fun countApplesAndOranges(houseStart: Int, houseEnd: Int, appleTree: Int, orangeTree: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
//
//    var appleCount = 0
//    for (index in apples.indices) {
//        val appleDistance = appleTree + apples[index]
//        if (appleDistance in houseStart..houseEnd) {
//            appleCount++
//        }
//    }
//
//    var orangeCount = 0
//    for (index in oranges.indices) {
//        val orangeDistance = orangeTree + oranges[index]
//        if (orangeDistance in houseStart..houseEnd) {
//            orangeCount++
//        }
//    }
//
//    println("$appleCount")
//    println("$orangeCount")
//}

// Complete the countApplesAndOranges function below.
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {

    var appleCount = 0
    for (index in apples.indices) {
        val appleDistance = a + apples[index]
        if (appleDistance in s..t) {
            appleCount++
        }
    }

    var orangeCount = 0
    for (index in oranges.indices) {
        val orangeDistance = b + oranges[index]
        if (orangeDistance in s..t) {
            orangeCount++
        }
    }

    println("$appleCount")
    println("$orangeCount")
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}