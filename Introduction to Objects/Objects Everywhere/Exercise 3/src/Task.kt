package objectsEverywhere3

fun isPalindrome(s: String): Boolean = s == s.reversed()

fun isPalIgnoreCase(s: String): Boolean =
        isPalindrome(s.toLowerCase())

fun isPalIgnoreSpecial(s: String): Boolean {
    var onlyLetters = ""
    for (c in s) {
        if (c in 'a'..'z' || c in 'A'..'Z') {
            onlyLetters += c
        }
    }
    return isPalIgnoreCase(onlyLetters)
}

fun main(args: Array<String>) {
    println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}