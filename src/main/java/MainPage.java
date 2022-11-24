import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private By orderButtonUp = By.xpath(".//button[@class='Button_Button__ra12g']"); //кнопка заказать наверху
    private By fqaHeader = By.xpath("//div[@class='Home_SubHeader__zwi_E'][text()='Вопросы о важном']"); // хэдер Вопросы о важном
    private By firstQuestion = By.id("accordion__heading-0"); //первый вопрос
    private By firstAnswer = By.xpath("//div[@id='accordion__panel-0']/p"); // первый ответ и там дальше по аналогии
    private By secondQuestion = By.id("accordion__heading-1");
    private By secondAnswer = By.xpath("//div[@id='accordion__panel-1']/p");
    private By thirdQuestion = By.id("accordion__heading-2");
    private By thirdAnswer = By.xpath("//div[@id='accordion__panel-2']/p");
    private By fourthQuestion = By.id("accordion__heading-3");
    private By fourthAnswer = By.xpath("//div[@id='accordion__panel-3']/p");
    private By fifthQuestion = By.id("accordion__heading-4");
    private By fifthAnswer = By.xpath("//div[@id='accordion__panel-4']/p");
    private By sixthQuestion = By.id("accordion__heading-5");
    private By sixAnswer = By.xpath("//div[@id='accordion__panel-5']/p");
    private By seventhQuestion = By.id("accordion__heading-6");
    private By seventhAnswer = By.xpath("//div[@id='accordion__panel-6']/p");
    private By eighthQuestion = By.id("accordion__heading-7");
    private By eighthAnswer = By.xpath("//div[@id='accordion__panel-7']/p");

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
    }
    //метод для принятия кук
    public void acceptCookie() {
        driver.findElement(cookieButton).click();
    }

    //метод для клика на первый вопрос
    public void clickOnTheFirstQuestion() {
        driver.findElement(firstQuestion).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(firstAnswer));
    }
    //получили ответ на первый вопрос
    public String getTextOnTheFirstQuestion() {
        return driver.findElement(firstAnswer).getText();
    }
    public void clickOnTheSecondQuestion() {
        driver.findElement(secondQuestion).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(secondAnswer));
    }
    public String getTextOnTheSecondQuestion() {
        return driver.findElement(secondAnswer).getText();
    }
    public void clickOnTheThirdQuestion(){
        driver.findElement(thirdQuestion).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(thirdAnswer));
    }
    public String getTextOnTheThirdQuestion(){
        return driver.findElement(thirdAnswer).getText();
    }
    public void clickOnTheFourthQuestion(){
        driver.findElement(fourthQuestion).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(fourthAnswer));
    }
    public String getTextOnTheFourthQuestion(){
        return driver.findElement(fourthAnswer).getText();
    }
    public void clickOnTheFifthQuestion(){
        driver.findElement(fifthQuestion).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(fifthAnswer));
    }
    public String getTextOnTheFifthQuestion(){
        return driver.findElement(fifthAnswer).getText();
    }
    public void clickOnTheSixthQuestion(){
        driver.findElement(sixthQuestion).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(sixAnswer));
    }
    public String getTextOnTheSixthQuestion(){
        return driver.findElement(sixAnswer).getText();
    }
    public void clickOnTheSevenQuestion(){
        driver.findElement(seventhQuestion).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(seventhAnswer));
    }
    public String getTextOnTheSevenQuestion(){
        return driver.findElement(seventhAnswer).getText();
    }
    public void clickOnTheEighthQuestion(){
        driver.findElement(eighthQuestion).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(eighthAnswer));
    }
    public String getTextOnTheEighthQuestion(){
        return driver.findElement(eighthAnswer).getText();
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
}
