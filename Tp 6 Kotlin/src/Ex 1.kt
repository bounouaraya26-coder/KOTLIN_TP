//1
interface Vehicule {
    fun demarrer()
    fun arreter()
    fun afficherInformations()
}

//2
open class VehiculeBase(
    protected val marque: String,
    protected val modele: String,
    protected val annee: Int
) : Vehicule {

    override fun demarrer() {
        println("Le véhicule démarre.")
    }

    override fun arreter() {
        println("Le véhicule s'arrête.")
    }

    override fun afficherInformations() {
        println("Marque : $marque")
        println("Modèle : $modele")
        println("Année : $annee")
    }
}

//3
class Voiture(
    marque: String,
    modele: String,
    annee: Int,
    private val nombrePortes: Int
) : VehiculeBase(marque, modele, annee) {

    fun klaxonner() {
        println("La voiture klaxonne : Pouet Pouet !")
    }

    override fun afficherInformations() {
        super.afficherInformations()
        println("Nombre de portes : $nombrePortes")
    }
}

//4
class Camion(
    marque: String,
    modele: String,
    annee: Int,
    private val capaciteChargement: Double
) : VehiculeBase(marque, modele, annee) {

    fun charger(poids: Double) {
        if (poids <= capaciteChargement) {
            println("Chargement de $poids kg effectué.")
        } else {
            println(
                "Impossible : la capacité maximale est de " +
                        "$capaciteChargement kg."
            )
        }
    }

    override fun afficherInformations() {
        super.afficherInformations()
        println("Capacité de chargement : $capaciteChargement kg")
    }
}

//5
fun main() {

    val voiture = Voiture(
        "Toyota",
        "Corolla",
        2024,
        4
    )

    val camion = Camion(
        "Volvo",
        "FH",
        2023,
        15000.0
    )

    println("=== VOITURE ===")
    voiture.afficherInformations()
    voiture.demarrer()
    voiture.klaxonner()
    voiture.arreter()

    println("\n=== CAMION ===")
    camion.afficherInformations()
    camion.demarrer()
    camion.charger(10000.0)
    camion.charger(20000.0)
    camion.arreter()
}