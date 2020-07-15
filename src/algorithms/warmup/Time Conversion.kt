package algorithms.warmup

import java.util.*

fun timeConversion(s: String): String {

    val listTime = s.split(":")
    var hour = listTime[0]
    val minutes = listTime[1]
    val secounds = listTime[2].substring(0, 2)
    val caser = listTime[2].substring(2, 4)

    if (caser == "AM") {
        if (hour == "12") hour = "00"
    } else {
        if (hour != "12") {
            var h = hour.toInt()
            h += 12
            hour = "" + h
        }
    }

    return "$hour:$minutes:$secounds"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}