package com.example.myfirstproject

fun main(){
    var name = "Maria"
    var surname = "Bykova"
    printString(name = name, surname = surname)

    val a = 5;
    val b = 3;
    plus(1, 2)
    plus(14.2243,234.254335)

    minus(345, 234)
    minus(4234.234, 2342323.4)

    inc(123, 543)
    inc(0.345, -5.5)

    div(55,345)
    div(34.54, 1.345)

}

fun plus(a : Int, b : Int){
    val otv = a + b
    println(otv)
}
fun plus(a : Double, b : Double){
    val otv = a + b
    println(otv)
}

fun minus(a : Int, b : Int){
    val otv = a - b
    println(otv)
}
fun minus(a : Double, b : Double){
    val otv = a - b
    println(otv)
}

fun inc(a : Int, b : Int){
    val otv = a  * b
    println(otv)
}
fun inc(a : Double, b : Double){
    val otv = a * b
    println(otv)
}

fun div(a : Int, b : Int){
    val otv = a / b
    println(otv)
}
fun div(a : Double, b : Double){
    val otv = a / b
    println(otv)
}




fun printString(name: String, surname : String ){
    println(name)
    println(surname)
    println(name + surname)
    println(name + " " + surname)

    val space = ' '
    println(name + space + surname)

    val res = name + space + surname
    println(res)
}
