package theinKeyword1

fun getAlphabet(): String {
    var  string =""
    for(v in "abcdefghijklmnopqrstuvwxyz")
        string +=v

    return string
}

fun main(args: Array<String>) {
    println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}