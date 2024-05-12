package ui_tests;

import base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertGeneral;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.attribute;
import static steps.FiltersSteps.assertAllFiltersVisible;
import static steps.GeneralSteps.dataInput;
import static steps.GeneralSteps.getElementText;
import static web_elements.FiltersElements.*;
import static web_elements.GeneralElements.catalogButton;

public class FiltersTest extends BaseTest {

    @Test
    @DisplayName("Работа с фильтрами")
    @Description("Фильтры активируются; выбранные фильтры отображаются на странице каталога; количество товара на " +
            "странице фильтров соответствует количеству на странице каталога")
    public void filtersTest() {

//      2. Нажать "Фильтры"
        catalogButton.shouldBe(interactable).click();

//      3. Выбрать фильтр: "Электроника" - "Ноутбуки и компьютеры" - "Ноутбуки"
        electronicsCatalog.hover();

        laptopsAndPcCatalog.click();

        laptopsCatalog.click();

//      Проверка, что открылась страница с ноутбуками
        AssertGeneral.textPresence(laptopsCatalogTitle, "Ноутбуки и ультрабуки");

//      4. Применить фильтры, как показано на скриншотах
        allFilters.shouldBe(interactable).click();

        dataInput(minPrice, "100000");

        dataInput(maxPrice, "149000");

        radioMax3Days.shouldBe(clickable).click();

        brand.shouldBe(clickable).click();

        screen.shouldBe(clickable).click();

//      5. Нажать кнопку "Показать"
        filterResult.shouldBe(interactable).click();

//      Проверка, что выбранные фильтры отображаются на странице
        assertAllFiltersVisible(radioMax3DaysOnPage, priceRangeOnPage, brandOnPage, screenOnPage);

//      Проверка, что появилась кнопка "Сбросить все"
        resetFilters.shouldBe(visible);

//      Проверка, что кол-во товара на странице фильтров = количеству товара на странице
        allFilters.shouldBe(interactable).click();

        String numberOfProductsFiltersText = getElementText(numberOfProductsFilters);
        String numberOfProductsCatalogText = getElementText(numberOfProductsCatalog);

        AssertGeneral.textMatch(numberOfProductsFiltersText, numberOfProductsCatalogText);

//      Проверка, что фильтр активировался
        radioMax3DaysActive.shouldHave(attribute("class", "radio-with-text j-list-item selected"));
        brandActive.shouldHave(attribute("class", "checkbox-with-text j-list-item selected"));
        screenActive.shouldHave(attribute("class", "checkbox-with-text j-list-item selected"));
    }
}
