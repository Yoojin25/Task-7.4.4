package ui_tests;

import base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertChangeCity;
import steps.asserts.AssertGeneral;

import static com.codeborne.selenide.Condition.*;
import static steps.GeneralSteps.dataInput;
import static steps.GeneralSteps.getElementText;
import static web_elements.ChangeCityElements.*;

public class ChangeCityTest extends BaseTest {

    @Test
    @DisplayName("Смена города")
    @Description("Осуществляются переходы на страницы пункта выдачи и на главную страницу WB, адреса совпадают")
    public void changeCityTest() {

//      2. Кликнуть на кнопку "Смена города"
        addressButton.shouldBe(interactable).click();

//      3. В поисковую строку ввести "Санкт-Петербург"
        String city = "Санкт-Петербург";

        dataInput(addressInput, city);

//      4. Выбрать первый адрес из списка адресов
        String firstAddressText = getElementText(firstAddress);

        firstAddress.click();

//      Проверка, что открылась информация о центре выдачи
        AssertChangeCity.passToPickPointPage(listOfPickPointsPage, selectedPickPointPage);

        String addressSelectedPickPointText = getElementText(addressSelectedPickPoint);

//      Проверка, что адрес пункта выдачи совпадает с тем адресом, что был предложен в списке адресов
        AssertGeneral.textMatch(firstAddressText, addressSelectedPickPointText);

//      5. Нажать на кнопку "Выбрать"
        selectButton.click();

//      Проверка, что произошел переход на главную страницу WB
        String wbUrl = "https://www.wildberries.ru/";
        String attribute = "href";

        AssertChangeCity.passToHomePage(homePageUrl, attribute, wbUrl);

//      Проверка, что отображается адрес пункта выдачи из предыдущего шага
        String addressOnHomePageText = getElementText(addressOnHomePage);

        AssertGeneral.textMatch(addressSelectedPickPointText, addressOnHomePageText);
    }
}
