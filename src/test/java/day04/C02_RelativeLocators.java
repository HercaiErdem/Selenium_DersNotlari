package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // Sayfadaki Berlin web elementinin relative locator kullanarak tiklayalim
        WebElement nycWE = driver.findElement(By.id("pid3_thumb"));
        WebElement bayAreaWE = driver.findElement(By.id("pid8_thumb"));

        WebElement berlinWE = driver.findElement(RelativeLocator.with(By.tagName("img")).below(nycWE)
                .toLeftOf(bayAreaWE));

        berlinWE.click();

        Thread.sleep(2000);



    }
}












