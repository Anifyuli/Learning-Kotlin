fun main() {
    // when same as switch expression in other language as this example
    val examScore = "B"
    when(examScore) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Do remedial tasks")
        }
    }

    // when use for simple conditioning
    val getScore = "A"
    when(getScore) {
        "A", "B", "C" -> {
            println("You pass!")
        }
        else -> {
            println("Sorry, you should try again next time.")
        }
    }

    // when as if else combine with in
    val passingGrade : Array<String> = arrayOf("A", "B", "C")
    when(getScore) {
        in passingGrade -> println("Congrats!")
        !in passingGrade -> println("You must try again next year!")
    }

    // when combine with is for identifying datatype on a variable
    val nameStudent = "Anif"
    when (nameStudent) {
        is String -> println("It's String")
        !is String -> println("It's not String")
    }

    // when can replace if else completely as following condition
    val numericScore = 93
    when {
        numericScore > 90 -> println("Amazing")
        numericScore > 80 -> println("Good job!")
        else -> println("You must try exam again in next year")
    }
}