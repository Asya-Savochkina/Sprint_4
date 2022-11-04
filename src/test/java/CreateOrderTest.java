import PageObject.MainPageScooter;
import PageObject.OrderPageScooter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CreateOrderTest extends BaseTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String station;
    private final String phone;

    public CreateOrderTest(String name, String surname, String address, String station, String phone) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.station = station;
        this.phone = phone;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderData() {
        return new Object[][]{
                {"Ася", "Петрова", "Москва Ленина - 5", "Черкизовская", "+79999999999"},
                {"Анатолий", "Заболоцкий", "Химки Лесная улица 45 кв 165", "Сокольники", "89896665432"},
        };
    }
    @Test
    public void checkCreateOrderFromHeader () {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.clickOrderHeader();
        OrderPageScooter orderPage = new OrderPageScooter(webDriver);
        orderPage.orderDataField(name, surname, address, station, phone);
        orderPage.clickMakeOrderButton();
        orderPage.clickSureForOrderButton();
        Assert.assertTrue("Нет окна результата оформления заказа", orderPage.orderCreatedIsDisplayed());
    }
    @Test
    public void checkCreateOrderFromPage () {
        MainPageScooter mainPage = new MainPageScooter(webDriver);
        mainPage.open();
        mainPage.clickCoockies();
        mainPage.clickOrderButtonOnThePage();
        OrderPageScooter orderPage = new OrderPageScooter(webDriver);
        orderPage.orderDataField(name, surname, address, station, phone);
        orderPage.clickMakeOrderButton();
        orderPage.clickSureForOrderButton();
        Assert.assertTrue("Нет окна результата оформления заказа", orderPage.orderCreatedIsDisplayed());
    }
}
