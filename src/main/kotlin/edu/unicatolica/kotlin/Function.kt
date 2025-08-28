package edu.unicatolica.kotlin
import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max

fun section (title: String){
    println("/n" + "=".repeat(75))
    println(title)
    print("=".repeat(75))
}

fun variableAndTypes() {
    val lang: String = "kotlin"
    var counter = 0

    println("val lang = $lang")
    println("var counter = $counter")

    counter+= 3
    println("counter after += 3 => $counter")
}

fun conditionalAsExpressions(n: Int){
    section("2) conditionals as Expressions & when")
    val parity = if (n % 2  == 0) "even" else "odd"
    println("n= $n is $parity")

    val description= when {
        n == 0 ->"Zero"
        n in 1 .. 9 -> "one digit positive"
        n < 0 -> "negative"
        else  -> "positive (>=10)"

    }
    println("Description: $description")
}

fun loopsDemo(){
    section("3) Loops: for / while / do-while")
    //Always use when you know the range of the element

    for (i in 1..5) print("$i")
    println()

    val list = listOf("a","b","c")
    print("for over list: ")
    for (x in list) print("$x ")
    println()
    // use when you don´t know the range of the element, but you know a stop condition
    var x = 3
    print ("while x>0:")
    while (x>0){
    print("$x")
    x--
}
    println()
    // DO WHILE runs at latest once
    var y = 0
    print("do-while y<1: ")
    do{
        print("$y")
        y++
    }while (y < 1)
    println()


}
// function of calculate the average

    fun promStudent (nota1: Double, nota2: Double, nota3: Double){

        val prom=(nota1+nota2+nota3)/3

        println("the average is $prom")

        //conditional for assess the average
        val result = if (prom >= 3.0) {
            "approved"
        }
        else {
            "reproved"
        }
        println("the student is $result")
    }

    fun main (){
    variableAndTypes()
    conditionalAsExpressions(6)
    loopsDemo()
    promStudent(1.0,1.0,1.0)

}