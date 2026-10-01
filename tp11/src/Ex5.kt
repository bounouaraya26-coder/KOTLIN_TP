fun divide(dividende: Int, diviseur: Int): Int {

    try {
        return dividende / diviseur
    } catch (_: ArithmeticException) {
        println("Erreur : division par zéro !")
        return 0
    }
}

fun main() {

    println("Résultat : ${divide(10, 2)}")

    println("Résultat : ${divide(10, 0)}")
}