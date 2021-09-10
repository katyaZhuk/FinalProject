package utils.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.io.IOException;
import java.util.Optional;

import static com.codeborne.selenide.Selenide.*;
import static utils.helpers.AddUserHelper.getNewUsername;

public class AdminPage {

    private static final SelenideElement ADMIN_TAB = $("#menu_admin_viewAdminModule");
    private static final SelenideElement ADD_USER_BUTTON = $("#btnAdd");
    private static final SelenideElement JOB_TAB = $("#menu_admin_Job");
    private static final SelenideElement JOB_TITLES_LINK = $("#menu_admin_viewJobTitleList");
    private static final ElementsCollection NEW_USERS_COLLECTION = $$("tbody tr");
    private static final SelenideElement ORGANIZATION_TAB = $("#menu_admin_Organization");
    private static final SelenideElement STRUCTURE_LINK = $("#menu_admin_viewCompanyStructure");

    public static void clickAdminTab() {
        ADMIN_TAB.click();
        Log.info("Admin tab is clicked on");
    }

    public static void clickAddUserButton() {
        ADD_USER_BUTTON.click();
        Log.info("Add user button is clicked on");
    }

    public static SelenideElement findNewUser() throws IOException {
        Optional.of(NEW_USERS_COLLECTION.findBy(Condition.text(getNewUsername()))).ifPresent(
                x -> {
                    try {
                        Log.info("New user with username " + getNewUsername() + " is found");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
        return NEW_USERS_COLLECTION.findBy(Condition.text(getNewUsername()));
    }

    public static void clickJobTitlesLink() {
        ADMIN_TAB.hover();
        JOB_TAB.hover();
        JOB_TITLES_LINK.click();
        Log.info("Job titles link is clicked on");
    }

    public static void clickOrganizationStructureLink () {
        ADMIN_TAB.hover();
        ORGANIZATION_TAB.hover();
        STRUCTURE_LINK.click();
        Log.info("Organization structure link is clicked on");
    }

}
