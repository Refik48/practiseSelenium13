package com.practiseLessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
    /*
        google.com'a gidin
        sayfayi tam sayfa yapin
        walmart.com'a gidin
        google sayfasina geri donun
        Sayfayi refresh yapin
        sayfayi kapatin
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        // Kendi makinemiz uzerinden path'imizi cagirdik ama istersek ;
        // proje altinda drivers diye klasor olusturup icerisine
        // chromedriver.exe gibi gerekli exe dosyalarini atarak java icerisinden de
        // path yolunu gosterebiliriz. TestNG veya JUnite sayesinde bu yonteme gerek kalmamistir.

       // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // polymorphic olarak objemizi olusturduk.(parent-child)
        // Driver objemizi polymorphic olarak kullaniyoruz gormedigimiz
        // tarafta class'lar birbirine inherit halde.
        // Webdriver interface'dir, ChromeDriver() olusturdugumuz objenin class'i
        // Bunlar aralarinda inherit halde.

        ChromeDriver driver1 = new ChromeDriver(); // Normal yoldan obje olusturduk.

        driver.manage().window().maximize();

        driver.get("http://www.google.com");
        driver.get("http://www.walmart.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();

        // quit butun sekmeleri kapatir, close sadece o sekmeyi kapatir.


    }
}
