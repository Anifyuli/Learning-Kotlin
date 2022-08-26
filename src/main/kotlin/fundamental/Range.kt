fun main() {
    // step = mendapat nilai setiap kenaikan
    val range = 4..96 step 4

    println(range)

    // mencari jumlah bilangan yang terdapat dalam range
    println(range.count())

    // mencari keberadaan nilai tersebut dalam range
    println(range.contains(20))
    println(range.contains(120))

    // menentukan nilai pertama dari range
    println(range.first)

    // menentukan nilai terakhir dari range
    println(range.last)

    // mencari kelipatan range
    println(range.step)

    // untuk range hitungan terbalik, ganti dua titik dengan downTo
    val downRange = 96 downTo 4 step 4

    println(downRange)

    println(downRange.count())

    println(downRange.contains(20))
    println(range.contains(120))

    println(downRange.first)

    println(downRange.last)

    println(downRange.step)

}