package utils.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static utils.helpers.AssignLeaveHelper.*;

public class LeaveListPage {

    private final SelenideElement LEAVE_LIST_PAGE = $("#menu_leave_viewLeaveList");
    private final SelenideElement ALL_LEAVE_STATUSES_CHECKBOX = $("#leaveList_chkSearchFilter_checkboxgroup_allcheck");
    private final SelenideElement EMPLOYEE_FIELD = $("#leaveList_txtEmployee_empName");
    private final SelenideElement SEARCH_BUTTON = $("#btnSearch");
    private final ElementsCollection LEAVE_LIST_COLLECTION = $$("tbody tr");

    public SelenideElement findAssignLeave(String dates) throws IOException {
        LEAVE_LIST_PAGE.click();
        ALL_LEAVE_STATUSES_CHECKBOX.setSelected(true);
        EMPLOYEE_FIELD.sendKeys(getAssignLeaveEmployeeName());
        SEARCH_BUTTON.click();

        if (LEAVE_LIST_COLLECTION.findBy(Condition.text(dates)).isDisplayed()) {
            Log.info("Assign leave from " + dates + " dates is found");
        } else {
            Log.info("Assign leave from " + dates + " dates is not found");
        }
        return LEAVE_LIST_COLLECTION.findBy(Condition.text(dates));
    }
}
