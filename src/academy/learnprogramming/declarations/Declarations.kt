package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    var number: Int
    number = 10
    number = 20

    val names = arrayListOf("João", "Joana", "Maria")
    println(names[1])

    val employees: EmployeeSet

    val employee1 = Employee(name = "Lucas", id = 100)
    employee1.name = "Lucas Horta"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee(name = "John", id = 200)
    } else {
        employee2 = Employee(name = "Jack", id = 300)
    }


}

class Employee(var name: String, val id: Int)