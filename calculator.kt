import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)

    print("Enter first number :")
    var num1 = input.nextInt()

    print("Enter second number :")
    var num2 = input.nextInt()

    println("To multiply press 1")
    println("To divide press 2")
    println("To add press 3")
    println("To subtract press 4")
    print("select preferred operator :")

    var operator = input.nextInt()
    var result = when(operator){
        1->num1*num2
        2->num1/num2
        3->num1+num2
        4->num1-num2

        else->"invalid operator "
    }
    println("The answer is $result")

}