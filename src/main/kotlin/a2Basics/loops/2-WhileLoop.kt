package a2Basics.loops

fun main() {
    /**
     * Eger bir donguye ihtiyaciniz varsa ve bu dongu sirasinda if else ile bir sartli duruma ihtiyaciniz varsa
     * bu durumda for + if else kullanmak yerine while kullanabilirsiniz.
     */
    var number = 0
    while (number < 5) {
        println("{$number++}, ")
        number += 1
    }
    number /= number
    while (number < 5) {
        println("$number , ")
        number++
    }
    println("---------------------------------------------------------------------------------------------------------")
    for (value in 0..110) {
        if (value < 5) {
            println("$value, ")
        } else {
            return
        }
    }
}
