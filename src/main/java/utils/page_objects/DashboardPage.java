package utils.page_objects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private final SelenideElement DASHBOARD_PAGE_TITLE = $(".head");
    private final SelenideElement ASSIGN_LEAVE_BUTTON =
            $(By.xpath("//span[contains(text(), 'Assign Leave')]"));
    private final SelenideElement LEAVE_LIST_BUTTON =
            $(By.xpath("//span[contains(text(), 'Leave List')]"));
    private final SelenideElement TIMESHEETS_BUTTON =
            $(By.xpath("//span[contains(text(), 'Timesheets')]"));
    private final SelenideElement APPLY_LEAVE_BUTTON =
            $(By.xpath("//span[contains(text(), 'Apply Leave')]"));
    private final SelenideElement MY_LEAVE_BUTTON =
            $(By.xpath("//span[contains(text(), 'My Leave')]"));
    private final SelenideElement MY_TIMESHEET_BUTTON =
            $(By.xpath("//span[contains(text(), 'My Timesheet')]"));
    private final SelenideElement EMPLOYEE_DISTRIBUTION_BY_SUBUNIT_DIAGRAM =
            $("#div_graph_display_emp_distribution");
    private final SelenideElement LEGEND_COMPONENT = $("#panel_resizable_1_1");
    private final SelenideElement PENDING_LEAVE_REQUESTS_COMPONENT =
            $("#task-list-group-panel-menu_holder");
    private final SelenideElement WELCOME_DROPLIST = $("#welcome");
    private final SelenideElement LOGOUT_BUTTON =
            $(By.xpath("//a[contains(text(), 'Logout')]"));
    private final SelenideElement MY_INFO_TAB = $("#menu_pim_viewMyDetails");

    public SelenideElement getDashboardPageTitle() {
        if (DASHBOARD_PAGE_TITLE.isDisplayed()) {
            Log.info("Dashboard page is opened");
        } else {
            Log.info("Dashboard page is not opened");
        }
        return DASHBOARD_PAGE_TITLE;
    }

    public SelenideElement getAssignLeaveButton() {
        if (ASSIGN_LEAVE_BUTTON.isDisplayed()) {
            Log.info("Assign leave button is visible");
        } else {
            Log.info("Assign leave button is not visible");
        }
        return ASSIGN_LEAVE_BUTTON;
    }

    public SelenideElement getLeaveListButton() {
        if (LEAVE_LIST_BUTTON.isDisplayed()) {
            Log.info("Leave list button is visible");
        } else {
            Log.info("Leave list button is not visible");
        }
        return LEAVE_LIST_BUTTON;
    }

    public SelenideElement getTimesheetsButton() {
        if (TIMESHEETS_BUTTON.isDisplayed()) {
            Log.info("Timesheets button is visible");
        } else {
            Log.info("Timesheets button is not visible");
        }
        return TIMESHEETS_BUTTON;
    }

    public SelenideElement getApplyLeaveButton() {
        if (APPLY_LEAVE_BUTTON.isDisplayed()) {
            Log.info("Apply leave button is visible");
        } else {
            Log.info("Apply leave button is not visible");
        }
        return APPLY_LEAVE_BUTTON;
    }

    public SelenideElement getMyLeaveButton() {
        if (MY_LEAVE_BUTTON.isDisplayed()) {
            Log.info("My leave button is visible");
        } else {
            Log.info("My leave button is not visible");
        }
        return MY_LEAVE_BUTTON;
    }

    public SelenideElement getMyTimesheetButton() {
        if (MY_TIMESHEET_BUTTON.isDisplayed()) {
            Log.info("My timesheet button is visible");
        } else {
            Log.info("My timesheet button is not visible");
        }
        return MY_TIMESHEET_BUTTON;
    }

    public SelenideElement getEmployeeDistributionBySubunitDiagram() {
        if (EMPLOYEE_DISTRIBUTION_BY_SUBUNIT_DIAGRAM.isDisplayed()) {
            Log.info("Employee Distribution by subunit diagram is visible");
        } else {
            Log.info("Employee Distribution by subunit diagram is not visible");
        }
        return EMPLOYEE_DISTRIBUTION_BY_SUBUNIT_DIAGRAM;
    }

    public SelenideElement getLegendComponent() {
        if (LEGEND_COMPONENT.isDisplayed()) {
            Log.info("Legend component is visible");
        } else {
            Log.info("Legend component is not visible");
        }
        return LEGEND_COMPONENT;
    }

    public SelenideElement getPendingLeaveRequestsComponent() {
        if (PENDING_LEAVE_REQUESTS_COMPONENT.isDisplayed()) {
            Log.info("Pending leave request component is visible");
        } else {
            Log.info("Pending leave request component is not visible");
        }
        return PENDING_LEAVE_REQUESTS_COMPONENT;
    }

    public void clickWelcomeDropList() {
        WELCOME_DROPLIST.click();
        Log.info("Welcome drop list is clicked on");
    }

    public void clickLogout() {
        LOGOUT_BUTTON.click();
        Log.info("Logout button is clicked on");
    }

    public void clickMyInfoTab() {
        MY_INFO_TAB.click();
        Log.info("My info tab is clicked on to open my info page");
    }
}
