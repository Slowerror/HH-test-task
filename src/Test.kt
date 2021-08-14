fun main () {
    val array = createSortedTwoDimensionalArray(5)
    for (i in array.indices) {
        for (j in array[i]) {
            print("$j ")
        }
        println()
    }
}

fun createSortedTwoDimensionalArray(n : Int): Array<Array<Int>> {
    var generatedArray = Array(1) { Array((1..n).random()) { (0..10).random() } }
    var sizeArray : Int

    // Заполнение двумерного массива массивами разной длины
    while(generatedArray.size < n) {
        sizeArray = (1..n).random()

        if (generatedArray.all { it.size != sizeArray })
            generatedArray += (Array(sizeArray) {(0..10).random()})
    }

    // Вывод массива до сортировки (если это необходимо)
    /* for (i in generatedArray.indices) {
        for (j in generatedArray[i]) {
            print("$j ")
        }
        println()
    }
    println()
    */

    // Сортировка массивов
    // Если порядковый номер начинается с 0
    for (i in generatedArray.indices) {
        if (i % 2 == 0)
            generatedArray[i].sort()
        else
            generatedArray[i].sortDescending()
    }

    // Если порядковый номер начинается с 1
    /* for (i in generatedArray.indices) {
        if (i % 2 == 0)
            generatedArray[i].sortDescending()
        else
            generatedArray[i].sort()
    }
    */

    return generatedArray
}