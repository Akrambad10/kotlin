open class Animal{
    var age = 2
    var gender = "female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}

//Child class/Sub class/Derived class
class Duck:Animal(){
    var color = "white"
    fun sound(){
        println("Duck is quacking")
    }
}
class fish{
    var hasscales = true
    var hasFins = true

    fun eat(){
        println("Fish is eating")
    }
}

fun main() {
    var a = Animal()

    var d = Duck()

    var nileperch = fish()

    println(d.gender)
    d.move("Swimming")
}











