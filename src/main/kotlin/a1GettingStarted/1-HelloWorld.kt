package a1GettingStarted

import kotlin.math.pow

fun main() {
    print("Hello World")
    print("Hello World2")
    println("Hello World3")
    println("Hello World4")
    println("println komutu bi alt satira gecer ancak print yan yana devam eder.")
    println("main komutu ozel bir komuttur ve tekrardan eklenildigi takdirde hata verir.")
    println("uygulamanin calismasi icin bir adet main fonksiyonuna kesinlikle ihtiyac var!")
    //ders yapildigi icin package ismi bu sekilde normalde format farkli olacak
// pow komutu us alma formulu
    // pow gibi hazir komutlarda import etmek gerekmektedir ve bunlar kotlin tarafindan otomatik gerceklestirilebilir
    //bir kotlin programi icersinde package ismi kullanilirsa harici library importu ve bir main fonksiyona ihtiyac var
//fun main() {
    // } seklinde ya da
    // fun main(args: Array<String>){
    // }
   // edit config kismindan yazilan kisimda config kismindan program arguments kismindan on tanimli stringler girilebilir
    //array icersinde
    //istenilen kisma debug key yerlestirilebilir (ilgili satirda sayinin hemen sagina sol tiklanarak)
    //sonra daha genis sekilde anlatilacak
    // play tusuna sag tiklanilip run yerine debug denilirse kod isaretcinin oldugu yerde duracak
    //herhangi bir koda sag tiklayip evaluate denilirse (alt+F8) (az once eklenen) configleri gorulebilir (break pointler)
    //args sayesinde on tanimli bilgiler gorulmus olur

    3.14.pow(2.1)
}

/*fun main(args: Array<String>) {
    println("Hello World")
    // yalnizca bir main fun olabilir ve diger fun siradan bir fonksiyona donusur istenilirse fonksiyon cagrilir ama yalnizca ismi main olmus olur
}
*/
// Tekil yorum satiri

/*
bu sekilde
her satir kullanilr
coklu yorum satiri
 */

/**
 * dokumantasyon yorum satiri  @param args program argumentlerini tutar
 */
//Yazilan kodlardan oto dokumentasyon olusturan toollar var
//gibi notlar alinabilir (calisilan sirkete bagli olarak muhtemelen 2-3 yil sonra gerekir) yesil olmasi onemlidir

//commentler onemli ancak fazla ya da az olmamali hic yazmamak da kotu her seyi yazmak da

// TODO To do kisayolu olarak kullanilabilir duzeltme gibi sonradan degistirilecek yerler icin kullanilabilir

// shift-> shift tiklayarak acilan ekrana show kotlin bytecode diyip sagda bytecodesi (assembly kodu) gsterilir
//jbm uzerinde calisan kod o olmus olur, java ve kotlin klasslari ayni bytecodeu uretir
//bu iki class birbirine donusturulebilir/kullanilabilir/cagrilabilir
//kotlin bytecode uzerinden decompile denilerek bir dosyanin(kotlin dosyasinin) java versiyonunu gosterir.
//javada standalone komut yazilamaz
// ayni sekilde java da kotline donusturulebilir
