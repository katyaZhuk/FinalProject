package utils.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.io.IOException;
import java.util.Optional;

import static com.codeborne.selenide.Selenide.*;
import static utils.helpers.AssignLeaveHelper.*;

public class LeaveListPage {

    private static final SelenideElement LEAVE_LIST_PAGE = $("#menu_leave_viewLeaveList");
    private static final SelenideElement ALL_LEAVE_STATUSES_CHECKBOX = $("#leaveList_chkSearchFilter_checkboxgroup_allcheck");
    private static final SelenideElement EMPLOYEE_FIELD = $("#leaveList_txtEmployee_empName");
    private static final SelenideElement SEARCH_BUTTON = $("#btnSearch");
    private static final ElementsCollection LEAVE_LIST_COLLECTION = $$("tbody tr");

    public static SelenideElement findAssignLeave(String dates) throws IOException {
        LEAVE_LIST_PAGE.click();
        ALL_LEAVE_STATUSES_CHECKBOX.setSelected(true);
        EMPLOYEE_FIELD.sendKeys(getAssignLeaveEmployeeName());
        SEARCH_BUTTON.click();

        Optional.of(LEAVE_LIST_COLLECTION.findBy(Condition.text(dates))).ifPresent(
                x -> Log.info("Assign leave from " + dates + " dates is found")
        );
        return LEAVE_LIST_COLLECTION.findBy(Condition.text(dates));
    }
}
