package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeEach
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();

        open("https://www.wildberries.ru/");
    }
}
