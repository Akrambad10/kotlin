import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)

    print("Enter first number :")
    var num1 = input.nextInt()

    print("Enter second number :")
    var num2 = input.nextInt()

    print("Enter third number :")
    var num3 = input.nextInt()

    if (num1 < num2 && num1 < num3){
        println("$num1 is the smallest")
    }
    else if(num2 < num1 && num2 < num3){
        println("$num2 is the smallest")
    }
    else {
        println("$num3 is the smallest")
    }











}