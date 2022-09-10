package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C07_FindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

        //Amazon sayfasindaki tag'lari link(input) olanlarin sayisini yazdirin
        List<WebElement> tag = driver.findElements(By.tagName("input"));
        System.out.println("input tag'in sayisi= "+ tag.size());


    }
}
