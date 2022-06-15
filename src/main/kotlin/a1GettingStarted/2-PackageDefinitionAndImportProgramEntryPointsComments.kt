package a1GettingStarted

fun main() {
// val ya da var keyworduyla baslanilir
//     Sayisal : numbers (short byte int double float) Mantiksal: (evet/hayir , var/yok) boolean Tekil karakter: char
    // degisken tipi dizisi : array gibi bunlar sonradan islenecek
    val name: String = "Kayra"
    var surName: String = "AYDIN"
    //burada string oldugu belirtilmese de olur cunku "" isareti gibi seylerden oturu yapi itibariyle program ne oldugunu anlar

    surName = " AYDIN"
//    name = "Mehmet" komutunda val cannot be reassigned hatasi verilir
// val degiskeni turune yalnizca bir deger atanabilir.
//var degiskeni istenildigi kadar degistirilebilir

    print(name)
    print(surName)
    /* Is sorusu olarak cikabilir
//default olarak her seye val ile baslayin ancak degistirilmesi gerekirse sonradan var olarak degistirin
// var&val'a kiyasla daha performansli calisir ancak yine de val kullanilarak baslanilir cunku islemci (thread) cekirdekleri
//    farkli threadlerle calisilirken her bir veri alis-verisinin bir is yuku var burada val degistirilemediginden
// val kullanildiginda degiskenin degisip degismediginin sinanmasi (diger threadlar tarafindan) gerekmediginden
// is yuku daha az olur ve daha performansli gerceklesmis olur.

const val name: String = Kayra
const val ile val arasindaki fark da sorulur (sonra anlatilacak)
*/
// value immutable (degismez)
// variable mutable (degisebilir)
    val age = 25
    var eyeColor: String
    eyeColor = "Brown"
    //   var skinTone
    // var skinTone = "White"
    //ya da
    // var skinTone: String
    //seklinde olmali
    //  skinTone = "White"
    // eger = ile deger atanmazsa : ile degisken tipi belirtilmelidir cunku atama yapilmadan program degiskenin ne oldugunu anlayamaz.

    // Tip donusumleri var olsa dahil gerceklesemez, bunlar icin ayri komutlar var.
    // degisken tipi belliyse farkli tipte degisken atanamaz ancak ayni tipte degisken atanabilir
    // Is icin herhangi bir challenge yapilirsa o challenge uzerinde hic warning birakilmamalidir birakilmasi direkt elemeye sebep olmasa da developerin temiz calismadigi gibi bir dusunce yaratabilir

}

