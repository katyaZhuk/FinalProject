package utils.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static utils.helpers.LoginHelper.*;

public class LoginPage {

    private final SelenideElement USERNAME_FIELD = $("#txtUsername");
    private final SelenideElement PASSWORD_FIELD = $("#txtPassword");
    private final SelenideElement LOGIN_BUTTON = $("#btnLogin");
    private final SelenideElement LOGIN_PANEL = $("#logInPanelHeading");

    public void openLoginPage() throws IOException {
        open(getURL());
        Log.info("Login page is opened");
    }

    public void login() throws IOException {
        USERNAME_FIELD.sendKeys(getUsername());
        Log.info("Username is entered to the username field");

        PASSWORD_FIELD.sendKeys(getPassword());
        Log.info("Password is entered to the password field");

        LOGIN_BUTTON.click();
        Log.info("Login button is clicked on");
    }

    public SelenideElement getLoginPanel() {
        if (LOGIN_PANEL.isDisplayed()) {
            Log.info("Login panel is visible");
        } else {
            Log.info("Login panel is not visible");
        }
        return LOGIN_PANEL;
    }

}
