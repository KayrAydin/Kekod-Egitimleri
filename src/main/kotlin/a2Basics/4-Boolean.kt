package a2Basics

fun main() {
    /**
     * true ya da false atamasi icin kullanilir
     * 0 ya da 1 olarak kullanilamaz
     */
    val isStudent: Boolean = true
    val isTeacher: Boolean = false

    /**
     * &&, ||, and, or, xor gibi operatorlerle beraber kullanilir.
     */
    if (isStudent && isTeacher) {
    }
    if (isStudent and isTeacher) {
    }
    if (isStudent || isTeacher) {
    }
    if (isStudent or isTeacher) {
    }
    if (isStudent.or(isTeacher)) {
    }
    /**
     * infix fonksiyonlari or ya da alttaki varyantta yazilabilir and icin de aynisi gecerlidir
     */

    /**
     * Boolean degerin true olmasini kontrol ettirmek icin == true seklinde kontrol gerekmez
     * zaten true oldugu takdirde parantezler icine girecektir
     */
    if (isStudent == true) {

    }
    if (isStudent) {

    }
    // yukaridaki her iki gosterim de aynidir

    /**
     * ayni sekilde falsa icin de gecerlidir.
     * booleanda degisken basina ! konularak tersi alinabilir
     * bu durumda false ise if komutunda donecektir
     */
    if (isStudent != true) {

    }

// if (!isStudent) {
// }
    if (isStudent.not()) {

    }

}