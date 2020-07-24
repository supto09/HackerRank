package problemsolving.algorithms.implementation

import java.util.*

// Complete the libraryFine function below.
fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {

    var fine = 0
    if (y1 > y2)
        fine = 10000;
    else if (y1 == y2) {
        if (m1 > m2)
            fine = 500 * (m1 - m2);
        else if (m1 == m2) {
            if (d1 > d2)
                fine = 15 * (d1 - d2);
        }
    }
    return fine
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val d1M1Y1 = scan.nextLine().split(" ")

    val d1 = d1M1Y1[0].trim().toInt()

    val m1 = d1M1Y1[1].trim().toInt()

    val y1 = d1M1Y1[2].trim().toInt()

    val d2M2Y2 = scan.nextLine().split(" ")

    val d2 = d2M2Y2[0].trim().toInt()

    val m2 = d2M2Y2[1].trim().toInt()

    val y2 = d2M2Y2[2].trim().toInt()

    val result = libraryFine(d1, m1, y1, d2, m2, y2)

    println(result)
}
