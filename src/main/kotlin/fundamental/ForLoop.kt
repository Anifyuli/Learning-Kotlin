fun main() {
    val animals = arrayOf("Cat", "Chicken", "Duck", "Cow", "Goat")
    // gunakan for untuk mengambil seluruh data dari array
    // variabel total digunakan untuk mencari jumlah data yang terdapat dalam perulangan
    var total =  0
    for (animal in animals) {
        println(animal)
        total++
    }
    println("Total perulangan : $total kali")

    // for juga dapat digunakan untuk iterasi pada tipe data range
    for (value in 1..5) {
        println(value)
    }

    // for juga dapat digunakan pada descending range
    for (value in 5 downTo 1) {
        println(value)
    }

    // for juga dapat dikombinasikan
    val animalSize = animals.size - 1
    for (i in 0..animalSize) {
        println("Index ke-$i = ${animals[i]}")
    }
}