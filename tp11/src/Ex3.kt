fun main() {

    val nombres = listOf(10, 20, 30, 40, 50, 60)

    // fct anonyme
    val somme = fun(liste: List<Int>): Int {
        var total = 0

        for (nombre in liste) {
            total += nombre
        }

        return total
    }

    println("La somme est : ${somme(nombres)}")
}