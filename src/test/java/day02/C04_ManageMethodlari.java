package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
8. Sayfayi kapatin
         */

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu: " + driver.manage().window().getSize());

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        driver.manage().window().setPosition(new Point(20, 20));
        driver.manage().window().setSize(new Dimension(600, 300));

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanin Yeni Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Yeni boyutlari = " + driver.manage().window().getSize());

        Thread.sleep(2000);
        //Sayfayi kapatin
        driver.close();

    }
}
