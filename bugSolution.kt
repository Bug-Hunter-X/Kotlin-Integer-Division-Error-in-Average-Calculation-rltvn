fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    val sum = doubledList.sum().toDouble()
    println(sum)
    val average = sum / doubledList.size
    println(average) //This will now print the correct average
}