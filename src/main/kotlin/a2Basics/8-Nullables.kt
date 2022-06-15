package a2Basics

fun main() {

    /**
     * Bir degiskene null atamasi yapmak icin degisken tipinin sonuna ? konulur Int?
     * eger bir degiskene tip verilmeksizin null deger atamasi yapilirsa ide tip cikarimi yaparken
     * bu tipi Nothing? olarak isaretler cunku hangi tipe karsilik geldigini bilemez
     */

    // val name: String? = null
    // val age: Int? = null
    // val number7 = null
    //  val number73 = null
    var number71: Int? = null
    var number72: Int?
    var result: Int? = 0
    result!!.plus(324)
    // result?.plus(324)

    /*---------------------------------------------------------------------------------------------------------------*/

    /**
     * Nullable bir degiskenimiz varsa ve bu degiskenin metodlarindan birine ihtiyac duyarsak ya da direkt olarak
     * kullanacaksak ideye bu degiskenin null olmayacaginin garantisini !! operatoruyle vermemiz gerekir ya da null
     * deger olsa da calissin demek icin ?. operatorunu kullanmak gerekiyor. Best practice icin debug modda calisan
     * kodlarimiza !! vererek Kotlin Null Pointer Exception aliriz bu sayede sorunlari gorup cozmemiz kolaylasir ancak
     * canliya cikan kodlarimizin crash olmamasi icin ?. daha dogru olacaktir
     */

    number71 = readLine()!!.toInt()  //bu satirlarda readline() nin null olmayacagini !! ile belirttigimiz icin alt
    number72 = readLine()!!.toInt()   // satirda tekrardan nullable controlune gerek kalmiyor (smart cast)

    result = number71 + number72

    println("result")
    println(result)

//      nullable kontrolu if dongusunde de yapilabilir ancak cok onerilmez (kekodan kasit kotuyse boyle anladim)
//    if (number71 != null && number72 != null) {
//        result = number71 + number72
//    }
}