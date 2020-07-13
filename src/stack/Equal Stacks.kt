package stack

import java.util.*


/*
 * Complete the equalStacks function below.
 */
fun equalStacks(h1: Array<Int>, h2: Array<Int>, h3: Array<Int>): Int {
    /*
     * Write your code here.
     */

    val stackA = Stack<Int>()
    val stackB = Stack<Int>()
    val stackC = Stack<Int>()

    var stATotalHeight = 0
    var stBTotalHeight = 0
    var stCTotalHeight = 0


    for (i in h1.lastIndex downTo 0) {
        stATotalHeight += h1[i]
        stackA.push(stATotalHeight)
    }
    for (i in h2.lastIndex downTo 0) {
        stBTotalHeight += h2[i]
        stackB.push(stBTotalHeight)
    }
    for (i in h3.lastIndex downTo 0) {
        stCTotalHeight += h3[i]
        stackC.push(stCTotalHeight)
    }


    while (true) {

        if (stackA.isEmpty() || stackB.isEmpty() || stackC.isEmpty()) return 0

        val topValueA = stackA.peek()
        val topValueB = stackB.peek()
        val topValueC = stackC.peek()

        if (topValueA == topValueB && topValueB == topValueC)
            return topValueA


        if (topValueA >= topValueB && topValueA >= topValueC) {
            stackA.pop()
        } else if (topValueB >= topValueA && topValueB >= topValueC) {
            stackB.pop()
        } else if (topValueC >= topValueA && topValueC >= topValueB) {
            stackC.pop()
        }

    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n1N2N3 = scan.nextLine().split(" ")

    val n1 = n1N2N3[0].trim().toInt()

    val n2 = n1N2N3[1].trim().toInt()

    val n3 = n1N2N3[2].trim().toInt()

    val h1 = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val h2 = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val h3 = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = equalStacks(h1, h2, h3)

    println(result)
}