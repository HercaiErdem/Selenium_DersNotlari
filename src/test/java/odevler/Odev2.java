package odevler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
    Yeni bir Class olusturalim.C05_NavigationMethods
Youtube ana sayfasina gidelim . https://www.youtube.com/
Amazon soyfasina gidelim. https://www.amazon.com/
Tekrar YouTube’sayfasina donelim
Yeniden Amazon sayfasina gidelim
Sayfayi Refresh(yenile) yapalim
Sayfayi kapatalim / Tum sayfalari kapatalim
     */
        driver.manage().window().maximize();

        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://youtube.com");
        Thread.sleep(1000);

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://amazon.com");
        Thread.sleep(1000);

        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(2000);

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(1000);

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        Thread.sleep(1000);

        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();


    }

}
