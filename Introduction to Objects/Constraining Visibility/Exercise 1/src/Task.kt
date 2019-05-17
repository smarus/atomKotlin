package constrainingVisibility1

class Robot(
        private val fieldSize: Int,
        private var x: Int,
        private var y: Int
) {
    private fun crossBoundary(coordinate: Int): Int {
        val inBounds = coordinate % fieldSize
        return if (inBounds < 0) {
            fieldSize + inBounds
        } else {
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

    override fun toString() = "Robot(x=$x,y=$y)"
}

/*
fun main(args: Array<String>) {
    val robot = Robot(10, 1, 1)
    // Coordinates should be private:
//    println(robot.x)
}
*/