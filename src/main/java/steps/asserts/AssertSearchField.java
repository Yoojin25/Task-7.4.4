package steps.asserts;

import com.codeborne.selenide.SelenideElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;

public class AssertSearchField {

    public static void emptyElement(SelenideElement element) {
        assertThat(element.getText(), isEmptyString());
    }
}