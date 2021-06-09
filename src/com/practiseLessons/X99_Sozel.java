package com.practiseLessons;

public class X99_Sozel {
    /*
        ChromeDriver driver1 = new ChromeDriver(); // Normal yoldan obje olusturduk.
        WebDriver driver = new ChromeDriver(); // polymorphic olarak objemizi olusturduk.(parent-child)
        - Driver objemizi polymorphic olarak kullaniyoruz gormedigimiz
        tarafta class'lar birbirine inherit halde.
        Webdriver interface'dir, ChromeDriver() olusturdugumuz objenin class'i
        Bunlar aralarinda inherit halde.

        - quit butun sekmeleri kapatir, close sadece o sekmeyi kapatir.

        - Selenium'daki wait cesitleri :
        1) Static Wait => Java'dan gelir, icerisinde milisaniye yazilir. Exception'i handle etmek zprundayiz.
        2) Dynabic Wait
            a) implicity wait => findElement() aktif oluyor

            b) explicitly wait => elementToBeClickable
                                  elementToBeVisibale

            c) fuluent wait =>

            En cok hangi wait'i kullaniyorsunuz ?
            Tread.sleep()'i kulllaniyorum DEMEMELIYIZ, profesyonel alanda bu method cok nadir ve
            cok gerekli durumlarda kllanilir.
            BU SORUYA CEVABIMIZ : Oncelikle implicity wait kullanilirim.
            implicity wait cogu zaman DOM'da findElement bulundugunda clickable
            veya visible olabiliyor. Internet hizimiza, makinemizin gucune bagli olarak
            ama bazi ozel durumlarda da explicitly wait'i kullanirim.
            Bu ozel durumlar element'in clickable olmasidir, tiklamamiz gerekiyordur.
            Elementin isDisable veya isEnable gibi bir assertion'da check etmemiz gerekiyordur
            dolayisiyla visible olmasini beklememiz gerekebilir. Boyle durumlar kullanabiliriz.
            Implicity wait'de kullanacagimiz sure max 20 sn'dir.
            Explicity wait'de
            Implicity wait ve Explicity wait'i beraber kullanmak cok makul degildir.
            Ama gerekli yerlerde kullanilmasi zorunludur.
     */

    // 1 STATIC WAIT :
    public static void main(String[] args) throws InterruptedException {
        // Thread.sleep(3000);
        staticWait(1); // Method olusturup her seferinde ugrasmaya gerek kalmaz.
    }

    public static void staticWait(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
