fun main() {

    val nombres = listOf(3, 8, 12, 5, 15, 20, 7, 10, 4)


    val pairs = nombres.filter { it % 2 == 0 }
    println("Nombres pairs : $pairs")


    val impairs = nombres.filter { it % 2 != 0 }
    println("Nombres impairs : $impairs")

    val superieurs = nombres.filter { it > 10 }
    println("Supérieurs à 10 : $superieurs")
}