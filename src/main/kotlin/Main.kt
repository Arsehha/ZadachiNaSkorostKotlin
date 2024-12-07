import kotlin.math.pow

fun main(args: Array<String>) {
    println("Напишите значения первого массива")
    val nums1 = intArrayOf(1,2,2,1)
    println("Напишите значения второго массива")
    val nums2 = intArrayOf(2,2)
    val startTime = System.nanoTime()
    val nums11 = nums1.toSet().sorted()
    val nums22 = nums2.toSet().sorted()
    val nums3: MutableList<Int> = mutableListOf()
    for (item in nums11) {
        for (item2 in nums22)
        {
            if (item > item2) {
                break
            } else {
                if (item == item2) {
                    nums3.add(item)
                }
            }
        }
    }
    for (item in nums3)
        print("${item} ")
    val endTime = System.nanoTime() - startTime
    println()
    println("Время ${endTime*10.0.pow(-6.0)}")
}