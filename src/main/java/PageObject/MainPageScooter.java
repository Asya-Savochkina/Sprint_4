package PageObject;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;

public class MainPageScooter extends BasePage {

    //Кнопка принятия кукис
    private final By cookiesButton = By.className("App_CookieButton__3cvqF");
    //кнопка заказать в хэдере
    private final By orderHeader = By.className("Button_Button__ra12g");
    //логотип Яндекс
    private final By yandexLogo = By.xpath(".//img[@alt='Yandex']");
    //логотип Самокат
    private final By scooterLogo = By.xpath(".//img[@alt='Scooter']");
    //кнопка перехода к проверке статуса заказа
    private final By orderStatusButton = By.xpath(".//button[@class='Header_Link__1TAG7']");
    //окно ввода номера заказа для проверки статуса
    private final By inputTheOrderNumber = By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    //кнопка Go для проверки статуса заказа
    private final By goButton = By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']");
    //окно сообщения о том, что заказ по введенному номеру не найден
    private final By orderNotFound = By.cssSelector(".Track_NotFound__6oaoY");
    //кнопка заказать на странице
    private final By orderOnThePage = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // Вопросы о важном 1
    public final By question1 = By.id("accordion__heading-0");
    //текст вопроса №1
    public final By question1Text = By.xpath(".//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    // Вопросы о важном 2
    private final By question2 = By.id("accordion__heading-1");
    //текст вопроса №2
    private final By question2Text = By.xpath(".//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    // Вопросы о важном 3
    private final By question3 = By.id("accordion__heading-2");
    //текст вопроса №3
    private final By question3Text = By.xpath(".//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    // Вопросы о важном 4
    private final By question4 = By.id("accordion__heading-3");
    //текст вопроса №4
    private final By question4Text = By.xpath(".//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    // Вопросы о важном 5
    private final By question5 = By.id("accordion__heading-4");
    //текст вопроса №5
    private final By question5Text = By.xpath(".//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    // Вопросы о важном 6
    private final By question6 = By.id("accordion__heading-5");
    //текст вопроса №6
    private final By question6Text = By.xpath(".//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    // Вопросы о важном 7
    private final By question7 = By.id("accordion__heading-6");
    //текст вопроса №7
    private final By question7Text = By.xpath(".//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    // Вопросы о важном 8
    private final By question8 = By.id("accordion__heading-7");
    //текст вопроса №8
    private final By question8Text = By.xpath(".//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");

    public MainPageScooter(WebDriver webDriver) {
        super(webDriver);
    }

    public void open() {
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }
    public void clickCoockies() {
        webDriver.findElement(cookiesButton).click();
    }

    public void clickOrderHeader() {
        webDriver.findElement(orderHeader).click();
    }

    public void clickOrderButtonOnThePage() {
        webDriver.findElement(orderOnThePage).click();
    }

    public void clickYandexLogo() {
        webDriver.findElement(yandexLogo).click();
    }

    public void clickScooterLogo() {
        webDriver.findElement(scooterLogo).click();
    }

    public void scrollToTheQuestion1andClick() {
        WebElement element1 = webDriver.findElement(question1);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element1);
        webDriver.findElement(question1).click();
    }

    public void checkTheTextForQuestion1() {
        String expectedText1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actualText1 = webDriver.findElement(question1Text).getText();
        MatcherAssert.assertThat(expectedText1, is(actualText1));
    }
    public void scrollToTheQuestion2andClick() {
        WebElement element2 = webDriver.findElement(question2);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element2);
        webDriver.findElement(question2).click();
    }
    public void checkTheTextForQuestion2() {
        String expectedText2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actualText2 = webDriver.findElement(question2Text).getText();
        MatcherAssert.assertThat(expectedText2, is(actualText2));
    }
    public void scrollToTheQuestion3andClick() {
        WebElement element3 = webDriver.findElement(question3);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element3);
        webDriver.findElement(question3).click();
    }
    public void checkTheTextForQuestion3() {
        String expectedText3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actualText3 = webDriver.findElement(question3Text).getText();
        MatcherAssert.assertThat(expectedText3, is(actualText3));
    }
    public void scrollToTheQuestion4andClick() {
        WebElement element4 = webDriver.findElement(question4);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element4);
        webDriver.findElement(question4).click();
    }
    public void checkTheTextForQuestion4() {
        String expectedText4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actualText4 = webDriver.findElement(question4Text).getText();
        MatcherAssert.assertThat(expectedText4, is(actualText4));
    }

    public void scrollToTheQuestion5andClick() {
        WebElement element5 = webDriver.findElement(question5);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element5);
        webDriver.findElement(question5).click();
    }

    public void checkTheTextForQuestion5() {
        String expectedText5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actualText5 = webDriver.findElement(question5Text).getText();
        MatcherAssert.assertThat(expectedText5, is(actualText5));
    }
    public void scrollToTheQuestion6andClick() {
        WebElement element6 = webDriver.findElement(question6);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element6);
        webDriver.findElement(question6).click();
    }

    public void checkTheTextForQuestion6() {
        String expectedText6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actualText6 = webDriver.findElement(question6Text).getText();
        MatcherAssert.assertThat(expectedText6, is(actualText6));
    }

    public void scrollToTheQuestion7andClick() {
        WebElement element7 = webDriver.findElement(question7);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element7);
        webDriver.findElement(question7).click();
    }

    public void checkTheTextForQuestion7() {
        String expectedText7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actualText7 = webDriver.findElement(question7Text).getText();
        MatcherAssert.assertThat(expectedText7, is(actualText7));
    }

    public void scrollToTheQuestion8andClick() {
        WebElement element8 = webDriver.findElement(question8);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element8);
        webDriver.findElement(question8).click();
    }

    public void checkTheTextForQuestion8() {
        String expectedText8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actualText8 = webDriver.findElement(question8Text).getText();
        MatcherAssert.assertThat(expectedText8, is(actualText8));
    }

}