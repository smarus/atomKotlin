package booleans2

fun and(b1: Boolean, b2: Boolean): Boolean =
        b1 && b2

fun or(b1: Boolean, b2: Boolean): Boolean =
        b1 || b2

fun main(args: Array<String>) {
    println(and(true, true)) // true
    println(or(true, false)) // true
}