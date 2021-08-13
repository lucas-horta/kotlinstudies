package academy.learnprogramming.datatypes

import academy.learnprogramming.javacode.DummyClass

fun main(args: Array<String>) {
    val myInt = 10
    var myLong = 22L

    // Kotlin não possui um aumento automático de números

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short

    myShort = myByte.toShort()

    val outroInt = 5

    var myDouble = 65.984
    println("default datatype is ${myDouble is Double}")

    val myFloat = 838.8492f
    println("This is a float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b'
    val myCharInt = 65
    println(myCharInt.toChar())
    val myBoolean = true
    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    val anything: Any
}