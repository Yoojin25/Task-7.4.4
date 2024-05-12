package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AddToBasketElements {
    public static SelenideElement appliancesCatalog = $x("//a[contains(@class, '16107')]");
    public static SelenideElement homeAppliancesCatalog = $x("//span[contains(text(), 'Техника для дома')]");
    public static SelenideElement cleanersCatalog = $x("//span[contains(text(), 'Пылесосы и пароочистители')]");
    public static SelenideElement cleanersCatalogNext = $x("//a[contains(@class, 'j-menu-drop-link') and contains(text(), 'Пылесосы и пароочистители')]");
    public static SelenideElement cleanersCatalogTitle = $x("//h1[@class='catalog-title']");
    public static SelenideElement filterPath = $x("//div[@class='breadcrumbs__container']");
    public static SelenideElement addToBasketButton = $x("//article[1]//a[@href='/lk/basket']");
    public static SelenideElement cookiesButton = $x("//button[@class='cookies__btn btn-minor-md']");
    public static SelenideElement counterOfBasket = $x("//span[@class='navbar-pc__notify']");
    public static SelenideElement basketButton = $x("//span[contains(@class, 'navbar-pc__icon--basket')]");
    public static SelenideElement productNameInBasket = $x("//span[@class='good-info__good-name']");
    public static SelenideElement productPriceInBasket = $x("//div[contains(@data-link, 'priceSumWith')]");
    public static SelenideElement productNameOnPage = $x("//article[1]//span[@class='product-card__name']");
    public static SelenideElement productPriceOnPage = $x("//article[1]//ins");
    public static SelenideElement priceAllProducts = $x("//span[@class='b-right']");
    public static SelenideElement totalPrice = $x("//span[contains(@data-link, 'totalPaymentFee')]");
    public static SelenideElement orderButton = $x("//button[@name='ConfirmOrderByRegisteredUser']");
    public static SelenideElement chatButton = $x("//button[contains(@class, 'btn-chat')]");
}
