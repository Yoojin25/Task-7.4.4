package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GeneralElements {
    public static SelenideElement catalogButton = $x("//button[contains(@class, 'j-menu-burger-btn')]");
}
