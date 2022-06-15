package a2Basics

fun main() {

    /**
     * sonlu sayili liste olusturur, kucukten buyuge icin .. ya da rangeTo() fonksiyonu kullanilabilir
     * buyukten kucuge liste .. ile olusturulamaz ancak downTo() kullanilabilir, infix kullanimi da vardir
     */

    val numbers = 1..100 //[1-100]
    val numbers2 = 1.rangeTo(100)
    println(numbers + numbers2)
//    val numbers3 = 1 rangeTo 100
    /*---------------------------------------------------------------------------------------------*/
    val reversedNumbers = 100.downTo(1)
    val reversedNumbers2 = 100 downTo 1
    println(reversedNumbers + reversedNumbers2)

    /**
     * Charlardan olusan bir liste de yapilabilir ancak turkce karakterleri iceremez
     */
    val alphabet = 'A'..'Z'
    println(alphabet)

    /**
     * until fonksiyonu ile de range tanimlanir, son degere kadar olanlardan olusur (son deger dahil edilmez)
     */
    val gradeNumbers = 10.until(101) // [10-101) , [10-100]
    val gradeNumbers2 = 10 until 101
    gradeNumbers.forEach {
        print(", " + it)
    }
    println()

    /*-------------------------------------------------------------------------------------------------------------*/

    /**
     * step fonksiyonu ile liste olusturulurken belirlenen araliklarla siralama yapilabilir
     */

    val steppedNumbers = 1..100 step (2)
    val steppedNumbers2 = 1..100 step 5
    steppedNumbers.forEach { print(", " + it) }
    println()

    println(steppedNumbers2) // bu sekilde yazildiginda  1..96 step 5 seklinde yazilir

    val reverseSteppedNumbers = 100 downTo 1 step 3
    val reverseSteppedNumbers2 = 50 downTo 25 step 5
    reverseSteppedNumbers.forEach { print(", " + it) }
    println()
    /*----------------------------------------------------------------------------------------------------------------*/

    /**
     *  CharRange, IntRange gibi primitive tiplere de atama yapilabilir
     *  bu durumda first, last, step, count gibi bilgiler alinabilir
     */
    val numbersList: IntRange = 10 until 90
    numbersList.first
    numbersList.last
    numbersList.step
    numbersList.count()

    when (10) {
        in numbersList -> {
            println("10 sayisi numberList icerisinde yer alir")
        }
    }
    val countBiggerThan50 = numbersList.count { it > 50 }
    println(countBiggerThan50)
    println("numbersList.avg ${numbersList.average()}")
    println("numbersList.rev ${numbersList.reversed()}")
}
