
import java.util.Random
fun main(){
    println(birthdayGreeting())
    println("------------")
    println(add(5,5))
    for (j in 10 downTo 1  ) {

        println("j :$j")
    }
    for (i in 6..10 step 1) {
        println(i)
    }

    for (i in 'a'..'f') {
        println(i)
    }

    val million = 1_000_000_000_000_000
    println("milion $million")
    var i : Int= 1
    while (i < 5) {
        println(i)
        i++
    }
//    repeat(10){
//        print(i.inc())
//
//    }
    println("-----------")
    println("Today is ${randomday()}")
    println(fishfood(randomday()))
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot","Monday", "Tuesday", "Wednesday", "Thursday","Friday",
        "Saturday", "Sunday")
    println( decorations.filter {it[0] == 's'.toUpperCase()})


    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))


    println("-----------")
    var madrix = arrayOf(arrayOf("Monday", "Tuesday"),arrayOf("alligator", "flowerpot","Monday"),arrayOf("rock", "pagoda", "plastic plant")
        ,arrayOf("UYIYI"),arrayOf(7,4,9,6),arrayOf("sdfs","gretge"))
    var k=0
    // 1
    while (k < madrix.size) {
        var l=0
        while (l < madrix[k].size) {
            println(madrix[k][l])

            l++
        }
        k++
    }
    println("-----------")

    // 2
    for(mads in madrix){
        for (mad in mads){
            println(mad)
        }
    }
}


fun randomday():String{
    val week= arrayOf("Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday")
    return  week[Random().nextInt(week.size)]
}


fun add ( a:Int,b:Int): Int {
    println(a + b)
    return a + b
}


fun fishfood(day: String,foods: String="nothing" ) :String{

    var food=foods
    when (day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}
fun birthdayGreeting(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}