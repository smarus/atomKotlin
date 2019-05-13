package theinKeyword2

fun sumOfEven(n: Int): Int {
    var sum = 0
    for(v in 0..n step 2)
        sum+= v
    return sum
}

fun main(args: Array<String>) {
    println(sumOfEven(10))  // 30
}