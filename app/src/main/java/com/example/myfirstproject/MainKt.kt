package com.example.myfirstproject

fun main(){
    val name = "Maria"
    val surname  = "Bykova"
    print("Hello ")
    printString(name = name, surname = surname)

    val a = 3
    val b = 3
    plus(5, 3)
    plus(5.6, 12.3)
    minus(10, 25)
    minus(45.2, 1234.23423543)
    inc(45, 23)
    inc(123.3442, 34.5)
    div(12456, 7)
    div(234.234, 235.34)
}

fun plus(a: Double, b : Double){
    val otv = a + b
    println(otv)
}

fun minus(a: Double, b : Double){
    val otv = a - b
    println(otv)
}

fun inc(a: Double, b : Double){
    val otv = a * b
    println(otv)
}

fun div(a: Double, b : Double){
    val otv = a / b
    println(otv)

}fun plus(a: Int, b : Int){
    val otv = a + b
    println(otv)
}

fun minus(a: Int, b : Int){
    val otv = a - b
    println(otv)
}

fun inc(a: Int, b : Int){
    val otv = a * b
    println(otv)
}

fun div(a: Int, b : Int){
    val otv = a / b
    println(otv)
}

fun printString(name: String, surname: String){
    println(name)
    println(surname)
    println(name + surname)
    println(name + " " + surname)

    val space = ' '
    println(name + space + surname)

    val res = name + space + surname
    println(res)

}
