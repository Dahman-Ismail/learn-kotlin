package com.example.myapp03

abstract class AquariumFish {
     open val color : String ="red"
}
interface FishAction{
    fun eat()
}

class Shark: AquariumFish(),FishAction{
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(),FishAction{
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

fun make(){
    val shark1= Shark()
    val plecostomus1 =Plecostomus()
    println("Shark ${shark1.color}")
    shark1.eat()
    println("Plecostomus ${plecostomus1.color}")
    plecostomus1.eat()
}

fun main() {
    make()
}


