fun main() {
    // 1 Créer une liste mutable
    val liste = mutableListOf<String>()

    // 2 Ajouter
    liste.add("KAWASAKI")
    liste.add("YAMAHA")
    liste.add("HONDA")

    // 3 Supprimer
    liste.remove("HONDA")

    // 4 Rechercher
    if (liste.contains("KAWASAKI")) {
        println("KAWASAKI existe dans la liste")
    } else {
        println("KAWASAKI n'existe pas dans la liste")
    }

    // 5 Afficher
    println("Taille : ${liste.size}")
    println("Liste : $liste")
}