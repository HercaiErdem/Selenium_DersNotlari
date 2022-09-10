package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

       /*
       Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfayi simge durumuna getirin
simge durumunda 3 saniye bekleyip sayfayi maximize yapin
Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
Sayfayi fullscreen yapin
Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
Sayfayi kapatin
        */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://youtube.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(" Pencere konumu: " + driver.manage().window().getPosition()); // Acilan browser in konumunu verir.
        System.out.println("Pencerenin boyutu: " + driver.manage().window().getSize());  // Acilan browser in boyutunu verir.

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize(); // pencereyi simge durumuna getirir.

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        driver.manage().window().maximize();
        System.out.println("Yeni Pencere Konumu: " + driver.manage().window().getPosition());
        System.out.println("Yeni Pencere Olculeri: " + driver.manage().window().getSize());

        Thread.sleep(3000);

        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Full Screen Konumu: " + driver.manage().window().getPosition());
        System.out.println("Full Screen Olculeri: " + driver.manage().window().getSize());

        Thread.sleep(3000);

        //Sayfayi kapatin
        driver.close();


    }
}
