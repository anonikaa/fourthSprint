import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BaseUrlTest {
    protected WebDriver driver;
    @Before
    public void before() {
        driver = getDriver("chrome");
    } //фаерфокс у меня так и не завёлся
    private WebDriver getDriver(String browserName){
        if ("chrome".equals(browserName)) {
           WebDriverManager.chromedriver().setup();
        return driver = new ChromeDriver();
    } else{
        return driver = new SafariDriver();
        }
    }

}

