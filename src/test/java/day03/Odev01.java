package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       /*
        1. Bir class oluşturun: LoginTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
                a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username :
        testtechproed@gmail.com
        ii. Password : Test1234!
                e. Expected user id nin
        testtechproed@gmail.com oldugunu dogrulayin(verify).
                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
        */

        //  a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        // c. email textbox,password textbox, and signin button elementlerini locate
        WebElement emailTexbox = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signing = driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
// i. Username : testtechproed@gmail.com
//  ii. Password : Test1234!
        Thread.sleep(2000);
        emailTexbox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        signing.click();

        //  e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expectedUser = driver.findElement(By.className("navbar-text"));

        // 1. yol isDisplayed() u kullanarak yaptim
        if (expectedUser.isDisplayed()) {
            System.out.println("ExpectedUser Testi PASSED");
        } else System.out.println("ExpectedUser Testi FAILED");


        // 2. yol equals() u kullanarak yaptik
        String istenenUserYazisi = "testtechproed@gmail.com";
        String gercegiUserYazisi = expectedUser.getText();
        if (istenenUserYazisi.equals(gercegiUserYazisi)) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");

        /*
        Bir Webelementin üzerindeki yaziyi konsolda yazdırabilmek için
         getText() methodu kullanılır
         */

        //  f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if (addresses.isDisplayed()) {
            System.out.println("Adresses TESTI PASSED");
        } else System.out.println("Adresses Testi FAILED");
        if (signOut.isDisplayed()) {
            System.out.println("SignOut TESTI PASSED");
        } else System.out.println("SignOut Testi FAILED");

        //   3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi: " + linklerListesi.size());

        System.out.println(linklerListesi);

        //4. Linkleri yazdirin

        //-----1. yol---
        for (WebElement each : linklerListesi) {
            System.out.println("Linkler: " + each.getText());
        }
        // 2. yol lambda ile
        linklerListesi.forEach(t -> System.out.println(t.getText()));

        Thread.sleep(2000);
        //5. sayfayi kapatiniz
        driver.close();


    }
}
