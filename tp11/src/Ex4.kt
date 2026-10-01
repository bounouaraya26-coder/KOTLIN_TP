fun main() {

    // Fct anonyme
    val estPair = fun(nombre: Int): Boolean {
        return nombre % 2 == 0
    }

    //
    val nombres = listOf(2, 5, 8, 11, 20)

    for (nombre in nombres) {
        if (estPair(nombre)) {
            println("$nombre est pair")
        } else {
            println("$nombre est impair")
        }
    }
}