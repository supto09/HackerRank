package datastructure.stack

import java.util.*

// Complete the poisonousPlants function below. https://www.hackerrank.com/challenges/poisonous-plants/problem
fun poisonousPlants(p: Array<Int>): Int {

//    4
//    3 2 5 4
//    2

//    5
//    3 6 2 7 5
//    2

//    7
//    6 5 8 4 7 10 9
//    2

//    7
//    4 3 7 5 6 4 2
//    3


    val currentDayPlantList = p.toMutableList()

    var nDays = 0
    var haveKilled = true
    while (haveKilled) {
        haveKilled = false
        for (index in currentDayPlantList.lastIndex - 1 downTo 1) {
            if (currentDayPlantList[index] > currentDayPlantList[index - 1]) {
                currentDayPlantList.removeAt(index)
                haveKilled = true
            }
        }
        nDays++
    }
    return nDays - 1


//    var currentDayPlantList = p.toList()
//    var dayCount = 1
//
//    while (true) {
////        println(currentDayPlantList.joinToString(" "))
//
//        var isPlantInOrder = true
//
//        var leftPlant = currentDayPlantList[0]
//        var rightPlant = 0
//
//        val nextDayPlantList = mutableListOf<Int>()
//        nextDayPlantList.add(leftPlant)
//
//        for (plantIndex in 1..currentDayPlantList.lastIndex) {
//            rightPlant = currentDayPlantList[plantIndex]
//
////            println("Left plant $leftPlant right plant $rightPlant")
//
//            if (rightPlant <= leftPlant) {
//                nextDayPlantList.add(rightPlant)
//            } else {
//                isPlantInOrder = false
//            }
//
//            leftPlant = rightPlant
//        }
//
//        if (isPlantInOrder) {
//            return dayCount - 1
//        }
//
//        currentDayPlantList = nextDayPlantList
//
//        dayCount++
//    }


    // code is correct but fails within time limit
    /* val currentPlantStack = Stack<Int>()
     for (index in p.lastIndex downTo 0) {
         currentPlantStack.add(p[index])
     }

     var dayCount = 1
     while (true) {

         var isPlantInOrder = true // flag for checking if plant is in order

         val nextDayPlantList = mutableListOf<Int>()

         // first plant will never die. so pop it as first left plant and add to next day plan
         var leftPlant = currentPlantStack.pop()
         nextDayPlantList.add(leftPlant)

         var rightPlant = 0
         while (currentPlantStack.isNotEmpty()) {
             rightPlant = currentPlantStack.pop()

             if (rightPlant <= leftPlant) {
                 nextDayPlantList.add(rightPlant)
             } else {
                 isPlantInOrder = false
             }

             leftPlant = rightPlant
         }

         // if all plant is in order then return current day
         if (isPlantInOrder) {
             return dayCount - 1
         }

         currentPlantStack.clear()
         for (index in nextDayPlantList.lastIndex downTo 0) {
             currentPlantStack.add(nextDayPlantList[index])
         }

         dayCount++
     }*/
}

fun printStack(stack: Stack<Int>) {
    while (stack.isNotEmpty()) {
        print("${stack.pop()} ")
    }
    println()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = poisonousPlants(p)

    println(result)
}