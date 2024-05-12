package steps.asserts;

import com.codeborne.selenide.SelenideElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class AssertChangeCity {

    public static void passToPickPointPage(SelenideElement listElement, SelenideElement selectedElement) {
        assertThat(listElement, not(equalTo(selectedElement)));
    }

    public static void passToHomePage(SelenideElement element, String attribute, String wbUrl) {
        assertThat(element.getAttribute(attribute), equalTo(wbUrl));
    }
}
