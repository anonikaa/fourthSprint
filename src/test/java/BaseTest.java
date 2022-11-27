import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BaseTest {
    protected WebDriver driver;
    @Before
    public void before() {
        driver = getDriver("chrome");
        driver.get("https://qa-scooter.praktikum-services.ru/");

    } //фаерфокс у меня так и не завёлся
    private WebDriver getDriver(String browserName){
        if ("chrome".equals(browserName)) {
           WebDriverManager.chromedriver().setup();
        return driver = new ChromeDriver();
    } else{
        return driver = new SafariDriver();
        }
    }
    @After
    public void teardown() {
        driver.quit();
    }

}

