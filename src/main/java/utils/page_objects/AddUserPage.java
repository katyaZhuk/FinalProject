package utils.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.*;

public class AddUserPage {

    private final SelenideElement USER_ROLE_FIELD = $("#systemUser_userType");
    private final SelenideElement EMPLOYEE_NAME_FIELD = $("#systemUser_employeeName_empName");
    private final SelenideElement USERNAME_FIELD = $("#systemUser_userName");
    private final SelenideElement STATUS_FIELD = $("#systemUser_status");
    private final SelenideElement PASSWORD_FIELD = $("#systemUser_password");
    private final SelenideElement CONFIRM_PASSWORD_FIELD = $("#systemUser_confirmPassword");
    private final SelenideElement SAVE_BUTTON = $("#btnSave");

    public SelenideElement getUserRoleField() {
        if (USER_ROLE_FIELD.isDisplayed()) {
            Log.info("User role field is visible");
        } else {
            Log.info("User role field is not visible");
        }
        return USER_ROLE_FIELD;
    }

    public SelenideElement getEmployeeNameField() {
        if (EMPLOYEE_NAME_FIELD.isDisplayed()) {
            Log.info("Employee name field is visible");
        } else {
            Log.info("Employee name field is not visible");
        }
        return EMPLOYEE_NAME_FIELD;
    }

    public SelenideElement getUsernameField() {
        if (USERNAME_FIELD.isDisplayed()) {
            Log.info("Username field is visible");
        } else {
            Log.info("Username field is not visible");
        }
        return USERNAME_FIELD;
    }

    public SelenideElement getStatusField() {
        if (STATUS_FIELD.isDisplayed()) {
            Log.info("Status field is visible");
        } else {
            Log.info("Status field is not visible");
        }
        return STATUS_FIELD;
    }

    public SelenideElement getPasswordField() {
        if (PASSWORD_FIELD.isDisplayed()) {
            Log.info("Password field is visible");
        } else {
            Log.info("Password field is not visible");
        }
        return PASSWORD_FIELD;
    }

    public SelenideElement getConfirmPasswordField() {
        if (CONFIRM_PASSWORD_FIELD.isDisplayed()) {
            Log.info("Confirm password field is visible");
        } else {
            Log.info("Confirm password field is not visible");
        }
        return CONFIRM_PASSWORD_FIELD;
    }

    public void clickSaveUserButton() {
        Log.info("Save button is clicked on");
        SAVE_BUTTON.click();
    }

    public void selectUserRole(String userRole) {
        USER_ROLE_FIELD.selectOption(userRole);
        Log.info("User role " + userRole + " is selected");
    }

    public void enterEmployeeNameForAddUser(String name) {
        EMPLOYEE_NAME_FIELD.sendKeys(name);
        Log.info("Employee name " + name + " is entered");
    }

    public void enterUsername(String username) {
        USERNAME_FIELD.sendKeys(username);
        Log.info("Username " + username + " is entered");
    }

    public void selectStatus(String status) {
        STATUS_FIELD.selectOption(status);
        Log.info("Status " + status + " is selected");
    }

    public void enterPassword(String password) {
        PASSWORD_FIELD.sendKeys(password);
        Log.info("Password " + password + " is entered");
    }

    public void enterConfirmPassword(String confirmPassword) {
        CONFIRM_PASSWORD_FIELD.sendKeys(confirmPassword);
        Log.info("Confirm password " + confirmPassword + " is entered");
    }

}
