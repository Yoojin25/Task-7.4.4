package steps;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

public class FiltersSteps {

    public static void assertAllFiltersVisible(SelenideElement... elements) {
        for (SelenideElement element : elements) {
            element.shouldBe(visible);
        }
    }
}