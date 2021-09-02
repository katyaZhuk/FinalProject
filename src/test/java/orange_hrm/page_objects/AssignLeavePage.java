package orange_hrm.page_objects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Link;
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

    public static SelenideElement getAssignLeaveEmployeeNameField() {
        return EMPLOYEE_NAME_FIELD;
    }

    public static SelenideElement getAssignLeaveTypeField() {
        return LEAVE_TYPE_FIELD;
    }

    public static SelenideElement getAssignLeaveFromDateField() {
        return FROM_DATE_FIELD;
    }

    public static SelenideElement getAssignLeaveToDateField() {
        return TO_DATE_FIELD;
    }

    public static void clickAssignLeaveLink () {
        LEAVE_TAB.hover();
        ASSIGN_LEAVE_LINK.click();
        Log.info("Assign leave page is opened");
    }

    public static void enterEmployeeName (String name) {
        EMPLOYEE_NAME_FIELD.sendKeys(name);
        Log.info("Employee name " + name + " is entered");
    }

    public static void selectLeaveType (String leaveType) {
        LEAVE_TYPE_FIELD.selectOption(leaveType);
        Log.info("Leave type " + leaveType + " is selected");
    }

    public static void selectFromDate (String from) {
        FROM_DATE_FIELD.clear();
        FROM_DATE_FIELD.sendKeys(from);
        Log.info("Assign leave date from " + from + " is entered");
    }

    public static void selectToDate (String to) {
        TO_DATE_FIELD.clear();
        TO_DATE_FIELD.sendKeys(to);
        Log.info("Assign leave date to " + to + " is entered");
    }

    public static void clickAssignButton () {
        ASSIGN_BUTTON.pressEnter();
        Log.info("Assign button is clicked on to assign leave");
    }

}
