import sun.security.util.Length
import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    print("Please enter object's length: ")
    var length = scanner.nextFloat()
    print("Please enter object's width: ")
    var width = scanner.nextFloat()
    print("Please enter object's height: ")
    var height = scanner.nextFloat()

    var box3 = Box3(length, width, height)
    var box5 = Box5(length, width, height)
    if (box3.validate()) println("Box3")
    else if (box5.validate()) println("Box5")
    else println("No suitable box size!")
}


class Box5(length: Float, width: Float, height: Float):Box3(length, width, height) {
    override fun validate() = if (length < 39.5 && width < 27.5 && height < 23) true else false
}


open class Box3(val length:Float, val width:Float, val height:Float) {
    open fun validate() = if (length < 23 && width < 14 && height < 13) true else false
}