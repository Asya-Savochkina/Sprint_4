package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageScooter extends BasePage {


    // поле ввода *Имя
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    // поле ввода *Фамилия
    private final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    // поле ввода *Адрес
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // поле ввода *Станция метро
    private final By stationField = By.xpath(".//input[@placeholder='* Станция метро']");
    // поле ввода *Телефон
    private final By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private final By nextButton = By.xpath(".//button[text()='Далее']");
    //Поле выбора даты
    private final By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Поле выбора срока
    private final By rentPeriodField = By.xpath(".//div[@class='Dropdown-root']");
    //Срок аренды в выпадающем списке
    private final By rentPeriod = By.xpath(".//div[text()='двое суток']");
    //Кнопка "Заказать"
    private final By makeOrderButton = By.xpath(".//button[text()='Заказать']");
    //Кнопка подтверждения оформления
    private final By sureForOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Окно результата оформления с номером заказа
    private final By orderCreated = By.xpath(".//div[text()='Заказ оформлен']");

    public OrderPageScooter(WebDriver webDriver) {
        super(webDriver);
    }

    public void setNameField(String name) {
        webDriver.findElement(nameField).sendKeys(name);
    }

    public void setSurnameField(String surname) {
        webDriver.findElement(surnameField).sendKeys(surname);
    }

    public void setAddressField(String address) {
        webDriver.findElement(addressField).sendKeys(address);
    }

    public void setStationField(String stationName) {
        String stationItem = ".//div[text()='%s']/..";
        webDriver.findElement(stationField).sendKeys(stationName);
        webDriver.findElement(By.xpath(String.format(stationItem, stationName))).click();
    }

    public void setPhoneField(String phone) {
        webDriver.findElement(phoneField).sendKeys(phone);
    }

    public void clickNextButton() {
        webDriver.findElement(nextButton).click();
    }

    public void setDateField() {

        webDriver.findElement(dateField).click();
        webDriver.findElement(By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--030']")).click();
    }

    public void setRentalPeriod() {
        webDriver.findElement(rentPeriodField).click();
        webDriver.findElement(rentPeriod).click();
    }

    public void orderDataField(String name, String surname, String address, String station, String phone) {
        setNameField(name);
        setSurnameField(surname);
        setAddressField(address);
        setStationField(station);
        setPhoneField(phone);
        clickNextButton();
        setDateField();
        setRentalPeriod();

    }

    public void clickMakeOrderButton() {
        webDriver.findElement(makeOrderButton).click();
    }

    public void clickSureForOrderButton() {
        webDriver.findElement(sureForOrderButton).click();
    }

    public boolean orderCreatedIsDisplayed() {
        return webDriver.findElement(orderCreated).isDisplayed();
    }

}
