package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        System.out.println(driver.getWindowHandle()); //CDwindow-8B9070D410CB887E4F14AA9502540C99
        //Farkli pencereler arasinda gezinebilme icin .getWindowHandle() method unu kullaniriz.


    }
}
