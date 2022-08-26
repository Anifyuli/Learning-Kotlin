fun main() {
    sayHello("Moh","Anif", "Yuliansyah")
    sayHello("Otong", null, "Surotong")
}

// tanda tanya setelah tipe data paramater untuk menjelaskan bahwa parameter dapat diisi dengan nilai null
fun sayHello(firstName : String, midName : String?, lastName : String) {
    // kondisi untuk menghilangkan nilai null agar tidak tampil di konsol
    if (midName == null) {
        println("Hello, $firstName $lastName")
    } else {
        println("Hello, $firstName $midName $lastName")
    }
}