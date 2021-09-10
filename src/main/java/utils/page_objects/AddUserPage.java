package utils.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.util.Optional;

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
        Optional.of(USER_ROLE_FIELD).ifPresent(
                x -> Log.info("User role field is visible")
        );
        return USER_ROLE_FIELD;
    }

    public static SelenideElement getEmployeeNameField() {
        Optional.of(EMPLOYEE_NAME_FIELD).ifPresent(
                x -> Log.info("Employee name field is visible")
        );
        return EMPLOYEE_NAME_FIELD;
    }

    public static SelenideElement getUsernameField() {
        Optional.of(USERNAME_FIELD).ifPresent(
                x -> Log.info("Username field is visible")
        );
        return USERNAME_FIELD;
    }

    public static SelenideElement getStatusField() {
        Optional.of(STATUS_FIELD).ifPresent(
                x ->Log.info("Status field is visible")
        );
        return STATUS_FIELD;
    }

    public static SelenideElement getPasswordField() {
        Optional.of(PASSWORD_FIELD).ifPresent(
                x -> Log.info("Password field is visible")
        );
        return PASSWORD_FIELD;
    }

    public static SelenideElement getConfirmPasswordField() {
        Optional.of(CONFIRM_PASSWORD_FIELD).ifPresent(
                x -> Log.info("Confirm password field is visible")
        );
        return CONFIRM_PASSWORD_FIELD;
    }

    public static void clickSaveUserButton() {
        Log.info("Save button is clicked on");
        SAVE_BUTTON.click();
    }

    public static void selectUserRole(String userRole) {
        USER_ROLE_FIELD.selectOption(userRole);
        Log.info("User role " + userRole + " is selected");
    }

    public static void enterEmployeeNameForAddUser(String name) {
        EMPLOYEE_NAME_FIELD.sendKeys(name);
        Log.info("Employee name " + name + " is entered");
    }

    public static void enterUsername(String username) {
        USERNAME_FIELD.sendKeys(username);
        Log.info("Username " + username + " is entered");
    }

    public static void selectStatus(String status) {
        STATUS_FIELD.selectOption(status);
        Log.info("Status " + status + " is selected");
    }

    public static void enterPassword(String password) {
        PASSWORD_FIELD.sendKeys(password);
        Log.info("Password " + password + " is entered");
    }

    public static void enterConfirmPassword(String confirmPassword) {
        CONFIRM_PASSWORD_FIELD.sendKeys(confirmPassword);
        Log.info("Confirm password " + confirmPassword + " is entered");
    }

}
