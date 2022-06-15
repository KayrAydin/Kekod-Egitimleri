package a2Basics

fun main() {
    /** Value araligina gore bit size kullanilmasi (degisken tipi atanmasi)
     * yapilmali ki yazilan kodun kullandigi ram boyutu ihtiyacindan fazla olmasin
     * (kodun performansi ve verimi icin)
     * Byte<Short<Int<Long (boyuta gore siralamasi orn byte min -128, max 127)
     * Deger eger bilmedigimiz bir araliktaysa ya da degisebilirse Long kullanilmalidir ki aralik disinda bir deger olmasin
     * Her bir tip bir oncekinin 2 kati kadar yer kaplar
     */

    /**
     * Kesirli sayilar icin Float ve Double kullanilabilir
     * decimal kismi kucukse Double ama bilimsel (ondalik kismi buyuk) islemlerde Float tercih edilir
     */
// Bir cok uygulamada bu konu cok fazla onem arzetmeyecek cunku bu boyutta bir performans farki icin
    // o boyutta bi zaman ve emek yukune gidilmez en sik Int ya da Double / Float kullanilacaktir
    // Ancak goruntu isleme gibi performansin cok onem kazandigi yerlerde bu sayisal degerleri bilip o araliklara gore en
    //uygunu kullanilarak yazmaya ihtiyac olacaktir.

    val minByteValue: Byte = Byte.MIN_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE

    val minShortValue: Short = Short.MIN_VALUE
    val maxShortValue: Short = Short.MAX_VALUE

    val minIntValue: Int = Int.MIN_VALUE
    val maxIntValue: Int = Int.MAX_VALUE

    val minLongValue: Long = Long.MIN_VALUE
    val maxLongValue: Long = Long.MAX_VALUE

    val minFloatValue: Float = Float.MIN_VALUE
    val maxFloatValue: Float = Float.MAX_VALUE

    val minDoubleValue: Double = Double.MIN_VALUE
    val maxDoubleValue: Double = Double.MAX_VALUE

    println("minByteValue :" + minByteValue)
    println("maxByteValue :" + maxByteValue)
    println("minShortValue :" + minShortValue)
    println("maxShortValue :" + maxShortValue)
    println("minIntValue :" + minIntValue)
    println("maxIntValue :" + maxIntValue)
    println("minLongValue :" + minLongValue)
    println("maxLongValue :" + maxLongValue)
    println("minFloatValue :" + minFloatValue)
    println("maxFloatValue :" + maxFloatValue)
    println("minDoubleValue :" + minDoubleValue)
    println("maxDoubleValue :" + maxDoubleValue)

    /**
     * Long degisken sonuna "L" konularak da atanabilir
     * Float degisken sonuna "F" ya da "f" konularak da atanabilir
     * Double icin geleneksel gosterim gerekir
     * Deciman tanimi yapilir [0-9]
     * Octal tanimi yapilir [0-7]
     * Hexadecimal tanimi yapilir
     * Binary tanimi yapilir
     */

    val longNumber = 1586L
    //  val longNumber2 = 1586l kucuk l calismaz, 1 ile karistirilmamasi icin boyleymis
    val floatnumber1 = 19.90F
    val floatNumber2 = 13f
    val doubleNumber = 3.14
    val doubleNumber2 = 3.14e10
    val decimalNumber = 1907
    //  val octalNumber = 0197 calismiyor  0la baslayan bir value verilemez kotlinde
    val hexadecimalNumber = 0x759
    val binaryNumber = 0b01000011
    // Ctrl + F arama ekranini acar, bu ekrandan aradiginiz herhangi bir harf ya da sozcukte bulunan tum
    // sonuclari Ctrl + Alt + Shift + J ile secip direkt olarak yerine degisiklik gerceklestirebilirsiniz
    val oneMillion = 1_000_000
    println(oneMillion)
    // Kotlinde kolay okumak adina sayilarin arasina "_" konulabilir bu sayisal degeri degistirmez ve sonuc _ ler olmadan gosterilir
    val creditCardNumber = 1234_5678_9012_3456L
    val bytes = 0b01000011_01101111_01100101_01101101_01111001
    println("creditCardNumber :" + creditCardNumber)
    println(bytes)

    /**
     *  Boxed  Degiskenin obje referansi olarak tutulmasidir
     *  UnBoxed Degiskenlerin primitive olarak tutulmasidir
     *   === operatori degiskenlerin referansini karsilastirirken kullanilir
     *   == operatoru degiskenlerin degerlerini karsilastirilirken kullanilir
     */

    val number: Int = 10000 //int
    println(number === number) //true
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number
    println(boxedNumber === anotherBoxedNumber) // false

    val number2: Int = 10000
    println(number2 == number2) // true
    val boxedNumber2: Int? = number2
    val anotherBoxedNumber2: Int? = number2
    println(boxedNumber2 == anotherBoxedNumber2) // true

    /**
     * Backendden donen double ve float degiskenleri kullanilirken dikkatli olunmali
     * Eger backendden donen degerler uzerinde "." isaretlerine gore bir split isi yapilacaksa basiniz agriyabilir
     * cunku backendden donen double ve float degiskenleri her zaman "." ile ayrismiyor olabilir.
     * database dilinin farkli olmasina gore (tr-ing gibi) "." yerine "," ile de ayrisiyor olabilir
     * bkz. 0.25 ve 0,25 gibi
     */
}
