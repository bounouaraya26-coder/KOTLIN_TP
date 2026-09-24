//1
fun String.containsSubstring(substring: String): Boolean {
    return this.contains(substring)
}

//2
fun main() {
    val chaine1 = "Bonjour "
    val chaine2 = "CMC"
    val chaine3 = "DEVOAM202"

    println(chaine1.containsSubstring("Bonjour"))
    println(chaine1.containsSubstring("HANAN"))

    println(chaine2.containsSubstring("CMC"))
    println(chaine2.containsSubstring("JAVA"))

    println(chaine3.containsSubstring("DEVOAM202"))
    println(chaine3.containsSubstring("Kotlin"))
}