fun main() {
    val listeMutable = mutableListOf<Int>()

//2  Ajouter
    listeMutable.add(3)
    listeMutable.add(7)
    listeMutable.add(15)
    listeMutable.add(8)
    listeMutable.add(5)
//3
    val listeImmuable: List<Int> = listeMutable.toList()

    //4 Trier la liste mutable en ordre croissant
    listeMutable.sort()

//5 Afficher
    println("Liste mutable triée : $listeMutable")
    println("Liste immuable : $listeImmuable")
}