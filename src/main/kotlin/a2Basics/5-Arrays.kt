package a2Basics

fun main() {
    /**
     * Dizi tanimlamak icin kullanilir
     * arrayOf(ayni tip degerler) tanimlanabilir
     * arrayOf<any>(farkli tip degerler kullanilabilir
     * arrayOfNulls<Type>(size) seklinde verilen boyut kadar null iceren dizi tanimlanir
     */

    // index = 0 1 2 3 4 5
    val studentNubers = arrayOf(13, 45, 53, 54, 25, 20)
    val studentNames = arrayOf("Ahmet", "Ayse", "Veli", "Derya")
    val firstCharOfNames = arrayOf('A', 'A', 'V', 'D')
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'V', true)
    val arrayOfNulls = arrayOfNulls<String>(4)

    /* -----------------------------------------------------------------------------------------------------------------*/

    /**
     * Array<Type>(size){higher order function} seklinde de tanimlanabili
     * bu durumda higher order function icerisinde son satira denk gelen degerler diziyi olusturur
     * higher order function icerisi dizinin boyutu kadar indexi(it) bir arttirarak calisir
     */
// 5 elemanli, tum elemanlari 3.14 x indexDegeri olan bi dizi olusturur
    val carNamesMini = Array<Double>(5) {

        3.14 * it
    }

    carNamesMini.forEach { println(it) }
    // 10 elemanli, 0-9 arasi index degerlerinin karesini alan bi dizi olusturur
    // {0,1,4,9,16,25,36,49,81}
    val carNames = Array<Unit>(10) {
        println((it * it).toString())
    }

    /**
     * ByteArray, ShortArray, IntArray, LongArray, DoubeArray, FloatArray gibi ya da bunlarin unsigned
     * primitive array tanimlamalari da yapilabilir
     * bu tarz tanimlamalarda ilgili index degerine atama icin set(index, value) ya da [index] = value kullanilabilir
     * bu tarz tanimlamalara get(index) ya da [index] seklinde ulasabilirsiniz
     */

    val firstCharOfCountries = CharArray(4)
    firstCharOfCountries[0] = 'T'
    firstCharOfCountries.set(1, 'I')
    firstCharOfCountries[2] = 'A'
    firstCharOfCountries[3] = 'B'
    println("firstCharOfCountries index 2:" + firstCharOfCountries[2])
    println("firstCharOfCountries index 2:" + firstCharOfCountries.get(2))

    /* --------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * val ile tanimlanmis bir arrayin herhangi bir indexindeki deger degistirilebilir
     * val indexindeki degerlerin degismesine karismaz
     * ancak ilgili diziyi baska bir diziyle esitlemenize izin vermez
     * bunun icin tanimlamayi var ile degistirmeniz gerekir
     */
    val awesomeArray = arrayOfNulls<String>(5)
    awesomeArray[2] = "Kayra"
//    awesomeArray = arrayOF("foo","boo","goo","doo","loo") //calismaz
    /**
     * Arrayin sizesi disina cikiyorsaniz TypeOutOfBound hatasi alinir
     */
}