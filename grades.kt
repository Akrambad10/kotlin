import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    print("Enter grade of the student :")
    var grade =read.nextInt()

    var result =grade
    when (grade){
        in 80..100 -> println("The grade of the student is A")
        in 70..79 -> println("The grade of the student is B")
        in 60..69 -> println("The grade of the student is C")
        in 50..59 -> println("The grade of the student is D")
        in 40..49 -> println("The grade of the student is E")
        in 0..30 -> println("The grade of the student is F")
        else-> println("Invalid Grade entered")
    }


}