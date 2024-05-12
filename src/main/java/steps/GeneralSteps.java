package steps;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.actions;

public class GeneralSteps {

    public static void dataInput(SelenideElement element, String data) {
        element.clear();

        actions().moveToElement(element.shouldBe(visible))
                .click()
                .sendKeys(data, Keys.ENTER)
                .perform();
    }

    public static String getElementText(SelenideElement element) {
        return element.should(exist).getText();
    }
}