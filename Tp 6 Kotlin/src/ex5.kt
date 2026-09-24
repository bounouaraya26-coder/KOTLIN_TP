enum class EtatCommande {

    EN_COURS,
    EXPEDIEE,
    LIVREE,
    ANNULEE;

    // Méthode qui retourne un message selon l'état
    fun message(): String {
        return when (this) {
            EN_COURS -> "La commande est en cours de traitement."
            EXPEDIEE -> "La commande a été expédiée."
            LIVREE -> "La commande a été livrée."
            ANNULEE -> "La commande a été annulée."
        }
    }
}

class Commande(
    val numeroCommande: String,
    var etat: EtatCommande
) {

    // Méthode pour changer l'état de la commande
    fun changerEtat(nouvelEtat: EtatCommande) {
        etat = nouvelEtat
    }
}

fun main() {

    // Création d'une commande
    val commande = Commande(
        numeroCommande = "CMD001",
        etat = EtatCommande.EN_COURS
    )

    // Affichage de l'état initial
    println("Numéro de commande : ${commande.numeroCommande}")
    println("État initial : ${commande.etat}")
    println(commande.etat.message())

    // Modification de l'état
    commande.changerEtat(EtatCommande.EXPEDIEE)

    // Affichage du nouvel état et du message
    println("\nNouvel état : ${commande.etat}")
    println(commande.etat.message())

    // Modification vers LIVREE
    commande.changerEtat(EtatCommande.LIVREE)

    println("\nNouvel état : ${commande.etat}")
    println(commande.etat.message())
}