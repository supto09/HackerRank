package problemsolving.algorithms.implementation

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here

    val resultArray = Array(grades.size) { 0 }
    for (index in grades.indices) {
        var number = grades[index]
        val adjustment = number % 5

        if (number > 38 && adjustment >= 3) {
            number += (5 - adjustment)
        }

        resultArray[index] = number
    }

    return resultArray
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}