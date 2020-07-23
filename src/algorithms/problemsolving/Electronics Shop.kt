package algorithms.problemsolving

import java.util.*

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    /*
     * Write your code here.
     */

    var maxSpentMoney = -1

    for (keyboardIndex in keyboards.indices) {
        for (driveIndex in drives.indices) {
            val spentMoney = keyboards[keyboardIndex] + drives[driveIndex]
            if (spentMoney <= b)
                maxSpentMoney = Math.max(maxSpentMoney, spentMoney)
        }
    }

    return maxSpentMoney

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}