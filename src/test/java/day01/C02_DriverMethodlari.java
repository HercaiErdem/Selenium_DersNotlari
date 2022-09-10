package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //Bunu yapmayi aliskanlik haline getir.
        // Amazon sayfasina gidiniz.
        driver.get("https://amazon.com");

        // Kaynak kodlarin icinde "Gateway" kelimesinin oldugunu kontrol ediniz.

       // System.out.println(driver.getPageSource()); // Sayfadaki kaynak code larini verir.
        String istenenKelime = "Gateway";
        if (driver.getPageSource().contains(istenenKelime)) {
            System.out.println("Pagesource testi PASSED");
        } else
            System.out.println("Pagesource testi FAILED");

        driver.close(); //sayfayi kapatir
        // driver.quit(); //Birden fazla sayfa varsa hepsini kapatir.




    }
}
