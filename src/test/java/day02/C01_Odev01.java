package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {
    public static void main(String[] args) {


        /*
    Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfa basligini(title) yazdirin
    Sayfa basliginin “Amazon” icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url’inin “amazon” icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    Sayfayi kapatin.
     */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi: " + driver.getTitle());

        // Sayfa basliginin “Amazon” icerdigini test edin

        String actualTitle = driver.getTitle();
        String expectedKelime = "Amazon";
        if (actualTitle.contains(expectedKelime)) {
            System.out.println("Title Test PASSED");
        } else System.out.println("Title Test FAILED");

        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfanin Url adresi: " + driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "amazon";
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Url testi PASSED");
        } else System.out.println("Url testi FAILED");

        // Sayfa handle degerini yazdirin
        System.out.println("Handle degeri: " + driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test
        String olanKelime = driver.getPageSource();
        String olmasiniBekledigimizKelime = "Gateway";

        if (olanKelime.contains(olmasiniBekledigimizKelime)) {
            System.out.println("Sourcepage Testi PASSED");
        } else {
            System.out.println("Sourcepage Test FAILED");
        }

        // Sayfayi kapatin.
        driver.close();


    }
}
