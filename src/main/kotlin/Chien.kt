open class Animal (val name: String){
    open var couleur: String = "Noir"
    open fun afficher(){
        println("Mon nom d'animal est $name")
    }
}
class Chien(name: String):Animal(name){
    override var couleur: String = "Bringé"
        get()=field.capitalize()
        set(value) {
            field = value.capitalize()
        }

    override fun afficher() {
        println("Mon nom de chien est $name")
    }
}


fun main() {
    val animal = Chien("Robilto")
    animal . couleur ="Merle"
    println(animal.afficher())

    println(animal.couleur)
}
