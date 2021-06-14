package diagonals

fun main() {
    val input: Array<IntArray> = arrayOf(
        intArrayOf(2, 4, 6),
        intArrayOf(1, 3, 5),
        intArrayOf(8, 9, 2)
    )
    val result = diagonals(input)

    result.println(result)
}

fun diagonals(arr: Array<IntArray>) : Array<Int> {
    val result = arrayOf(0, 0)
    for (i in arr.indices) {
        result[0] += arr[i][i]
        result[1] += arr[i][(arr.size - 1) - i]
    }
    return result
}

fun Array<Int>.println(arr: Array<Int>) {
    println(arr.contentToString())
}