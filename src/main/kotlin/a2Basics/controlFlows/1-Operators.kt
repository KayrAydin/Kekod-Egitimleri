package a2Basics.controlFlows

fun main(args: Array<String>) {
    var numberOne = 10
    val numberTwo = 5

    println("numberOne : ${numberOne}")
    println("numberOne : ${numberOne++}")
    println("numberOne : ${numberOne}")
    println("numberOne : ${++numberOne}")

    println("${numberOne + numberTwo}")
    println(" ")
    println(numberOne.plus(numberTwo))

    println("${numberOne - numberTwo}")
    println(" ")
    println(numberOne.minus(numberTwo))

    println("${numberOne / numberTwo}")
    println(" ")
    println(numberOne.div(numberTwo))

    println("${numberOne * numberTwo}")
    println(" ")
    println(numberOne.times(numberTwo))

    println("${numberOne % numberTwo}")
    println(" ")
    println(numberOne.rem(numberTwo))   // rem -> remaining (bolumden kalan)
// kalan hesabinda 2 bulmasinin sebebi numberOne degiskeninin son degerinin 12 olmasi, bkz 9. satir
    println("------------------------------------------------------")

    print("Final notunu giriniz : ")
    val grade = readLine()!!.toInt()

    val charNote = if (grade == 100) {
        "$grade = AA"
    } else if (grade <= 99 && grade >= 80) {
        "$grade = BB"
    } else if (grade <= 79 && grade >= 50) {
        "$grade = CC"
    } else if (grade <= 49 && grade >= 35) {
        "$grade = DD"
    } else if (grade <= 34 && grade >= 0) {
        "$grade = FF"
    } else {
        "$grade = Lutfen 0 ile 100 arasinda sayisal bir deger giriniz!"
    }
    println(charNote)
    println("---------------------------------------------------")
    println(grade.compareTo(100) > 0)
    println(grade.compareTo(100) < 0)
    println(grade.compareTo(100) >= 0)
    println(grade.equals(100))
    println(grade.equals(100))
    println(!grade.equals(100))
    println(charNote)

    /*
    a>b a.compareTo(b) > 0
    a<b a.compareTo(b) < 0
    a>=b a.compareTo(b) >= 0
    a<=b a?.equals(b)?: (b === null)
    a==b a?.equals(b)?: (b === null)
    a!=b !(a?.equals(b)?: (b === null))
    */
    println("----------------------------------------------------------------------------------")

    var a = 20
    var b = 5
    a += b
    println("a+=b :" + a)
    a -= b
    println("a-=b :${+a}")
    a *= b
    println("a*=b :${+a}")
    a /= b
    println("a/=b :" + a)
    a %= b
    println("a%=b :" + a)

    /*
        a+=b    a.plusAssign(b)
    	a-=b    a.minusAssign(b)
        a*=b    a.timesAssign(b)
        a/=b    a.divAssign(b)
        a%=b    a.remAssign(b)
     */
    println("------------------------------------------------------------------------------------------")

    var numOne = 10
    var numTwo = 5
    var flag = true
    println("+a :" + +numOne)
    println("q-b :" + -numTwo)
    println("++a :" + ++numOne)
    println("a++ :" + numOne++)
    println("a :" + a)
    println("--b :" + --numTwo)
    println("!flag :" + !flag)

/*
   +a      a.unaryPlus()
   -a      a.unaryMinus()
   ++a     a.inc()
   --a     a.dec()
   !a      a.not()
*/

    println("---------------------------------------------------------------------------------------------")

    /**
     *      === ifadesi isaret edilen referans tipleri karsilatirir.
     *      == ifadesi degeri karsilastirir.
     */
}
