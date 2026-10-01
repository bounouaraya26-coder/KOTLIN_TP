class NegativeNumberException : Exception("Le nombre est négatif")

fun convertToInt(texte: String): Int {

    try {
        val nombre = texte.toInt()

        if (nombre < 0) {
            throw NegativeNumberException()
        }

        return nombre

    } catch (_: NumberFormatException) {
        println("Erreur : '$texte' n'est pas un entier.")
        return 0

    } catch (_: NegativeNumberException) {
        println("Erreur : le nombre est négatif.")
        return 0
    }
}

fun main() {

    println("Résultat : ${convertToInt("25")}")

    println("Résultat : ${convertToInt("-10")}")

    println("Résultat : ${convertToInt("abc")}")
}