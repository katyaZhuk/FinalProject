package utils.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class AssignLeavePage {

    private final SelenideElement LEAVE_TAB = $("#menu_leave_viewLeaveModule");
    private final SelenideElement ASSIGN_LEAVE_LINK = $("#menu_leave_assignLeave");
    private final SelenideElement EMPLOYEE_NAME_FIELD = $("#assignleave_txtEmployee_empName");
    private final SelenideElement LEAVE_TYPE_FIELD = $("#assignleave_txtLeaveType");
    private final SelenideElement FROM_DATE_FIELD = $("#assignleave_txtFromDate");
    private final SelenideElement TO_DATE_FIELD = $("#assignleave_txtToDate");
    private final SelenideElement ASSIGN_BUTTON = $("#assignBtn");

    public SelenideElement getAssignLeaveEmployeeNameField() {
        if (EMPLOYEE_NAME_FIELD.isDisplayed()) {
            Log.info("Employee name field is visible");
        } else {
            Log.info("Employee name field is not visible");
        }
        return EMPLOYEE_NAME_FIELD;
    }

    public SelenideElement getAssignLeaveTypeField() {
        if (LEAVE_TYPE_FIELD.isDisplayed()) {
            Log.info("Type field is visible");
        } else {
            Log.info("Type field is not visible");
        }
        return LEAVE_TYPE_FIELD;
    }

    public SelenideElement getAssignLeaveFromDateField() {
        if (FROM_DATE_FIELD.isDisplayed()) {
            Log.info("From date field is visible");
        } else {
            Log.info("From date field is not visible");
        }
        return FROM_DATE_FIELD;
    }

    public SelenideElement getAssignLeaveToDateField() {
        if (TO_DATE_FIELD.isDisplayed()) {
            Log.info("To date field is visible");
        } else {
            Log.info("To date field is not visible");
        }
        return TO_DATE_FIELD;
    }

    public void clickAssignLeaveLink() {
        LEAVE_TAB.hover();
        ASSIGN_LEAVE_LINK.click();
        Log.info("Assign leave page is opened");
    }

    public void enterEmployeeNameForAssignLeave(String name) {
        EMPLOYEE_NAME_FIELD.sendKeys(name);
        Log.info("Employee name " + name + " is entered");
    }

    public void selectLeaveType(String leaveType) {
        LEAVE_TYPE_FIELD.selectOption(leaveType);
        Log.info("Leave type " + leaveType + " is selected");
    }

    public void selectFromDate(String from) {
        FROM_DATE_FIELD.clear();
        FROM_DATE_FIELD.sendKeys(from);
        Log.info("Assign leave date from " + from + " is entered");
    }

    public void selectToDate(String to) {
        TO_DATE_FIELD.clear();
        TO_DATE_FIELD.sendKeys(to);
        Log.info("Assign leave date to " + to + " is entered");
    }

    public void clickAssignButton() {
        ASSIGN_BUTTON.pressEnter();
        Log.info("Assign button is clicked on to assign leave");
    }

}
