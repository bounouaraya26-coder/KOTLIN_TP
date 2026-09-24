data class Produit(
    val nom: String,
    val prix: Double,
    val quantite: Int,
    val description: String
)

fun main() {

    // 1 et 2. Création d'un objet Produit
    val produit1 = Produit(
        nom = "Ordinateur portable",
        prix = 7500.0,
        quantite = 10,
        description = "Ordinateur portable 15 pouces"
    )

    // 3. Affichage avec toString()
    println("Produit 1 :")
    println(produit1.toString())

    // 4. Modification du prix avec copy()
    val produit2 = produit1.copy(prix = 7000.0)

    println("\nProduit 2 après modification du prix :")
    println(produit2)

    // 5. Comparaison avec equals()
    println("\nLes deux produits sont-ils identiques ?")
    println(produit1.equals(produit2))

    // Création d'un produit identique à produit1
    val produit3 = produit1.copy()

    println("\nProduit 3 :")
    println(produit3)

    println("\nProduit 1 et Produit 3 sont-ils identiques ?")
    println(produit1.equals(produit3))
}