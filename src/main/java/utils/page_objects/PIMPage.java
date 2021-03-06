package utils.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.*;

public class PIMPage {

    private final SelenideElement PIM_PAGE_LINK = $("#menu_pim_viewPimModule");
    private final SelenideElement SUB_UNIT_FIELD = $("#empsearch_sub_unit");
    private final SelenideElement SEARCH_BUTTON = $("#searchBtn");
    private final ElementsCollection SALES_COLLECTION = $$("tbody tr");
    private static final String SALES_LINK = "td:nth-of-type(2)";

    public void clickPIMPageLink() {
        PIM_PAGE_LINK.click();
        Log.info("PIM page is opened");
    }

    public void findSalesEmployee(String subUnit) {
        SUB_UNIT_FIELD.selectOption(subUnit);
        Log.info("Sub unit " + subUnit + " is selected");

        SEARCH_BUTTON.click();
        Log.info("Search button is clicked on to find employees from " + subUnit + " sub unit");

        SALES_COLLECTION.first().$(SALES_LINK).click();
        Log.info("Employee from " + subUnit + " sub unit is found");
    }

}
