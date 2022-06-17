package `Hws and Examples`

import kotlin.math.roundToInt

fun main() {

    // Sınav yuzdelikleri, basari notu ve harf notu hesaplama programi
    println("Lutfen ders adinizi giriniz: ")
    val dersAdi = readLineNotNull()
    println("Sinav yuzdeliklerinizi 0 ile 100 arasinda sayisal deger olarak giriniz")
    println("Lutfen $dersAdi icin 1. vize yuzdeligini giriniz:")
    var vize1Yuzdelik = 0.0
    readLine()?.let {
        vize1Yuzdelik = it.toDouble()
    }
    if (vize1Yuzdelik <= 100 && vize1Yuzdelik >= 0) {
    } else {
        println("Lutfen 0 ile 100 arasinda sayisal deger giriniz")
        readLine()?.let {
            vize1Yuzdelik = it.toDouble()
        }
    }
//    print(vize1Yuzdelik)
    println("Lutfen $dersAdi icin 2. vize yuzdeligini giriniz:")
    var vize2Yuzdelik = readLine()!!.toDouble()
    if (vize2Yuzdelik <= 100 && vize2Yuzdelik >= 0) {
    } else {
        println("Lutfen 0 ile 100 arasinda sayisal deger giriniz")
        vize2Yuzdelik = readLine()!!.toDouble()
    }
    println("Lutfen $dersAdi icin final yuzdeligini giriniz:")
    var finalYuzdelik = readLine()!!.toDouble()
    if (finalYuzdelik <= 100 && finalYuzdelik >= 0) {
    } else {
        println("Lutfen 0 ile 100 arasinda sayisal deger giriniz")
        finalYuzdelik = readLine()!!.toDouble()
    }
    println("Lutfen $dersAdi icin odev yuzdeliginizi giriniz:")
    var odevYuzdelik = readLine()!!.toDouble()
    if (odevYuzdelik <= 100 && odevYuzdelik >= 0) {
    } else {
        println("Lutfen 0 ile 100 arasinda sayisal deger giriniz")
        odevYuzdelik = readLine()!!.toDouble()
    }
    println("Lutfen $dersAdi icin quiz yuzdeliginizi giriniz:")
    var quizYuzdelik = readLine()!!.toDouble()
    if ((quizYuzdelik <= 100 && quizYuzdelik >= 0).not()) {
        println("Lutfen 0 ile 100 arasinda sayisal deger giriniz")
        quizYuzdelik = readLine()!!.toDouble()
    }
    var notToplam = vize1Yuzdelik + vize2Yuzdelik + odevYuzdelik + quizYuzdelik + finalYuzdelik
    //println(notToplam)
    if (notToplam == 100.toDouble()) {
    } else {
        println("Degerlerin dogrulugunu lutfen kontrol edin")
        return
    }
    println("Lutfen $dersAdi icin 1. vize notunuzu giriniz :")
    var vize1Not = readLine()!!.toDouble()
    if (vize1Not <= 100 && vize1Not >= 0) {
    } else {
        println("Lutfen 0 ile 100 arasinda sayisal deger giriniz")
        vize1Not = readLine()!!.toDouble()
    }
    println("Lutfen $dersAdi icin 2. vize notunuzu giriniz :")
    var vize2Not = readLine()!!.toDouble()
    if (vize2Not <= 100 && vize2Not >= 0) {
    } else {
        println("Lutfen 0 ile 100 arasinda sayisal deger giriniz")
        vize2Not = readLine()!!.toDouble()
    }
    println("Lutfen $dersAdi icin final notunuzu giriniz :")
    var finalNot = readLine()!!.toDouble()
    if (finalNot <= 100 && finalNot >= 0) {
    } else {
        println("Lutfen 0 ile 100 arasinda sayisal deger giriniz")
        finalNot = readLine()!!.toDouble()
    }
    println("Lutfen $dersAdi icin odev notunuzu giriniz :")
    var odevNot = readLine()!!.toDouble()
    if (odevNot <= 100 && odevNot >= 0) {
    } else {
        println("Lutfen  0 ile 100 arasinda sayisal deger giriniz")
        odevNot = readLine()!!.toDouble()
    }
    println("Lutfen $dersAdi icin quiz notunuzu giriniz :")
    var quizNot = readLine()!!.toDouble()
    if (quizNot <= 100 && quizNot >= 0) {
    } else {
        println("Lutfen 0 ile 100 arasinda sayisal deger giriniz")
        quizNot = readLine()!!.toDouble()
    }
    var grade = calculateGrade(
        vize1Not = vize1Not,
        vize1Yuzdelik = vize1Yuzdelik,
        vize2Yuzdelik = vize2Yuzdelik,
        vize2Not = vize2Not,
        quizNot = quizNot,
        quizYuzdelik = quizYuzdelik,
        odevNot = odevNot,
        odevYuzdelik = odevYuzdelik,
        finalNot = finalNot,
        finalYuzdelik = finalYuzdelik
    )

    var harfNotu: String = "CC"
    when (grade.roundToInt()) {
        in 95.rangeTo(100) -> {
            harfNotu = "AA"
        }
        in 90..94 -> {
            harfNotu = "AB"
        }
        in 85..89 -> {
            harfNotu = "BA"
        }
        in 80..84 -> {
            harfNotu = "BB"
        }
        in 75..79 -> {
            harfNotu = "BC"
        }
        in 70..74 -> {
            harfNotu = "CB"
        }
        in 65..69 -> {
            harfNotu = "CC"
        }
        in 60..64 -> {
            harfNotu = "CD"
        }
        in 55..59 -> {
            harfNotu = "DC"
        }
        in 50..54 -> {
            harfNotu = "DD"
        }
        in 0..49 -> {
            harfNotu = "FF"
        }
    }

    println("$dersAdi dersinden aldiginiz not : $grade")
    println("$dersAdi dersinden aldiginiz harf notu: $harfNotu")
    if (vize2Yuzdelik != 0.0) {

    }

}

fun calculateGrade(
    vize1Not: Double,
    vize1Yuzdelik: Double,
    vize2Not: Double,
    vize2Yuzdelik: Double,
    finalYuzdelik: Double,
    finalNot: Double,
    odevYuzdelik: Double,
    odevNot: Double,
    quizYuzdelik: Double,
    quizNot: Double,
): Double {
    return (((vize1Not * vize1Yuzdelik) / 100) + ((vize2Not * vize2Yuzdelik) / 100) + ((finalYuzdelik * finalNot) / 100) + ((odevYuzdelik * odevNot) / 100) + ((quizYuzdelik * quizNot) / 100))
}

private fun readLineNotNull(): String {
    return readLine() ?: "0"
}

