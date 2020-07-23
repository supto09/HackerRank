package algorithms.problemsolving

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    return if (year < 1918) {                                                   //Julian check for leap year
        if (year % 4 == 0)
            "12.09.$year"
        else "13.09.$year"
    } else if (year == 1918) {                                           //Special case: transition year
        "26.09.$year"
    } else {                                                            //Gregorian check for leap year
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            "12.09.$year"
        else
            "13.09.$year"
    }

}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}