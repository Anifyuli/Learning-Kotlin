fun main() {
    val hours = readLine()!!.toInt()

    fun parkingFee(): Any {
        return if (hours <= 5) {
            hours
        } else if (hours == 24) {
            15
        } else {
            5 + ((hours - 5) * 0.5)
        }
    }

    val total : Double = parkingFee() as Double
    println(total)

}