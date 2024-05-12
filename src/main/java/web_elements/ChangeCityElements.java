package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ChangeCityElements {
    public static SelenideElement addressButton = $x("//span[contains(@class, 'j-geocity-link')]");
    public static SelenideElement addressInput = $x("//input[contains(@class, 'ymaps')]");
    public static SelenideElement firstAddress = $x("(//span[@class='address-item__name-text'])[1]");
    public static SelenideElement listOfPickPointsPage = $x("//div[@class='geo-block__info']");
    public static SelenideElement selectedPickPointPage = $x("//div[@class='details-self']");
    public static SelenideElement addressSelectedPickPoint = $x("//span[@class='details-self__name-text']");
    public static SelenideElement selectButton = $x("//button[@class='details-self__btn btn-main']");
    public static SelenideElement homePageUrl = $x("//base");
    public static SelenideElement addressOnHomePage = $x("//span[@data-wba-header-name='DLV_Adress']");
}
