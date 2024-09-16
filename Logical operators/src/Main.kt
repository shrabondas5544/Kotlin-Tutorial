fun main(){

println("------------------")  //logical not operator  "

    val isActive = true
    if (!isActive == true) {
        println("the user is active")
    }
    else{
        println("the user is not active")
    }

println("------------------")  // logical and operator  " if both condition are true "

    val isplaying = true
    val score = 80
    if (isplaying && score == 120) {
        println("next level opened")  // if isplaying is = true and score = 120 then it will print "next level opened"
    }
    else {
        println("same level")   // here isplaying is = true but score = 80 that why is print "same level"
    }

println("------------------")  // logical or operator  " if one or both condition are true "

    //The if else statement is also executed without second brackets
    val num1 = 8
    val num2 = 1
    if (num1>0 || num2>0)
        println("num1 or num2 is true or both are true")
    else
        println("num1 & num2 both are false")

//------------------------------------------
    val num3 = 8
    val num4 = -1
    if (num3>0 || num4>0)
        println("num1 or num2 is true or both are true")
    else
        println("num1 & num2 both are false")

//------------------------------------------
    val num5 = -8
    val num6 = -1
    if (num5>0 || num6>0)
        println("num1 or num2 is true or both are true")
    else
        println("num1 & num2 both are false")


}