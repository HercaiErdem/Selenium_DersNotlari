import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https:/amazon.com");
        // driver.navigate() methodu sayfada ileri geri yapacaksak kullanilir.
        // driver.get() methodu gibi bizi istedigimiz Url e goturur.
        driver.navigate().to("https:/techproeducation.com");

        // Tekrar Amazon sayfasina donelim
        Thread.sleep(3000); // sayfayi 3 saniye beklettik
        driver.navigate().back();

        // Tekrar Techproed sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); //ileri icin .forward() methodu kullaniriz

        // sayfayi refresh yapin
        driver.navigate().refresh();

        // sayfayi kapatin
        Thread.sleep(3000);
        driver.close();


    }
}
