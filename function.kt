fun main() {
    //predefined functions
    println("hello kotlin")

    var x = Math.min(45,56)
    println(x)

    var y = Math.max(90,124)
    println("The maximum value is $y")

    var z = Math.round(45.98)
    println(z)

    name()

    product(30,34)
    product(10,24)

    details("mark",18)
    details("Allan",19)


}
//user defined function
fun name (){
    println("Mark")
}

fun product (num1:Int,num2:Int){
    println(num1*num2)
}
fun details(name:String,age:Int){
    println("$name is $age years old")

}
