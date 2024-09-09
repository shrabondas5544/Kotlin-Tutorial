fun main() {

    val Statement = false

    if (Statement == true) {
        println("is statement is true")
    } else {
        println("is statement is false")
    }

    println("------------------")

    val trafficLightColor = "Yellow"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green")
        println("Go")
    else {
        println("Invalid traffic-light color")
    }

    println("------------------")

    val number = 110

    if (number > 130) {
        println("greater than 130")
    } else if (number < 90) {
        println("less than 90")
    } else if (number > 90) {
        println("greater than 90")
    } else if (number != 100) {
        println("not equal to 100")
    } else if (number <= 110) {
        println("greater than or equal to 110")//it will not show "greater than or equal to 110" beacuse if/else statement mantain order.
    } else {
        ("nothing")
    }

}
