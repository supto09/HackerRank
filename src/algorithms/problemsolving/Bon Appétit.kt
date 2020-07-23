package algorithms.problemsolving

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {


    var totalBill = 0
    for (index in bill.indices) {
        if (index == k)
            continue

        totalBill += bill[index]
    }

    val annaWillPay = totalBill / 2

    if (annaWillPay == b)
        println("Bon Appetit")
    else
        println(b - annaWillPay)
}

fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}