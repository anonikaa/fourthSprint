import data.DataTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static data.DataTest.*;

import javax.xml.crypto.Data;
import java.util.concurrent.RecursiveTask;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    private By orderHeader = By.className("Order_Header__BZXOb");
    private By nameInput = By.xpath("//input[@placeholder='* Имя']");
    private By surnameInput = By.xpath("//input[@placeholder='* Фамилия']");
    private By adressInput = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStationDropdown = By.xpath("//input[@placeholder='* Станция метро']");
    private By metroStationList = By.xpath("//div[@class='select-search__select'][1]");
    private By phoneNumberInput = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath("//div[@class='Order_NextButton__1_rCA']//button");
    private By dateInput = By.className("react-datepicker__input-container");
    private By dataPicker = By.xpath("//div[@class='react-datepicker__month-container']//div[@aria-label='Choose четверг, 24-е ноября 2022 г.']");
    private By dateArenda = By.className("Dropdown-placeholder");
    private By dateArendaDropdown = By.xpath("//div[@class='Dropdown-option'][contains(text(), 'сутки')]");
    private By orderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][contains(text(), 'Заказать')]");
    private By yesButton = By.xpath("//div[@class='Order_Modal__YZ-d3']//button[contains(text(), 'Да')]");
    private By successOrderModal = By.className("Order_ModalHeader__3FDaJ");


    public boolean isThisOrderPage(){
        return driver.findElement(orderHeader).isDisplayed();
    }

    public OrderPage setName(String name){
        driver.findElement(nameInput).click();
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }
    public OrderPage setSurname(String surname){
        driver.findElement(surnameInput).click();
        driver.findElement(surnameInput).sendKeys(surname);
        return this;
    }
    public OrderPage setAdress(String adress){
        driver.findElement(adressInput).click();
        driver.findElement(adressInput).sendKeys(adress);
        return this;
    }
    public OrderPage chooseMetroStation(){
        driver.findElement(metroStationDropdown).click();
        driver.findElement(metroStationDropdown).sendKeys("Комсомол");
        driver.findElement(metroStationList).click();
        return this;
    }
    public OrderPage setPhoneNumber(){
        driver.findElement(phoneNumberInput).click();
        driver.findElement(phoneNumberInput).sendKeys("89000000000");
        return this;
    }
    public OrderPage clickOnTheNextButton(){
        driver.findElement(nextButton).click();
        return this;

    }
    public OrderPage chooseDate(){
        driver.findElement(dateInput).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(dataPicker));
        driver.findElement(dataPicker).click();
        return this;
    }
    public OrderPage chooseDateArenda(){
        driver.findElement(dateArenda).click();
        driver.findElement(dateArendaDropdown).click();
        return this;
    }
    public OrderPage clickOrderButton(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(orderButton));
        driver.findElement(orderButton).click();
        return this;
    }
    public OrderPage clickYesButton(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(yesButton));
        driver.findElement(yesButton).click();
        return this;
    }
    public boolean isOrderSuccess(){
        return driver.findElement(successOrderModal).isDisplayed();
    }

    public OrderPage doSuccessOrder(){
        setName(NAME_FIRST)
                .setSurname(SURNAME_FIRST)
                .setAdress(ADRESS_FIRST)
                .chooseMetroStation()
                .setPhoneNumber()
                .clickOnTheNextButton()
                .chooseDate()
                .chooseDateArenda()
                .clickOrderButton()
                .clickYesButton()
                .isOrderSuccess();
        return this;

    }
}

