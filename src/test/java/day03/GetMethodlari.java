package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    /*
    Amazon sayfasina gidiniz
    Arama kutusunu locate ediniz
    Arama kutusunun tagName'inin input oldugunu test ediniz
    Arama kutusunun name atributu'nun degerinin field-keywords oldugunu test ediniz
    Sayfayi kapatiniz
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Amazon sayfasina gidiniz
        driver.get("https://amazon.com");

        //2. Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //3.  Arama kutusunun tagName'inin input oldugunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("TagName Test PASSED: " + actualTagName);
        } else System.out.println(("TagName Test FAILED"));

        //4. Arama kutusunun name atributu'nun degerinin field-keywords oldugunu test ediniz
        String expectedNameAtribute = "field-keywords";
        String actualAtributuName = aramaKutusu.getAttribute("name");
        if (actualAtributuName.equals(expectedNameAtribute)) {
            System.out.println("Atribute TESTI PASSED");
        } else System.out.println("Atribute TESTI FAILED");


        //5  Arama kutusunun konumunu yazdiriniz
        System.out.println("Arama kutusu konumu: " + aramaKutusu.getLocation());

        Thread.sleep(2000);
        //Sayfayı kapatınız
        driver.close();

        /*
        TAGNAME Her webelementin ilk siradaki ismidir ÖRNEK =INPUT
ATRIBUTE ISE --->  id   ----value name --  dir --class--
bunlarin icinde olanlar ise   atribute degerleridir .
         */


    }


}
