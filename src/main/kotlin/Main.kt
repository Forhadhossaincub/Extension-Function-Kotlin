fun main(args: Array<String>) {

    val x:Int=11
    println(x.isOdd())
    println(10.isOdd())

}
fun Int.isOdd():Boolean{
    return this % 2 != 0
}