package problemsolving.algorithms.implementation

import java.util.*

// Complete the designerPdfViewer function below.
fun designerPdfViewer(h: Array<Int>, word: String): Int {

    val letterHeightMap = mutableMapOf<Char, Int>()
    ('a'..'z').mapIndexed { index, character ->
        letterHeightMap.put(character, h[index])
    }

    var maxHeight = 0
    word.map {
        if (letterHeightMap[it] ?: 0 > maxHeight)
            maxHeight = letterHeightMap[it] ?: 0
    }

    return maxHeight * word.length
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val word = scan.nextLine()

    val result = designerPdfViewer(h, word)

    println(result)
}
