import PageObject.MainPageScooter;
import org.junit.Test;

public class MainPageTest extends BaseTest {

    @Test
    public void verifyThatTextForQuestion1Matches() {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.scrollToTheQuestion1andClick();
        mainPage.checkTheTextForQuestion1();
    }

    @Test
    public void verifyThatTextForQuestion2Matches() {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.scrollToTheQuestion2andClick();
        mainPage.checkTheTextForQuestion2();
    }

    @Test
    public void verifyThatTextForQuestion3Matches() {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.scrollToTheQuestion3andClick();
        mainPage.checkTheTextForQuestion3();
    }

    @Test
    public void verifyThatTextForQuestion4Matches() {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.scrollToTheQuestion4andClick();
        mainPage.checkTheTextForQuestion4();
    }

    @Test
    public void verifyThatTextForQuestion5Matches() {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.scrollToTheQuestion5andClick();
        mainPage.checkTheTextForQuestion5();
    }

    @Test
    public void verifyThatTextForQuestion6Matches() {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.scrollToTheQuestion6andClick();
        mainPage.checkTheTextForQuestion6();
    }

    @Test
    public void verifyThatTextForQuestion7Matches() {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.scrollToTheQuestion7andClick();
        mainPage.checkTheTextForQuestion7();
    }

    @Test
    public void verifyThatTextForQuestion8Matches() {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.scrollToTheQuestion8andClick();
        mainPage.checkTheTextForQuestion8();
    }

}
