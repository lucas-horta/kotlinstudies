package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    var number: Int
    number = 10
    number = 20


    val employee1 = Employee(name = "Lucas", id = 100)
    employee1.name = "Lucas Horta"

    println(employee1)

    val troco = 4.25

    println("Seu troco é R$$troco")

    val numerador = 10.99
    val denominador = 20.0

    println("O valor de $numerador dividido por $denominador é ${numerador/denominador}")

    println("Os id do empregado ${employee1.name} é ${employee1.id}")

    val egg = "Humpty"
    val cantiga = """$egg Dumpty sat on the wall
                    |$egg Dumpty had a great fall
                    |All the king's horses and all the king's men
                    |Couldn't put $egg together again.""".trimMargin()
    println(cantiga)
}

class Employee(var name: String, val id: Int) {
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}