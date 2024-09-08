
fun main() {
    var x = 5
    val y = 6

    val result = x + y
    println("result = $result")

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    println("------------------")

    var a = 3.0 //if we write num in a fractional part then the result well be in fractional
    val b = 7

    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")

    println("a % b = ${a % b}")

    println("------------------")

    var resultt = a + b

    resultt += 5 // also we can write resultt = resultt + 5
    println("resultt = $resultt")

    resultt -= 5 // also we can write resultt = resultt - 5
    println("resultt = $resultt")

    resultt *= 5 // also we can write resultt = resultt * 5
    println("resultt = $resultt")

    resultt /= 5 // also we can write resultt = resultt / 5
    println("resultt = $resultt")

    resultt %= 5 // also we can write resultt = resultt % 5
    println("resultt = $resultt")

    println(" 3 * 2 + 7 / 1 - 4 = ${3 * 2 + 7 / 1 - 4}")

    println("------------------")

    x = 3
    println("x = ${x++}")
    println("x = ${++x}")
    //---------------------
    println("x = ${x--}")
    println("x = ${--x}")


}

