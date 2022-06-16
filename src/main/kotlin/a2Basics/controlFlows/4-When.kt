package a2Basics.controlFlows

fun main() {
    /**
     * switch casenin yerine gelmistir
     * when(karsilastirilacak_ifade)
     * value -> {}
     * value -> {}
     * else -> {}
     * formatinda kullanilir
     * tek satir yazilacaksa koseli paranteze gerek yoktur, ayni kodu calistiracak caseler arasina virgul konarak
     * kullanilabilir bu veya olarak kullanilmis olur
     */
    val countryCode = readLine()!!
    when (countryCode.lowercase()) { //toLowerCase() is deprecated
        "tr", "az" -> println("Türk Vatandaşı")
        "it" -> println("İtalya vatandaşı")
        "fr" -> println("Fransa Vatandaşı")
        "uk" -> println("Birleşik Krallık Vatandaşı")
        "us" -> println("Birleşik Devletler Vatandaşı")
    }
    when (countryCode.toInt()) {
        3.and(5) -> println("TC Vatandaşı")
        1 or 2 -> println("TC Vatandaşı")
    }
    /*----------------------------------------------------------------------------------------------------------------*/
    /**
     * when yanina karsilastirma ifadesi eklemek yerine bu ifadeler caselerin yanina da eklenebilir bu sayede
     *  && || and or xor gibi ifadeler de kullanilabilmis olur
     */
    when {
        countryCode.lowercase() == "tr" && countryCode.lowercase() == "az" -> println("TC Vatandaşı")
        countryCode.lowercase() == "it" -> println("İtalya Vatandaşı")
        countryCode.lowercase() == "fr" -> println("Fransa Vatandaşı")
        countryCode.lowercase() == "uk" -> println("Birleşik Krallık Vatandaşı")
        countryCode.lowercase() == "us" -> println("Birleşik Devletler Vatandaşı")
    }
    if (countryCode.lowercase() == "tr" || countryCode.lowercase() == "az") println("Türk Vatandaşı")
    else if (countryCode.lowercase() == "it") println("İtalya Vatandaşı")
    else if (countryCode.lowercase() == "fr") println("Fransa Vatandaşı")
    else if (countryCode.lowercase() == "uk") println("Birleşik Krallık Vatandaşı")
    else if (countryCode.lowercase() == "us") println("Birleşmiş Devletler Vatandaşı")
    /*--------------------------------------------------------------------------------------------------------------*/
    /**
     * if elselerdeki gibi whende de expression kullanimi yapilabilir
     */
    var countryCode2: String = if (countryCode.lowercase() == "tr" || countryCode.lowercase() == "az") {
        println("Türk Vatandaşı")
        "90"
    } else if (countryCode.lowercase() == "it") {
        println("İtalya Vatandaşı")
        "39"
    } else if (countryCode.lowercase() == "fr") {
        println("Fransa Vatandaşı")
        "33"
    } else if (countryCode.lowercase() == "uk") {
        println("Birleşik Krallık Vatandaşı")
        "44"
    } else if (countryCode.lowercase() == "us") {
        println("Birleşmiş Devletler Vatandaşı")
        "01"
    } else {
        "999"
    }

    countryCode2 = when (countryCode2.lowercase()) {
        "tr", "az" -> {
            println("Türkiye Vatandaşı")
            "90"
        }
        "it" -> {
            println("İtalya Vatandaşı")
            "39"
        }
        "fr" -> {
            println("Fransa Vatandaşı")
            "33"
        }
        "uk" -> {
            println("Birleşik Krallık Vatandaşı")
            "44"
        }
        "us" -> {
            println("Birleşmiş Devletler Vatandaşı")
            "01"
        }
        else -> {
            "999"
        }

    }

    countryCode2 = when {
        countryCode2.lowercase() == "tr" || countryCode2.lowercase() == "az" -> {
            println("TC Vatandaşı")
            "90"
        }
        countryCode2.lowercase() == "it" -> {
            println("İtalya Vatandaşı")
            "33"
        }
        else -> {
            "9990"
        }
    }
    /*---------------------------------------------------------------------------------------------------------------*/

}
