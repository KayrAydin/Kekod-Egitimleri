package a2Basics.loops

fun main() {
    /**
     * 3 farki sekilde for tanimlanabilir:
     * value in list                         seklinde value tanimlanabilir
     * index in list.indices                  seklinde index degerler alinabilir
     * (index,value) in list.withIndex()        seklinde index, value degerlerini alinabilir
     */
    for (value: Int in 1..10) {
        println(value)
    }
    val countryCodeArray = arrayOf("tr", "it", "fr", "uk", "us")
    for (value in countryCodeArray) {
        println(value)
    }
    for (index in countryCodeArray.indices) {
        println("$index . degeri : ${countryCodeArray[index]}")
    }
    for ((index, value) in countryCodeArray.withIndex()) {
        println("$index . degeri : $value")
    }

/*-------------------------------------------------------------------------------------------------------------------*/
    /**
     * repeat(size) seklinde herhangi bir listeye ihtiyac duymadan tekrarlayan islemler yapilabilir
     */
    repeat(10) {
        println("android developer olcaz")
    }
    /**
     * return ile gerekli sartlar saglanirsa donguden cikilabilir
     * continue ile gerekli sartlar saglanilirsa donguye o deger atlanilarak devam edilebilir
     */
    for (value in 1..50) {
        if (value % 2 == 1) {
            continue
        }
        println(value)
    }
    for (value in 1..50) {
        if (value % 2 == 1) {
            break
        }
        println(value)
    }
    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue
            }
            println("continue1 : $value2| ")
        }
    }
    println("")
    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnLabel
            }
            println("continue2 : $value2 |")
        }
    }
    println("")
    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break
            }
            println("break1: $value2 |")
        }
    }
    println("")
    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break@returnLabel
            }
            println("break2 : $value2 |")
        }
    }
}