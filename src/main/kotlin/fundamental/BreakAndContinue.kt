fun main() {
    var i = 0

    // nilai true menyebabkan perulangan while maupun doWhile akan berlangsung terus-menerus
    while (true) {
        println("$i . Break me!")
        i++
        if (i > 100) {
            // break digunakan untuk menghentikan perulangan / iterasi yang sedang berlangsung, baik while, doWhile maupun for
            break
        }
    }

    for (id in 1..100) {
        if (id % 2 == 0) {
            // continue dipakai untuk melompati perulangan untuk sementara waktu ketika kondisinya terpenuhi dan melanjutkannya jika kondisi tidak dipenuhi
            continue
        }

        println("Angka $id")
    }
}