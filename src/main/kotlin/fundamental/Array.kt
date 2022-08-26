fun main() {
    val name : Array<String> = arrayOf("Anif", "Yuli", "Munif")
    val number : Array<Int> = arrayOf(1, 2, 3, 4, 5, 7, 8, 9, 10)
    val distance : Array<Double> = arrayOf(1.5, 2.4, 3.7, 4.6)

    // mengambil data dari array dengan [index]
    println(name[0])

    // mengambil data dari array dengan get()
    val getName = name.get(2)
    println(getName)

    // mengetahui jumlah data dari array
    println(number.size)

    // mengubah data di posisi index
    val setNumber = number.set(3, 5)
    println(number[3])

    // mengubah data di posisi index dengan [index] = value
    number[8] = 11
    println(number[8])

    // mengganti nilai sesuai index
    distance[0] = 1.2
    println(distance[0])


}