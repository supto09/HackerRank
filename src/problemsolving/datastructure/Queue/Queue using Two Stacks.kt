package problemsolving.datastructure.Queue

import java.util.*

fun main(args: Array<String>) {

//    1 x: Enqueue element X into the end of the queue.
//    2: Dequeue the element at the front of the queue.
//    3: Print the element at the front of the queue.


    // for enqueue push data in dataStack
    // for dequeue we always print from tempStack pop. If temp data is empty then first insert dataStack value in tempStack and then print from tempStack


    val tempStack = Stack<Int>()
    val dataStack = Stack<Int>()


    val scan = Scanner(System.`in`)
    val queryCount = scan.nextLine().trim().toInt()

    for (queryNo in 1..queryCount) {
        when (scan.nextInt()) {
            1 -> {
                dataStack.push(scan.nextInt())
            }
            2 -> {
                if (tempStack.isEmpty()) {
                    while (dataStack.isNotEmpty()) {
                        tempStack.push(dataStack.pop())
                    }
                }

                tempStack.pop()
            }
            3 -> {
                if (tempStack.isEmpty()) {
                    while (dataStack.isNotEmpty()) {
                        tempStack.push(dataStack.pop())
                    }
                }

                println(tempStack.peek())
            }
        }
    }
}