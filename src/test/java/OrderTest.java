import org.junit.After;
import org.junit.Test;
import static data.DataTest.*;


public class OrderTest extends BaseTest {
    @Test
    public void orderFromUpButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookie();
        mainPage.clickOnOrderButtonUp();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.isThisOrderPage();
        orderPage.setName(NAME_SECOND)
                .setSurname(SURNAME_SECOND)
                .setAdress(ADRESS_SECOND)
                .chooseMetroStation()
                .setPhoneNumber()
                .clickOnTheNextButton()
                .chooseDate()
                .chooseDateArenda()
                .clickOrderButton()
                .clickYesButton()
                .isOrderSuccess();
}
    @Test
    public void orderFromDownButtonTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookie();
        mainPage.clickOrderButtonDown();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.isThisOrderPage();
        orderPage.doSuccessOrder();
    }
}
