package orange_hrm.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class JobTitlesPage {

    private static final SelenideElement ADD_JOB_TITLE_BUTTON = $("#btnAdd");
    private static final SelenideElement JOB_TITLE_FIELD = $("#jobTitle_jobTitle");
    private static final SelenideElement SAVE_BUTTON = $("#btnSave");
    private static final ElementsCollection JOB_TITLES_COLLECTION = $$("tbody tr");
    private static final SelenideElement DELETE_BUTTON = $("#btnDelete");
    private static final SelenideElement DELETE_CONFIRMATION_BUTTON = $("#dialogDeleteBtn");
    private static final String JOB_TITLE_CHECKBOX = "input[type='checkbox']";

    public static void clickAddJobTitleButton() {
        ADD_JOB_TITLE_BUTTON.click();
    }

    public static void fillJobTitleField(String jobTitle) {
        JOB_TITLE_FIELD.sendKeys(jobTitle);
    }

    public static void clickSaveNewJobTitleButton() {
        SAVE_BUTTON.click();
    }

    public static SelenideElement getNewJobTitle(String jobTitle) {
        return JOB_TITLES_COLLECTION.findBy(Condition.text(jobTitle));
    }

    public static void clickDeleteNewJobTitleButton() {
        DELETE_BUTTON.click();
    }

    public static void clickDeleteConfirmationButton() {
        DELETE_CONFIRMATION_BUTTON.click();
    }

    public static String getJobTitleCheckbox() {
        return JOB_TITLE_CHECKBOX;
    }

    public static ElementsCollection getJobTitlesCollection() {
        return JOB_TITLES_COLLECTION;
    }
}
