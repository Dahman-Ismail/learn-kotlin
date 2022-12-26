package com.example.myapp

 class Aquarium( with: Int =100,height: Int =50,length: Int =20) {


    var with: Int = with
    var height: Int = height
    var length: Int = length
    var volume: Int
        get() = with* height * length /1000
        /*private*/ set(value) {
            height = (value*1000)/ (with* length)
        }

    constructor(numberOfFish: Int) :this() {
        val tank =numberOfFish * 2000 *1.1
        height= (tank / (length* with)).toInt()
    }

    init {
        println("aquarium initializing")
    }

    init {
        println("volume ${with * height * length / 1000} l")
    }

    fun printsize(){
        println("With: $with cm Height: $height cm Length $length cm")
    }
}

fun buildAquarium(){

    val myaquarium = Aquarium()
    myaquarium.printsize()
    myaquarium.height=70
    myaquarium.printsize()
    val myaquarium1 = Aquarium()
    myaquarium1.printsize()
    val myaquarium2 = Aquarium(with = 25)
    myaquarium2.printsize()
    val myaquarium3 = Aquarium(with = 42, height = 50)
    myaquarium3.printsize()
    val myaquarium4 = Aquarium(with = 62, height = 5, length = 89)
    myaquarium4.printsize()

    val myaquarium6 = Aquarium(numberOfFish = 29)
    myaquarium6.printsize()
    myaquarium6.volume= 70
    myaquarium6.printsize()
    println("volume ${myaquarium6.with * myaquarium6.height * myaquarium6.length / 1000} l")
}
fun main(){
    buildAquarium()
}