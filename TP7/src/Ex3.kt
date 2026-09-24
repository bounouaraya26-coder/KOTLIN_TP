fun main() {

    // 1
    val nombres = mutableSetOf<Int>()

    // 2 Ajouter
    nombres.add(10)
    nombres.add(20)
    nombres.add(30)
    nombres.add(40)

    println("Ensemble : $nombres")

    // 3 Supprimer
    nombres.remove(element = 30)

    println(" $nombres")

    // 4 Vérifier
    if (nombres.contains(40)) {
        println("40 est présent dans l'ensemble")
    } else {
        println("40 n'est pas présent dans l'ensemble")
    }
    println("contenu de l'ensemble: $nombres")
}