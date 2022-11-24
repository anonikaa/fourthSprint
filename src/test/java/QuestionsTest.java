import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class QuestionsTest extends BaseUrlTest {

    @Test
    public void openQuestionsTest() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookie();
        mainPage.scrollToFooter();

        mainPage.clickOnTheFirstQuestion();
        //assertEquals(mainPage.getTextOnTheFirstQuestion(), "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");

        mainPage.clickOnTheSecondQuestion();
        assertEquals(mainPage.getTextOnTheSecondQuestion(), "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");

        mainPage.clickOnTheThirdQuestion();
        assertEquals(mainPage.getTextOnTheThirdQuestion(), "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");

        mainPage.clickOnTheFourthQuestion();
        assertEquals(mainPage.getTextOnTheFourthQuestion(), "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");

        mainPage.clickOnTheFifthQuestion();
        assertEquals(mainPage.getTextOnTheFifthQuestion(), "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");

        mainPage.clickOnTheSixthQuestion();
        assertEquals(mainPage.getTextOnTheSixthQuestion(), "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");

        mainPage.clickOnTheSevenQuestion();
        assertEquals(mainPage.getTextOnTheSevenQuestion(), "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");

        mainPage.clickOnTheEighthQuestion();
        assertEquals(mainPage.getTextOnTheEighthQuestion(), "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }
    @After
    public void teardown() {
        driver.quit();
    }

}

