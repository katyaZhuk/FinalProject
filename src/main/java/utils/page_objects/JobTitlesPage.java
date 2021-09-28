package utils.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.*;

public class JobTitlesPage {

    private final SelenideElement ADD_JOB_TITLE_BUTTON = $("#btnAdd");
    private final SelenideElement JOB_TITLE_FIELD = $("#jobTitle_jobTitle");
    private final SelenideElement SAVE_BUTTON = $("#btnSave");
    private final ElementsCollection JOB_TITLES_COLLECTION = $$("tbody tr");
    private final SelenideElement DELETE_BUTTON = $("#btnDelete");
    private final SelenideElement DELETE_CONFIRMATION_BUTTON = $("#dialogDeleteBtn");
    private static final String JOB_TITLE_CHECKBOX = "input[type='checkbox']";

    public void clickAddJobTitleButton() {
        ADD_JOB_TITLE_BUTTON.click();
        Log.info("Add job title button is clicked on");
    }

    public void fillJobTitleField(String jobTitle) {
        JOB_TITLE_FIELD.sendKeys(jobTitle);
        Log.info("Job title " + jobTitle + " is entered");
    }

    public void clickSaveNewJobTitleButton() {
        SAVE_BUTTON.click();
        Log.info("Save button is clicked on to create new job title");
    }

    public SelenideElement getNewJobTitle(String jobTitle) {
        if (JOB_TITLES_COLLECTION.findBy(Condition.text(jobTitle)).isDisplayed()) {
            Log.info("Job title " + jobTitle + " is found in job titles collection");
        } else {
            Log.info("Job title " + jobTitle + " is not found in job titles collection");
        }
        return JOB_TITLES_COLLECTION.findBy(Condition.text(jobTitle));
    }

    public void clickDeleteNewJobTitleButton() {
        DELETE_BUTTON.click();
        Log.info("Delete button is clicked to delete created job title");
    }

    public void clickDeleteConfirmationButton() {
        DELETE_CONFIRMATION_BUTTON.click();
        Log.info("Delete confirmation button is clicked on");
    }

    public static String getJobTitleCheckbox() {
        return JOB_TITLE_CHECKBOX;
    }

    public ElementsCollection getJobTitlesCollection() {
        return JOB_TITLES_COLLECTION;
    }
}
