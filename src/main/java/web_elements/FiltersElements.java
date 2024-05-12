package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FiltersElements {
    public static SelenideElement electronicsCatalog = $x("//a[contains(@class, '4830')]");
    public static SelenideElement laptopsAndPcCatalog = $x("//span[contains(text(), 'Ноутбуки и компьютеры')]");
    public static SelenideElement laptopsCatalog = $x("//a[contains(@class, 'menu-burger__link') and text()='Ноутбуки']");
    public static SelenideElement laptopsCatalogTitle = $x("//h1[@class='catalog-title']");
    public static SelenideElement allFilters = $x("//button[contains(@class, 'dropdown-filter__btn--all')]");
    public static SelenideElement minPrice = $x("//input[@name='startN']");
    public static SelenideElement maxPrice = $x("//input[@name='endN']");
    public static SelenideElement radioMax3Days = $x("//span[@class='radio-with-text__text' and text()='до 3 дней']");
    public static SelenideElement brand = $x("//span[text()='Apple']");
    public static SelenideElement screen = $x("//span[text()='13.3\"']");
    public static SelenideElement filterResult = $x("//button[@class='filters-desktop__btn-main btn-main']");
    public static SelenideElement radioMax3DaysOnPage = $x("//span[@class='your-choice__btn' and text()='до 3 дней']");
    public static SelenideElement priceRangeOnPage = $x("//span[@class='your-choice__btn' and text()='от 100 000 до 149 000']");
    public static SelenideElement brandOnPage = $x("//span[@class='your-choice__btn' and text()='Apple']");
    public static SelenideElement screenOnPage = $x("//span[@class='your-choice__btn' and text()='13.3\"']");
    public static SelenideElement resetFilters = $x("//button[@data-link='{on resetAllFiltres}']");
    public static SelenideElement numberOfProductsFilters = $x("//p[@class='filters-desktop__count-goods']");
    public static SelenideElement numberOfProductsCatalog = $x("//span[@class='goods-count']");
    public static SelenideElement radioMax3DaysActive = $x("//span[@class='radio-with-text__text' and text()='до 3 дней']/..");
    public static SelenideElement brandActive = $x("//span[@class='checkbox-with-text__text' and text()='Apple']/..");
    public static SelenideElement screenActive = $x("//span[@class='checkbox-with-text__text' and text()='13.3\"']/..");
}
