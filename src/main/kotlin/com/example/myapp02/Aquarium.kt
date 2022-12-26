package com.example.myapp02
import java.lang.Math
import kotlin.math.PI

open class Aquarium(open var width: Int =100,open var height: Int =50,open var length: Int =20) {

    open var volume: Int
    get() = width* height * length /1000
    set(value) {
        height = (value*1000)/ (width* length)
    }
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume *0.9

    constructor(numberOfFish: Int) :this() {
        val tank =numberOfFish * 2000 *1.1
        height= (tank / (length* width)).toInt()
    }

    init {
        println("aquarium initializing")
    }

    init {
        println("volume ${width * height * length / 1000} l")
    }

    fun printsize(){
        println(shape)
        println("With: $width cm Height: $height cm Length $length cm")

        println("Volume: $volume l Water: $water l ${water / volume *100.0}% full")
    }
}

class TowerTank(override var height: Int,var diamter: Int):Aquarium(height = height, width = diamter, length = diamter){
    override var volume :Int
        get() = (width/2 * length/2 * height / 1000* PI).toInt()
        set(value) {
            height= ((value * 1000 / PI )/ (width/2 *length/2)).toInt()
        }
    override val shape = "cylinder"
    override var water: Double = 0.0
        get() = volume *0.8
}

fun buildAquarium(){

    val myaquarium = Aquarium()
    myaquarium.printsize()
    myaquarium.height=70
    myaquarium.printsize()//5
    val myaquarium1 = Aquarium()
    myaquarium1.printsize()
    val myaquarium2 = Aquarium(width = 25)
    myaquarium2.printsize()
    val myaquarium3 = Aquarium(width = 42, height = 50)
    myaquarium3.printsize()
    val myaquarium4 = Aquarium(width = 62, height = 5, length = 89)
    myaquarium4.printsize()

    val myaquarium6 = Aquarium(numberOfFish = 29)
    myaquarium6.printsize()
    myaquarium6.volume= 70
    myaquarium6.printsize()
    println("volume ${myaquarium6.width * myaquarium6.height * myaquarium6.length / 1000} l")
    val myTower = TowerTank(diamter = 25, height = 40)
    myTower.printsize()
}
fun main(){
    buildAquarium()
}