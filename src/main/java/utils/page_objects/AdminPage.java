package utils.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static utils.helpers.AddUserHelper.getNewUsername;

public class AdminPage {

    private final SelenideElement ADMIN_TAB = $("#menu_admin_viewAdminModule");
    private final SelenideElement ADD_USER_BUTTON = $("#btnAdd");
    private final SelenideElement JOB_TAB = $("#menu_admin_Job");
    private final SelenideElement JOB_TITLES_LINK = $("#menu_admin_viewJobTitleList");
    private final ElementsCollection NEW_USERS_COLLECTION = $$("tbody tr");
    private final SelenideElement ORGANIZATION_TAB = $("#menu_admin_Organization");
    private final SelenideElement STRUCTURE_LINK = $("#menu_admin_viewCompanyStructure");

    public void clickAdminTab() {
        ADMIN_TAB.click();
        Log.info("Admin tab is clicked on");
    }

    public void clickAddUserButton() {
        ADD_USER_BUTTON.click();
        Log.info("Add user button is clicked on");
    }

    public SelenideElement findNewUser() throws IOException {
        if (NEW_USERS_COLLECTION.findBy(Condition.text(getNewUsername())).isDisplayed()) {
            Log.info("New user with username " + getNewUsername() + " is found");
        } else {
            Log.info("New user with username " + getNewUsername() + " is not found");
        }
        return NEW_USERS_COLLECTION.findBy(Condition.text(getNewUsername()));
    }

    public void clickJobTitlesLink() {
        ADMIN_TAB.hover();
        JOB_TAB.hover();
        JOB_TITLES_LINK.click();
        Log.info("Job titles link is clicked on");
    }

    public void clickOrganizationStructureLink() {
        ADMIN_TAB.hover();
        ORGANIZATION_TAB.hover();
        STRUCTURE_LINK.click();
        Log.info("Organization structure link is clicked on");
    }

}
