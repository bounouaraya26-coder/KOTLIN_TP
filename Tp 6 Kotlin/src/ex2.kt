sealed class Operation {

    class Addition(val a: Double, val b: Double) : Operation()

    class Soustraction(val a: Double, val b: Double) : Operation()

    class Multiplication(val a: Double, val b: Double) : Operation()

    class Division(val a: Double, val b: Double) : Operation()
}

fun calculer(operation: Operation): Double {

    return when (operation) {

        is Operation.Addition -> operation.a + operation.b

        is Operation.Soustraction -> operation.a - operation.b

        is Operation.Multiplication -> operation.a * operation.b

        is Operation.Division -> {
            if (operation.b == 0.0) {
                throw Exception("Erreur : division par zéro")
            }
            operation.a / operation.b
        }
    }
}

fun main() {

    val addition = Operation.Addition(10.0, 5.0)
    val soustraction = Operation.Soustraction(10.0, 5.0)
    val multiplication = Operation.Multiplication(10.0, 5.0)
    val division = Operation.Division(10.0, 5.0)

    println("Addition : ${calculer(addition)}")
    println("Soustraction : ${calculer(soustraction)}")
    println("Multiplication : ${calculer(multiplication)}")
    println("Division : ${calculer(division)}")
}