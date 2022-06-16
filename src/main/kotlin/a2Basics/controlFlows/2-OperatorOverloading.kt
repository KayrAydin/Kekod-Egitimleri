package a2Basics.controlFlows

data class pairNumber(val numberOne: Int, val numberTwo: Int) {
    operator fun minus(pairNumber: pairNumber): pairNumber {
        val returnPairObject = pairNumber(
            numberOne - pairNumber.numberOne, numberTwo - pairNumber.numberTwo
        )
        println("Sonuc = (${returnPairObject.numberOne}, ${returnPairObject.numberTwo}")
        return returnPairObject
    }
//    operator fun String.plus(value: String): Int{
//        return this toInt() + value.toInt()
//    }
}

fun main(args: Array<String>) {
    val a = 5
    val b = 8
    //operatorler arka planda corresponding(kendisine karsilik gelen/ eslenigi) methodu cagirir
    var result = a + b
    result = a.plus(b)

    val pairNumberOne = pairNumber(2, 4)
    val pairNumberTwo = pairNumber(-8, 11)
    val resultOne = pairNumberOne.numberOne - pairNumberTwo.numberOne
    val resultTwo = pairNumberOne.numberTwo - pairNumberTwo.numberTwo
    println("Sonuc= ($resultOne,$resultTwo)")

}
