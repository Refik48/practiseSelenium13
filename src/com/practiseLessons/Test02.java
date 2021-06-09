package com.practiseLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        /*
            walmart'a gidin
            Tam sayfa yapin
            sayfayi refreshleyin
            sayfa basliginin "Save" ifadesi iceridigini control edin
            sayfa basliginin "Walmart.com | Save Money.Live Better" a esit old. kontrol ediniz.
            URL walmart.com icerdigini control edin
            Sayfayi kapatin
         */
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.walmart.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        String sayftaTitle = driver.getTitle();
        String sayfaTitle2 = driver.findElement(By.xpath("//title")).getText();
        // 2 sekilde de title'a alabiliriz.

        // sayfa basliginin "Save" ifadesi iceridigini control edin
        String expectedTitleSave = "Save";
        if(sayftaTitle.contains(expectedTitleSave)) {
            System.out.println("PASS !");
        } else {
            System.out.println("FAIL !");
            System.out.println("Title Save kelimesini icermiyor.");
            System.out.println(sayftaTitle);
        }

        // sayfa basliginin "Walmart.com | Save Money.Live Better" a esit old. kontrol ediniz.
        String expectedSayfaTitle = "Walmart.com | Save Money.Live Better";
        if(sayftaTitle.contains(expectedSayfaTitle)) {
            System.out.println("PASS !");
        } else {
            System.out.println("FAIL !");
            System.out.println("Sayfa Url'si Walmart.com | Save Money.Live Better icermiyor.");
            System.out.println(sayftaTitle);
        }

        // URL walmart.com icerdigini control edin
        String sayfaUrl = driver.getCurrentUrl();
        String expectedSayfaUrl = "walmart.com";
        if(sayfaUrl.contains(expectedSayfaUrl)) {
            System.out.println("PASS !");
        } else {
            System.out.println("FAIL !");
            System.out.println("Sayfa Url'si walmart.com icermiyor.");
            System.out.println(sayfaUrl);
        }
    }
}
