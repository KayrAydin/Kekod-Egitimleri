package a2Basics

fun main() {
    /**
     * cift tirnak icerisindeki metin butun olarak ele alinir
     * bu tarz string ifadelerin karakterleri tek tek alinarak tek tirnak icerisinde char olarak alinabilir
     */
    val name = "Kayra"
    val Char1 = 'K'
    val Char2 = 'A'
    val Char3 = 'Y'
    val Char4 = 'R'
    val nameArray = charArrayOf(Char1, Char2, Char3, Char4, Char2)

    for (char in name) {
        println(char)
    }
    val awesomeKeKod = "KeKod is Awesome"
    val firstCharOfAwesomeKeKod = awesomeKeKod[awesomeKeKod.indices.first]
    val lastCharOfAwesomeKeKod = awesomeKeKod[awesomeKeKod.indices.last]

    /*----------------------------------------------------------------------------------------------------------*/
    /**
     * farkli tiplerde degisken oncesi yazilan stringle degiskenin toplami string olur
     * ancak siralama tam tersi oldugunda kod calismaz
     */
    val numbersValue: String = "Value" + (1 + 2 + 3)
    //val numbersValue2: String = (1 + 2 + 3) + "Value"

    println("numbersValue" + numbersValue)

    /*-----------------------------------------------------------------------------------------------------------*/

    /**
     * Degiskenler + operatoru olmaksizin "" arasina yazilarak kullanilabilir
     *  bunun icin $ isareti kullanilir ve bu yapi string template olarak adlandirilir
     *  degiskenin herhangi bir ozelligine ihtiyac varsa ${} seklinde kullanilir
     */
    println("numbersValue $numbersValue")
    println("numbersValue ${numbersValue.length}")

    /**
     *  3 tane cift tirnak """ kullanilarak raw string olusturulur ideye nasil yazilirlarsa oyle gorunurler ve hizalama bozulmaz
     *  trimIndent() komutu kenar bosluklarini silmek icin kullanilir bu silme islemi her bir satirin en solundaki karakteri bazalarak gerceklesir
     *  raw stringlerin icerisinde escape karakterler calismaz
     *  trimMargin() parantez icerisine konulan karaktere kadar olan kismi siler
     *  bos birakildigi takdirde ise
     */

    val rawPineTree = """
               *
        $     ***
             *****
    """.trimIndent()

    val rawPineTreeDeneme1 = """
                  *
        $        ***
                *****  
    """

    val rawPineTree2 = """
                      *
          $          ***
                    *****  
    """.trimMargin("$")

    val rawPineTreeDeneme2 = """
                           *
             $            ***
                         *****  
    """.trimMargin()


    println("rawPineTree $rawPineTree")
    println("rawPineTreeDeneme1 $rawPineTreeDeneme1")
    println("rawPineTree2 $rawPineTree2")
    println("rawPineTreeDeneme2 $rawPineTreeDeneme2")
}