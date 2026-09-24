class Banque {

    // Nested class CompteBancaire
    class CompteBancaire(
        val numeroCompte: String,
        var solde: Double
    ) {

        // Méthode pour déposer de l'argent
        fun deposer(montant: Double) {
            if (montant > 0) {
                solde += montant
                println("Dépôt de $montant DH effectué.")
            } else {
                println("Le montant du dépôt doit être positif.")
            }
        }

        // Méthode pour retirer de l'argent
        fun retirer(montant: Double) {
            if (montant <= 0) {
                println("Le montant du retrait doit être positif.")
            } else if (montant > solde) {
                println("Solde insuffisant.")
            } else {
                solde -= montant
                println("Retrait de $montant DH effectué.")
            }
        }
    }

    // Méthode pour créer un compte
    fun creerCompte(numero: String, soldeInitial: Double): CompteBancaire {
        return CompteBancaire(numero, soldeInitial)
    }
}

fun main() {

    // Création d'une banque
    val banque = Banque()

    // Création d'un compte
    val compte = banque.creerCompte("123456789", 1000.0)

    println("Numéro du compte : ${compte.numeroCompte}")
    println("Solde initial : ${compte.solde} DH")

    // Dépôt
    compte.deposer(500.0)
    println("Solde après dépôt : ${compte.solde} DH")

    // Retrait
    compte.retirer(300.0)
    println("Solde après retrait : ${compte.solde} DH")

    // Tentative de retrait supérieur au solde
    compte.retirer(2000.0)
    println("Solde final : ${compte.solde} DH")
}