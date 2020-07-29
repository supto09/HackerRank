package problemsolving.algorithms.strings


// Complete the superReducedString function below.
fun superReducedString(s: String): String {

    val sb = StringBuilder(s)
    var index = 1
    while (index < sb.length) {
        if (sb[index] == sb[index - 1]) {
            sb.delete(index - 1, index + 1)
            index = 0
        }
        index++
    }

    return if (sb.isEmpty()) "Empty String" else sb.toString()
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = superReducedString(s)

    println(result)
}
