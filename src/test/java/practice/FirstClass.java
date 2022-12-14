package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("");

        driver.getCurrentUrl();
        driver.manage().window().maximize();

        driver.getTitle();

        driver.getPageSource();

        driver.getWindowHandle(); // sayfalar arasi gecis icin handle degerlerini bilemmeşz gerekiyor.

        driver.navigate(); // sayfalar arasi gec / don seklinde

        driver.quit();

        driver.close();

        driver.wait();


    }
}
