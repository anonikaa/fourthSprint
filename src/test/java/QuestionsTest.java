import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QuestionsTest extends BaseTest {
    @Test
/*    мне теперь не нравится, что ассептить куки и скроллить надо в каждом тесте, но если это вынести в @Before в BaseTest класс
    то  это не нужно для тестов заказа*/
        public void priceQuestionTest(){
            MainPage mainPage = new MainPage(driver);
            mainPage.acceptCookie();
            mainPage.scrollToFooter();
            mainPage.clickOnThePriceQuestion();
            assertEquals(mainPage.getTextForPriceQuestion(), "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }
        @Test
        public void scooterCountQuestionTest() {
            MainPage mainPage = new MainPage(driver);
            mainPage.acceptCookie();
            mainPage.scrollToFooter();
            mainPage.clickOnTheScooterCountQuestion();
            assertEquals(mainPage.getTextOnTheScooterCountQuestion(), "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
        }
        @Test
        public void arendaTimeQuestionTest(){
            MainPage mainPage = new MainPage(driver);
            mainPage.acceptCookie();
            mainPage.scrollToFooter();
            mainPage.clickOnTheArendaTimeQuestion();
            assertEquals(mainPage.getTextOnTheArendaTimeQuestion(), "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
        }
        @Test
        public void arendaTodayQuestionTest() {
            MainPage mainPage = new MainPage(driver);
            mainPage.acceptCookie();
            mainPage.scrollToFooter();
            mainPage.clickOnTheArendaTodayQuestion();
            assertEquals(mainPage.getTextOnTheArendaTodayQuestion(), "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
        }
        @Test
        public void extendOrderQuestionTest(){
            MainPage mainPage = new MainPage(driver);
            mainPage.acceptCookie();
            mainPage.scrollToFooter();
            mainPage.clickOnTheExtendOrderQuestion();
            assertEquals(mainPage.getTextOnTheExtendOrderQuestion(), "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
        }
        @Test
        public void aboutChargeQuestionTest(){
            MainPage mainPage = new MainPage(driver);
            mainPage.acceptCookie();
            mainPage.scrollToFooter();
            mainPage.clickOnTheAboutChargeQuestion();
            assertEquals(mainPage.getTextOnTheAboutChargeQuestion(), "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
        }
        @Test
        public void cancelOrderQuestionTest(){
            MainPage mainPage = new MainPage(driver);
            mainPage.acceptCookie();
            mainPage.scrollToFooter();
            mainPage.clickOnTheCancelOrderQuestion();
            assertEquals(mainPage.getTextOnTheCancelOrderQuestion(), "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
        }
        @Test
        public void MKADQuestionTest(){
            MainPage mainPage = new MainPage(driver);
            mainPage.acceptCookie();
            mainPage.scrollToFooter();
            mainPage.clickOnTheMKADQuestion();
            assertEquals(mainPage.getTextOnTheEighthQuestion(), "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }
}

