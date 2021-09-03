package orange_hrm.page_objects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private static final SelenideElement DASHBOARD_PAGE_TITLE = $(".head");
    private static final SelenideElement ASSIGN_LEAVE_BUTTON =
            $(By.xpath("//span[contains(text(), 'Assign Leave')]"));
    private static final SelenideElement LEAVE_LIST_BUTTON =
            $(By.xpath("//span[contains(text(), 'Leave List')]"));
    private static final SelenideElement TIMESHEETS_BUTTON =
            $(By.xpath("//span[contains(text(), 'Timesheets')]"));
    private static final SelenideElement APPLY_LEAVE_BUTTON =
            $(By.xpath("//span[contains(text(), 'Apply Leave')]"));
    private static final SelenideElement MY_LEAVE_BUTTON =
            $(By.xpath("//span[contains(text(), 'My Leave')]"));
    private static final SelenideElement MY_TIMESHEET_BUTTON =
            $(By.xpath("//span[contains(text(), 'My Timesheet')]"));
    private static final SelenideElement EMPLOYEE_DISTRIBUTION_BY_SUBUNIT_DIAGRAM =
            $("#div_graph_display_emp_distribution");
    private static final SelenideElement LEGEND_COMPONENT = $("#panel_resizable_1_1");
    private static final SelenideElement PENDING_LEAVE_REQUESTS_COMPONENT =
            $("#task-list-group-panel-menu_holder");
    private static final SelenideElement WELCOME_DROPLIST = $("#welcome");
    private static final SelenideElement LOGOUT_BUTTON =
            $(By.xpath("//a[contains(text(), 'Logout')]"));
    private static final SelenideElement MY_INFO_TAB = $("#menu_pim_viewMyDetails");

    public static SelenideElement getDashboardPageTitle() {
        Log.info("Dashboard page is opened");
        return DASHBOARD_PAGE_TITLE;
    }

    public static SelenideElement getAssignLeaveButton() {
        Log.info("Assign leave button is visible");
        return ASSIGN_LEAVE_BUTTON;
    }

    public static SelenideElement getLeaveListButton() {
        Log.info("Leave list button is visible");
        return LEAVE_LIST_BUTTON;
    }

    public static SelenideElement getTimesheetsButton() {
        Log.info("Timesheets button is visible");
        return TIMESHEETS_BUTTON;
    }

    public static SelenideElement getApplyLeaveButton() {
        Log.info("Apply leave button is visible");
        return APPLY_LEAVE_BUTTON;
    }

    public static SelenideElement getMyLeaveButton() {
        Log.info("My leave button is visible");
        return MY_LEAVE_BUTTON;
    }

    public static SelenideElement getMyTimesheetButton() {
        Log.info("My timesheet button is visible");
        return MY_TIMESHEET_BUTTON;
    }

    public static SelenideElement getEmployeeDistributionBySubunitDiagram() {
        Log.info("Employee Distribution by subunit diagram is visible");
        return EMPLOYEE_DISTRIBUTION_BY_SUBUNIT_DIAGRAM;
    }

    public static SelenideElement getLegendComponent() {
        Log.info("Legend component is visible");
        return LEGEND_COMPONENT;
    }

    public static SelenideElement getPendingLeaveRequestsComponent() {
        Log.info("Pending leave request component is visible");
        return PENDING_LEAVE_REQUESTS_COMPONENT;
    }

    public static void clickWelcomeDropList () {
        WELCOME_DROPLIST.click();
        Log.info("Welcome drop list is clicked on");
    }

    public static void clickLogout () {
        LOGOUT_BUTTON.click();
        Log.info("Logout button is clicked on");
    }

    public static void clickMyInfoTab () {
        MY_INFO_TAB.click();
        Log.info("My info tab is clicked on to open my info page");
    }
}
