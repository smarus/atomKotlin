package exceptions1

import atomictest.capture
import atomictest.eq
import java.lang.IllegalArgumentException

fun repeatChar(ch: Char, n: Int): String {
    if (n < 0)
        throw IllegalArgumentException("Count 'n' must be non-negative, but was $n.")
    var string: String =""
    repeat(n){
        string+=ch
    }
    return string
}

fun main(args: Array<String>) {
    repeatChar('a', 4) eq "aaaa"
    capture {
        repeatChar('c', -2)
    } eq "IllegalArgumentException: Count 'n' must be non-negative, but was -2."
}