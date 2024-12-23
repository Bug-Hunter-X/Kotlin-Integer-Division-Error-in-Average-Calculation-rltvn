fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    val sum = doubledList.sum()
    println(sum) //This will print the correct sum
    val average = sum / doubledList.size // This is the buggy line
    println(average) //This will print an incorrect average due to integer division
}