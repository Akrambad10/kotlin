fun main() {
    var greeting = "hello world"
    var firstname = "Mark"
    var lastname = "Kuria"


    //string concatenation
    println(firstname +" "+lastname)
    println(firstname.plus(lastname))


    //accessing an element in a string
    println(greeting[6])

    //Determine an index position of an element
    println(greeting.indexOf("world"))
    println(greeting.indexOf('h'))


    //modifying a string
    println(greeting.uppercase())
    println(greeting.lowercase())

    //string interpolation
    println("Hello there, my name is $firstname $lastname")

    //size of a string
    println(greeting.length)




}