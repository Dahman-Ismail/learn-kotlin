data class Decoration(val rocks:String){

}
fun MakeDecoration(){
    val decoration1= Decoration("edrtge")
    val decoration2= Decoration("fgh")
    val decoration3= Decoration("edrtge")
    val decoration4= Decoration("dfg")
    println(decoration1)
    println(decoration2)
    println(decoration3)
    println(decoration4)
    println(decoration1.equals(decoration2))
    println(decoration1.equals(decoration3))
}

fun main() {
    MakeDecoration()
}
