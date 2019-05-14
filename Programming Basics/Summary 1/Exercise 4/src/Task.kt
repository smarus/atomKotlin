package summary4

fun printSnake(rows: Int, columns: Int) {
    val width = (rows * columns).toString().length + 1
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            val value = if (i % 2 == 0) {
                i * columns + j
            } else {
                i * columns + (columns - 1 - j)
            }
            print("%${width}d".format(value))
        }
        println()
    }
}

fun main(args: Array<String>) {
    printSnake(4, 5)
}
/* Output:
  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/