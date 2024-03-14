fun main() {
    //while loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }
    var num = 100
    while (num >= 95){
        println("Number is $num")
        num--
    }

    //do while loop
    var x = 20
    do{
        println(x)
        x++
    }while (x <=25)

    //for loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }

    var marks = arrayOf(20,40,60,80)
    for (y in marks){
        println(y)
    }
    for (Number in 30 .. 35){
        println(Number)
    }
    for (letter in 'a' .. 'd'){
        println(letter)
    }







}