package constructors2

class Robot(val fieldSize: Int, var x: Int, var y: Int) {
    fun crossBoundary(coordinate: Int): Int {
        val inBounds = coordinate % fieldSize
        return if (inBounds < 0) {
            fieldSize + inBounds
        }
        else {
            inBounds
        }
    }

    fun goRight(steps: Int) {
        x += steps
        x = crossBoundary(x)
    }

    fun goLeft(steps: Int) {
        x -= steps
        x = crossBoundary(x)
    }

    fun goDown(steps: Int) {
        y += steps
        y = crossBoundary(y)
    }

    fun goUp(steps: Int) {
        y -= steps
        y = crossBoundary(y)
    }

    fun getLocation(): String = "($x,$y)"

    override fun toString(): String {
        return "Robot(x=$x,y=$y)"
    }
}

/*
fun main(args: Array<String>) {
    val robot = Robot(10, 1, 1)
    println(robot)
}
*/
/* Output:
Robot(1,1)
*/