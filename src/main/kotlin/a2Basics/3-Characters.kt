package a2Basics

fun main() {
    /**
     * Tek tirnaklarin arasi harf sayi escape char ya da unicode yazilir
     * Cift tirnak icerisine yazilan string olur char olmaz
     */
    val firstCharOfName: Char = 'G'
    //val firstCharOfName2 : "G"    cift tirnak oldugundan olmaz
    //val firstCharofName3: Char = 'Go'   birden fazla karakter oldugundan olmaz
    val charNumber: Char = '6'
    //val charNumber2: Char = '53'


    /**
     * number deger alan bir car degeri inte cevrilirken gercek sayisal degerini almaz
     * alacagi deger ascii tablosundaki o degerin karsiligi olacaktir
     */

    val convertedCharNumber = charNumber.code
    println("charNumber = " + charNumber)
    println("charNumber = " + convertedCharNumber)

    val escapeCharT: Char = '\t' // tab birakmak icin
    val escapeCharN: Char = '\n' // alt satir icin
    val escapeCharB: Char = '\b' // backspace icin
    val escapeCharR: Char = '\r' // satirbaasi
    val escapeChar1: Char = '\'' // ' ozel karakterini kullanmak icin
    val escapeChar2: Char = '\"' // " ozel karakterini kullanmak icin
    val escapeCharSlash: Char = '\\' // \ ozel karakterini kullanmak icin
    val escapeCharDollar: Char = '\$' // $ ozel karakterini kullanmak icin

    val loremIpsum =
        "Lorem IpsumT " + escapeCharT + "escapeCharN " + escapeCharN + "Lorem IpsumB " + escapeCharB + " Lorem IpsumR " + escapeCharR + "Lorem IpsumChar1 " + escapeChar1 + "lorem IpsumChar2 " + escapeChar2 + "Lorem IpsumSlash " + escapeCharSlash + "Lorem IpsumDollar " + escapeCharDollar + "Lorem IpsumEnd"
    println(loremIpsum)

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * unicode karakterleri kullanmak icin kullanilabilir
     */

    val uniCode = '\uFF00'
    println("uniCode" + uniCode)
}
