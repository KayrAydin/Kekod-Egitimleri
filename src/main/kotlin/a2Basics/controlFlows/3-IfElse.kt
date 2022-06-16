package a2Basics.controlFlows

import java.io.IOException

fun main() {
    /**
     *  if else caselerinin ardindan {} kullanilir ancak yalnizca tek satir kod yazacaksak gerekli degildir
     *  bu caselerin state ve expression olarak iki farkli kullanimi vardir
     *  state kullanimi yalnizca if ve else kullanarak sartli durumlari kodlamaktir
     *  expressionda ise bir valueya deger olarak esitligin karsi tarafina if else kodlarini yazmaktir
     *  expression kullaniminda if else caseleri icin yazilan parantezlerin son satiri value olarak atanir
     */

    print("Öğrenci misin?")
    val answer = readLine()!!
// state jykkabun--
    if (answer.contains("Evet", ignoreCase = true)) {
        println("Öğrenci")
    } else {
        println("Öğrenci değil")
    }

    //expression kullanimi
    val result: String = if (answer == "Evet") {
        "Öğrenci"
    } else if (answer == "evet") {
        "Öğrenci"
    } else {
        "Öğrenci değil"
    }
    println(result)

    /*--------------------------------------------------------------------------------------------------------------*/
    /**
     * If elselerin expression kullaniminda ternary operatoru yoktur alternatif olarak asagidaki gibi kullanilabilir
     */
    val isStudent = false
    val isStudent2 = if (isStudent) {
        "true"
    } else {
        "false"
    }
    //ternary olsaydi: String name2 = isStudent "true" : "false"

    print("Notunuzu giriniz:")
    val grade = readLine()!!.toDouble()
    if (grade <= 100 && grade >= 85) {
        println("AA")
    } else if (grade <= 84 && grade >= 75) {
        println("BB")
    } else if (grade <= 74 && grade >= 60) {
        println("CC")
    } else if (grade <= 59 && grade >= 45) {
        println("DD")
    } else if (grade <= 44 && grade >= 0) {
        println("FF")
    } else {
        println("Lutfen 0 ile 100 arasinda bir deger giriniz")
    }
    // tip atanmadigi takdirde tip otomatik olarak integer olarak atanir o yuzden long olan integere donusturuldugunde tipleri ayni oldu
    if (10 == 10L.toInt()) {
        println("true")
    }
    /**
     * birden fazla sartli durumda (ayni kosula bagli) if ve else if seklinde yazmak farkli if satirlari yazmaktan
     * performans olarak daha iyi olacaktir
     */

    /**
     * Bazi durumlarda if else yazmak yerine if ve sonuna return ya da throw gibi kodun devam etmesini bozacak
     * ifadelerle kod sonlandirmak pratikte if else yazmakla ayni olsa dahi kod daha temiz gorunmus olacaktir
     */
    if (isStudent) {
        println("Student")
    } else {
        println("Not Student")
    }
    if (isStudent) {
        println("Student")
        throw IOException()
        return
    }
    println("Not Student")

}