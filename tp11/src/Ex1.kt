val calculate: (Int, Int, (Int, Int) -> Int) -> Int =
    { a, b, operation -> operation(a, b) }

fun main() {

    val addition = calculate(10, 5) { a, b -> a + b }
    println("Addition : $addition")

    val soustraction = calculate(10, 5) { a, b -> a - b }
    println("Soustraction : $soustraction")

    val multiplication = calculate(10, 5) { a, b -> a * b }
    println("Multiplication : $multiplication")
}