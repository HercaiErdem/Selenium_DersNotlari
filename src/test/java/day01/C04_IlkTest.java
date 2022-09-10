package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        1- Amazon sayfasina gidiniz
        2- Basligin "Amazon" icerdigini test edin
        3- Url'nin amazon içerdiğini test ediniz
        4- Sayfayı kapatınız
         */

        driver.manage().window().maximize();
        // 1- Amazon sayfasina gidiniz
        driver.get("https:/www.amazon.com");

        // 2- Basligin "Amazon" icerdigini test edin
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actualTitle.contains(istenenKelime)) {
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");

        // 3) Sayfa adresini(url) yazdirin
        String url = driver.getCurrentUrl();
        System.out.println("i URL degeri : " + url);

        // 4) Sayfa url’inin “amazon” icerdigini test edin.
        String urldeArananKelime = "amazon";
        String urldeOlanKelime= driver.getCurrentUrl();
        if (urldeOlanKelime.contains(urldeArananKelime)) {
            System.out.println("URL testi PASSED");
        } else
            System.out.println("URL testi FAILED");


        // 5) Sayfayi kapatiniz
        driver.close();

    }
}
