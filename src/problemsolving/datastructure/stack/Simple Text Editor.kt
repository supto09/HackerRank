package problemsolving.datastructure.stack

import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */


    // following code is correct but fails with time limit
/*    val scan = Scanner(System.`in`)
    val queryCount = scan.nextLine().trim().toInt()

    val resultBuilder = StringBuilder()
    val executedQueryStack = Stack<Array<String>>()


    // 1. append - Append string  to the end of .
    // 2. delete - Delete the last  characters of .
    // 3. print - Print the  character of .
    // 4. undo - Undo the last (not previously undone) operation of type 1 or 2, reverting  to the state it was in prior to that operation.

    for (queryNo in 1..queryCount) {
        val query = scan.nextLine().split(" ").map { it.trim() }.toTypedArray()
        when (query[0]) {
            "1" -> {
                resultBuilder.append(query[1])
                executedQueryStack.add(query)
            }
            "2" -> {
                val removedString = resultBuilder.substring(resultBuilder.length - query[1].toInt())
                resultBuilder.delete(resultBuilder.length - query[1].toInt(), resultBuilder.length)
                executedQueryStack.add(arrayOf("2", removedString))
            }
            "3" -> {
                println(resultBuilder[query[1].toInt() - 1])
            }
            else -> {
                val undoQuery = executedQueryStack.pop()
                when (undoQuery[0]) {
                    "1" -> {
                        resultBuilder.delete(resultBuilder.length - undoQuery[1].length, resultBuilder.length)
                    }
                    else -> {
                        resultBuilder.append(undoQuery[1])
                    }
                }
            }
        }
    }
    scan.close()
 */

    // the following version passes all test cases but input taking doesn't looks good

    val scan = Scanner(System.`in`)
    val queryCount = scan.nextLine().trim().toInt()

    val resultBuilder = StringBuilder()
    val executedQueryStack = Stack<Array<String>>()

    for (queryNo in 1..queryCount) {
        when (scan.nextInt()) {
            1 -> {
                val input = scan.next()
                resultBuilder.append(input)
                executedQueryStack.add(arrayOf("1", input))
            }
            2 -> {
                val input = scan.nextInt()
                val removedString = resultBuilder.substring(resultBuilder.length - input)
                resultBuilder.delete(resultBuilder.length - input, resultBuilder.length)
                executedQueryStack.add(arrayOf("2", removedString))
            }
            3 -> {
                val input = scan.nextInt()
                println(resultBuilder[input - 1])
            }
            else -> {
                val undoQuery = executedQueryStack.pop()
                when (undoQuery[0]) {
                    "1" -> {
                        resultBuilder.delete(resultBuilder.length - undoQuery[1].length, resultBuilder.length)
                    }
                    else -> {
                        resultBuilder.append(undoQuery[1])
                    }
                }
            }
        }
    }
    scan.close()
}

//8
//1 abc
//3 3
//2 3
//1 xy
//3 2
//3 1
//1 bsddf
//1 mmshfa