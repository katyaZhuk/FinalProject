package orange_hrm.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.*;

public class AddUserPage {

    private static final SelenideElement USER_ROLE_FIELD = $("#systemUser_userType");
    private static final SelenideElement EMPLOYEE_NAME_FIELD = $("#systemUser_employeeName_empName");
    private static final SelenideElement USERNAME_FIELD = $("#systemUser_userName");
    private static final SelenideElement STATUS_FIELD = $("#systemUser_status");
    private static final SelenideElement PASSWORD_FIELD = $("#systemUser_password");
    private static final SelenideElement CONFIRM_PASSWORD_FIELD = $("#systemUser_confirmPassword");
    private static final SelenideElement SAVE_BUTTON = $("#btnSave");

    public static SelenideElement getUserRoleField() {
        Log.info("User role is selected");
        return USER_ROLE_FIELD;
    }

    public static SelenideElement getEmployeeNameField() {
        Log.info("Employee name is entered");
        return EMPLOYEE_NAME_FIELD;
    }

    public static SelenideElement getUsernameField() {
        Log.info("Username is entered");
        return USERNAME_FIELD;
    }

    public static SelenideElement getStatusField() {
        Log.info("Status is selected");
        return STATUS_FIELD;
    }

    public static SelenideElement getPasswordField() {
        Log.info("Password is entered");
        return PASSWORD_FIELD;
    }

    public static SelenideElement getConfirmPasswordField() {
        Log.info("Confirm password is entered");
        return CONFIRM_PASSWORD_FIELD;
    }

    public static void clickSaveUserButton() {
        Log.info("Save button is clicked on");
        SAVE_BUTTON.click();
    }

}
