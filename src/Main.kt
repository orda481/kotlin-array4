//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите цифры 1 массива через пробел: ")
    val arr1=readln().split(" ")
    print("Введите цифры 2 массива через пробел: ")
    val arr2=readln().split(" ")
    val result = mutableListOf<String>()
    val used = mutableSetOf<String>()
    for (num in arr1) {
        if (used.contains(num)) continue
        used.add(num)
        var count1 = 0
        for (n in arr1) if (n == num) count1++
        var count2 = 0
        for (n in arr2) if (n == num) count2++
        val min = if (count1 < count2) count1 else count2
        for (i in 0 until min) result.add(num)
    }
    println("Результат: $result")
}