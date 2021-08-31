package orange_hrm.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private static final SelenideElement DASHBOARD_PAGE_TITLE = $(".head");

    public static SelenideElement getDashboardPageTitle() {
        Log.info("Dashboard page is opened");
        return DASHBOARD_PAGE_TITLE;
    }


}
