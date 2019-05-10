package loopingandRanges2

fun factorial(n: Int): Long {
    var result: Long = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun sumOfFactorials(n: Int): Long {
    var sum: Long = 0;
    for(i in 1..n){
        sum += factorial(i)
    }
    return sum
}

fun main(args: Array<String>) {
    println(sumOfFactorials(10))  // 4037913
}