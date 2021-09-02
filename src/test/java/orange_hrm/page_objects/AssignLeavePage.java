package orange_hrm.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class AssignLeavePage {

    private static final SelenideElement LEAVE_TAB = $("#menu_leave_viewLeaveModule");
    private static final SelenideElement ASSIGN_LEAVE_LINK = $("#menu_leave_assignLeave");
    private static final SelenideElement EMPLOYEE_NAME_FIELD = $("#assignleave_txtEmployee_empName");
    private static final SelenideElement LEAVE_TYPE_FIELD = $("#assignleave_txtLeaveType");
    private static final SelenideElement FROM_DATE_FIELD = $("#assignleave_txtFromDate");
    private static final SelenideElement TO_DATE_FIELD = $("#assignleave_txtToDate");
    private static final SelenideElement ASSIGN_BUTTON = $("#assignBtn");

    public static void clickAssignLeaveLink () {
        LEAVE_TAB.hover();
        ASSIGN_LEAVE_LINK.click();
        Log.info("Assign leave page is opened");
    }

    public static void enterEmployeeName (String name) {
        EMPLOYEE_NAME_FIELD.sendKeys(name);
        Log.info("Employee name " + name + " is enteder");
    }
}
