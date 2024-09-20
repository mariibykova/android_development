package com.example.myfirstproject

fun main(){
    var text : String? = "Hello"
    printHello(text)
}

fun printHello(text : String?){
    print(text + " " + getTextHello());
}

fun getTextHello(): String{
    val text = "Hello"
    return text
}