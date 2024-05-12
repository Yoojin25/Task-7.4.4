package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchFieldElements {
    public static SelenideElement searchField = $x("//input[@id='searchInput']");
    public static SelenideElement searchingResult = $x("//h1");
    public static SelenideElement filterFirst = $x("//button[contains(@class, 'btn--burger')]");
    public static SelenideElement filterByPopularity = $x("//button[contains(@class, 'btn--sorter')]");
    public static SelenideElement firstProductBrand = $x("//article[1]//span[@class='product-card__brand']");
    public static SelenideElement clearButton = $x("//button[contains(@class, 'btn--clear')]");
}
