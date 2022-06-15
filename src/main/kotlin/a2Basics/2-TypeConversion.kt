package a2Basics

fun main() {
    /**
     * Implicit Type Conversion : Belirgin olmayan / ortulu tip donusumu
     * Explicit Type Conversion : Belirgin / acik tip donusumu
     */
    /**
     * Kotlin'de implicit type conversion yoktur
     */
// val number : Int = (Int) 3L // calismaz implicit donusemedigi icin
    /**
     * Tip donusumu icin kullanilabilir fonksiyonlar:
     * toByte(), toShort(), toInt(), toLong(), toDouble(), toFloat(), toChar(), toString(),
     * toUByte(), toUShort(), toUInt(), toULong(), toDuration(), toBigDecimal(), toBigInteger()
     */
    /**
     * Kotlin donusumleri disinda java icin olan donusum kodlari da kullanilabilir
     * cunku her ikisinin de bit arrayi ayni
     */
    val schoolNumber = 126.toByte()
    val convertedValue: Short = schoolNumber.toShort()

    println("schoolNumber :" + schoolNumber)
    println("convertedValue :" + convertedValue)

    val tcIdentityNumber = 16000000000
    val convertedInt = tcIdentityNumber.toInt()
    println(convertedInt)

    val totalValue: Long = tcIdentityNumber + schoolNumber // Long + Byte = Long
    println(totalValue)

    val Byte1: Byte = 127
    val Byte2: Byte = 126
    val totalByteEquation = Byte1 + Byte2
    println(totalByteEquation)

    // bu toplami short olarak almiyor int istiyor ve short olarak tanimladigimda hata aliyorum
    // unsigned degerler yani ubyte gibi degerlerde negatif degerler alinamaz ancak pozitif degerlerin maxi gecen degerleri
    // - deger olarak tekrardan yazilir yani unsigned denildigi takdirde asla negatif bir sayi icermeyecek degerler icin
    //kullanilir ve bu sayede limitin 2 kati kadar kullanilabilmis olunur

}
