open class Shape{
   open fun draw(){
        println("Drawing shape")
    }
}
//Child class
class rhombus:Shape(){
   override fun draw(){
        println("Drawing a rhombus")
    }
}
class parallelogram:Shape(){
   override fun draw(){
        println("Drawing a parallelogram")
    }
}

fun main() {
    var s = Shape()
    s.draw()

    var r = rhombus()
    r.draw()
    var p = parallelogram()
    p.draw()
}















