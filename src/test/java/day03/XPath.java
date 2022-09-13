package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPath {
    /*
1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu'nun gorunur oldugunu test edin
4- Delete tusuna basin
5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin
 */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();


        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@class='added-manually']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("Delete Buton Testi PASSED");
        } else System.out.println("Delete Buton Testi FAILED");

        // tex ile locate etmek
      //  driver.findElement(By.xpath("//*[text()='Add Element']")).click(); // xpath'de text ile locate alma
        /*
        Locate alırken sadece text kullanıcaksak //*[text()='Add Element'] bu formatt kullanılır
        Atribute kullanıcaksak //*[@onclick='addElement()'] bu format kullanılır
         */

        Thread.sleep(2000);
        // Delete tusuna basin
        deleteButonu.click();

        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoteElements = driver.findElement(By.xpath("//h3"));
        // tag name ile
        //  WebElement addRemoteElements = driver.findElement(By.tagName("h3"));

        //  5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin
        addRemoteElements = driver.findElement(By.xpath("//h3"));
        if (addRemoteElements.isDisplayed()) {
            System.out.println(" Test PASSED");
        } else System.out.println(" Test FAILED");

        // 6- Sayfayi kapatiniz
        driver.close();


    }

}
