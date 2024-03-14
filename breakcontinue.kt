fun main() {
    //break statement
    for (x in 50..55){
        if (x == 54 ){
            break
        }
        println(x)
    }
    //continue statement
    for (character in 'a'..'h'){
        if (character == 'f'){
            continue
        }
        println(character)
    }

}