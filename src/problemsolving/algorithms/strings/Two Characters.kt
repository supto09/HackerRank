package problemsolving.algorithms.strings


// TODO Copied from net
fun alternate(s: String): Int {
    var maxPattern = 0

    if (s.length == 1) //Edge case where length is 1
        return maxPattern

    //Loop through all letter pairs

    //Loop through all letter pairs
    for (i in 0..25) {
        nextLetter@ for (j in i + 1..25) {
            val one = ('a'.toInt() + i).toChar() //First char in pair
            val two = ('a'.toInt() + j).toChar() //Second char in pair
            var lastSeen = '\u0000'
            var patternLength = 0
            for (letter in s.toCharArray()) {
                if (letter == one || letter == two) {
                    if (letter == lastSeen) //Duplicate found
                    {
                        continue@nextLetter
                    }
                    //Not a duplicate
                    patternLength++
                    lastSeen = letter
                }
            } //for char : s
            maxPattern = if (patternLength > maxPattern) patternLength else maxPattern //Keep a running max
        } //for j
    } //for i


    return maxPattern

}

fun main(args: Array<String>) {
    val l = readLine()!!.trim().toInt()

    val s = readLine()!!

    val result = alternate(s)

    println(result)
}
