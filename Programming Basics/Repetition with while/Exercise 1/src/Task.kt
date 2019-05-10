package repetitionwithwhile1

fun sum(number: Int): Int {
    var i = 0
    var sum = 0
    while (i != number){
        i++
        sum+= i
    }
    return sum
}

fun main(args: Array<String>) {
    println(sum(10))  // 55
}