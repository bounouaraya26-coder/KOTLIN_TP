fun main() {

    // 1
    val utilisateurs = mutableMapOf<String, Int>()

    // 2 Ajouter
    utilisateurs["Hanan"] = 20
    utilisateurs["Lamyae"] = 19
    utilisateurs["Manal"] = 19
    utilisateurs["Hafsa"] = 21

    // Affichage
    println("Carte initiale : $utilisateurs")

    // 3 Suppression
    utilisateurs.remove("Hanan")

    println("Après suppression de Hanan : $utilisateurs")

    // 4 Recherche
    val age = utilisateurs["Lamyae"]

    if (age != null) {
        println("L'âge de Lamyae est : $age ans")
    } else {
        println("Lamyae n'existe pas dans la carte.")
    }

    // 5 Affichage
    println("Clés (noms) : ${utilisateurs.keys}")
    println("Valeurs (âges) : ${utilisateurs.values}")
}