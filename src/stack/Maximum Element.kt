package stack

import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val queryCount = scan.nextLine().trim().toInt()


    val dataStack = Stack<Int>()
    val maxStack = Stack<Int>()


    for (queryNo in 1..queryCount) {
        val queryArray = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        when (queryArray[0]) {
            1 -> {
                val data = queryArray[1]
                dataStack.push(data)

                if (maxStack.isEmpty())
                    maxStack.push(data)
                else if (data >= maxStack.peek())
                    maxStack.push(data)
            }
            2 -> {
                val poppedData = dataStack.pop()

                if (poppedData == maxStack.peek())
                    maxStack.pop()
            }
            3 -> {
                println(maxStack.peek())
            }
            else -> throw IOException()
        }
    }
}