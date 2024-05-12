package ui_tests;

import base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertGeneral;

import static com.codeborne.selenide.Condition.*;
import static steps.GeneralSteps.getElementText;
import static web_elements.AddToBasketElements.*;
import static web_elements.GeneralElements.catalogButton;

public class AddToBasketTest extends BaseTest {

    @Test
    @DisplayName("Добавление товара в корзину")
    @Description("Осуществляется переход на страницу с бытовой техникой; товар добавляется в корзину; название и цена " +
            "товара в корзине соответствуют названию и цене на странице каталога")
    public void addToBasketTest() {

//      2. Нажать "Фильтры"
        catalogButton.shouldBe(interactable).click();

//      3. Выбрать "Бытовая техника" - "Техника для дома" - "Пылесосы и пароочистители"
        appliancesCatalog.hover();

        homeAppliancesCatalog.click();

        cleanersCatalog.click();

        cleanersCatalogNext. click();

//      Проверка, что отображается "Пылесосы и пароочистители"
        AssertGeneral.textPresence(cleanersCatalogTitle, "Пылесосы и пароочистители");

//      Проверка, что путь фильтра: "Главная" - "Бытовая техника" - "Техника для дома" - "Пылесосы и пароочистители"
        AssertGeneral.textPresence(filterPath, "Главная\nБытовая техника\nТехника для дома\nПылесосы и пароочистители");

//      4. Нажать на кнопку “В корзину”
        cookiesButton.click();

        addToBasketButton.click();

        String productNameOnPageText = getElementText(productNameOnPage);
        String productPriceOnPageText = getElementText(productPriceOnPage);

//      Проверка, что в правом верхнем углу над логотипом "Корзина" появилась красная цифра “1”
        AssertGeneral.textPresence(counterOfBasket, "1");

//      5. Нажать на "Корзина"
        basketButton.click();

//      Проверка, что текст и цена товара соответствует цене и названию товара из предыдущих шагов
        chatButton.shouldBe(visible);

        String productNameInBasketText = getElementText(productNameInBasket);
        String productPriceInBasketText = getElementText(productPriceInBasket);

        AssertGeneral.textMatch(productNameOnPageText, productNameInBasketText);
        AssertGeneral.textMatch(productPriceOnPageText, productPriceInBasketText);

//      Проверка, что "Итого" = сумме товара
        String priceAllProductsText = getElementText(priceAllProducts);
        String totalPriceText = getElementText(totalPrice);

        AssertGeneral.textMatch(priceAllProductsText, totalPriceText);

//      Проверка, что кнопка "Заказать" активна для нажатия
        orderButton.shouldBe(enabled);
    }
}
