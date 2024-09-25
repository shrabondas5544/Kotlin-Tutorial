fun main(){
    val trafficlight = "Green"

    when (trafficlight) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
//-------------------------------------------------------------

    val alarm1 = 3

    when (alarm1){
        !in 1..10 -> println("the number is in the range") //just type .. after typing the value and I also write logical not operator for negate the value
        12,10,7,2 -> println("the time is $alarm1")
        else -> println("the time is $alarm1")
    }

    val alarm2 = 70

    val text = when {
        alarm2 <= 10 -> "the number is  in the range 1...10"
        alarm2 == 80 || alarm2 == 70  -> "the time is $alarm2 "
        else -> "the time is $alarm2"
    }
    println(text)



}
