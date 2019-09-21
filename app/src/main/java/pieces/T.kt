package pieces

class T(x:Int, y:Int): Piece(x,y){

    init {
        pixelB = Point(x , y + 1)
        pixelC = Point(x - 1, y)
        pixelD = Point(x, y - 1)
    }

    override fun moveDown() {
        pixelA.moveDown()
        pixelB.moveDown()
        pixelC.moveDown()
        pixelD.moveDown()
    }

    override fun moveUp() {
        pixelA.moveUp()
        pixelB.moveUp()
        pixelC.moveUp()
        pixelD.moveUp()
    }

    override fun moveLeft() {
        pixelA.moveLeft()
        pixelB.moveLeft()
        pixelC.moveLeft()
        pixelD.moveLeft()
    }

    override fun moveRight() {
        pixelA.moveRight()
        pixelB.moveRight()
        pixelC.moveRight()
        pixelD.moveRight()
    }

    override fun rotateRight() {

        pixelB.x += 1
        pixelB.y -= 1

        pixelC.x += 1
        pixelC.y += 1

        pixelD.x -= 1
        pixelD.y += 1

    }
    override fun rotateCenter() {
        pixelB.x -= 1
        pixelB.y += 1

        pixelC.x -= 1
        pixelC.y -= 1

        pixelD.x += 1
        pixelD.y -= 1

    }

}