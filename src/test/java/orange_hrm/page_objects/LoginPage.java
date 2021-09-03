package orange_hrm.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static utils.helpers.LoginHelper.*;

public class LoginPage {

    private static final SelenideElement USERNAME_FIELD = $("#txtUsername");
    private static final SelenideElement PASSWORD_FIELD = $("#txtPassword");
    private static final SelenideElement LOGIN_BUTTON = $("#btnLogin");
    private static final SelenideElement LOGIN_PANEL = $("#logInPanelHeading");

    public static void openLoginPage () throws IOException {
        open(getURL());
        Log.info("Login page is opened");
    }

    public static void login () throws IOException {
        USERNAME_FIELD.sendKeys(getUsername());
        Log.info("Username is entered to the username field");

        PASSWORD_FIELD.sendKeys(getPassword());
        Log.info("Password is entered to the password field");

        LOGIN_BUTTON.click();
        Log.info("Login button is clicked on");
    }

    public static SelenideElement getLoginPanel () {
        Log.info("Login panel is visible");
        return LOGIN_PANEL;
    }

}
