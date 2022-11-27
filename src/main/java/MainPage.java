import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private By orderButtonUp = By.xpath(".//button[@class='Button_Button__ra12g']"); //кнопка заказать наверху
    private By fqaHeader = By.xpath("//div[@class='Home_SubHeader__zwi_E'][text()='Вопросы о важном']"); // хэдер Вопросы о важном
    private By priceQuestion = By.id("accordion__heading-0"); //первый вопрос
    public By priceAnswer = By.xpath("//div[@id='accordion__panel-0']/p"); // первый ответ и там дальше по аналогии
    private By scooterCountQuestion = By.id("accordion__heading-1");
    private By scooterCountAnswer = By.xpath("//div[@id='accordion__panel-1']/p");
    private By arendaTimeQuestion = By.id("accordion__heading-2");
    private By arendaTimeAnswer = By.xpath("//div[@id='accordion__panel-2']/p");
    private By arendaTodayQuestion = By.id("accordion__heading-3");
    private By arendaTodayAnswer = By.xpath("//div[@id='accordion__panel-3']/p");
    private By extendOrderQuestion = By.id("accordion__heading-4");
    private By extendOrderAnswer = By.xpath("//div[@id='accordion__panel-4']/p");
    private By aboutChargeQuestion = By.id("accordion__heading-5");
    private By aboutChargeAnswer = By.xpath("//div[@id='accordion__panel-5']/p");
    private By cancelOrderQuestion = By.id("accordion__heading-6");
    private By cancelOrderAnswer = By.xpath("//div[@id='accordion__panel-6']/p");
    private By MKADQuestion = By.id("accordion__heading-7");
    private By MKADAnswer = By.xpath("//div[@id='accordion__panel-7']/p");

    private By cookieButton = By.className("App_CookieButton__3cvqF"); //кнопка принятия кук
    private By orderButtonDown = By.xpath("//div[@class='Home_FinishButton__1_cWm']"); //кнопка заказать внизу
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //метод для скролла до футера
    public void scrollToFooter() {
        WebElement element = driver.findElement(fqaHeader);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        waitForElementOnTheMainPage(fqaHeader);
    }
    //метод для принятия кук
    public void acceptCookie() {
        driver.findElement(cookieButton).click();
    }

    //метод для клика на первый вопрос
    public void clickOnThePriceQuestion() {
        driver.findElement(priceQuestion).click();
        waitForElementOnTheMainPage(priceAnswer);
    }
    //получили ответ на первый вопрос
    public String getTextForPriceQuestion() {
        return driver.findElement(priceAnswer).getText();
    }

    public void clickOnTheScooterCountQuestion() {
        driver.findElement(scooterCountQuestion).click();
        waitForElementOnTheMainPage(scooterCountAnswer);
    }
    public String getTextOnTheScooterCountQuestion() {
        return driver.findElement(scooterCountAnswer).getText();
    }

    public void clickOnTheArendaTimeQuestion(){
        driver.findElement(arendaTimeQuestion).click();
        waitForElementOnTheMainPage(arendaTimeAnswer);
    }
    public String getTextOnTheArendaTimeQuestion(){
        return driver.findElement(arendaTimeAnswer).getText();
    }
    public void clickOnTheArendaTodayQuestion(){
        driver.findElement(arendaTodayQuestion).click();
        waitForElementOnTheMainPage(arendaTodayAnswer);
    }
    public String getTextOnTheArendaTodayQuestion(){
        return driver.findElement(arendaTodayAnswer).getText();
    }

    public void clickOnTheExtendOrderQuestion(){
        driver.findElement(extendOrderQuestion).click();
        waitForElementOnTheMainPage(extendOrderAnswer);
    }
    public String getTextOnTheExtendOrderQuestion(){
        return driver.findElement(extendOrderAnswer).getText();
    }

    public void clickOnTheAboutChargeQuestion(){
        driver.findElement(aboutChargeQuestion).click();
        waitForElementOnTheMainPage(aboutChargeAnswer);
    }
    public String getTextOnTheAboutChargeQuestion(){
        return driver.findElement(aboutChargeAnswer).getText();
    }

    public void clickOnTheCancelOrderQuestion(){
        driver.findElement(cancelOrderQuestion).click();
        waitForElementOnTheMainPage(cancelOrderAnswer);
    }
    public String getTextOnTheCancelOrderQuestion(){
        return driver.findElement(cancelOrderAnswer).getText();
    }

    public void clickOnTheMKADQuestion(){
        driver.findElement(MKADQuestion).click();
        waitForElementOnTheMainPage(MKADAnswer);
    }
    public String getTextOnTheEighthQuestion(){
        return driver.findElement(MKADAnswer).getText();
    }

    //метод для нажатия кнопки заказать наверху
    public void clickOnOrderButtonUp(){
        driver.findElement(orderButtonUp).click();
    }
    public void clickOrderButtonDown(){
        WebElement element = driver.findElement(orderButtonDown);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }
    //метод для ожидания
    public boolean waitForElementOnTheMainPage(By element){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(element));
        return true;
    }
}
