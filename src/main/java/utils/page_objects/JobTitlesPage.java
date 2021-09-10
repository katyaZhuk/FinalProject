package utils.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.util.Optional;

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
        Log.info("Add job title button is clicked on");
    }

    public static void fillJobTitleField(String jobTitle) {
        JOB_TITLE_FIELD.sendKeys(jobTitle);
        Log.info("Job title " + jobTitle + " is entered");
    }

    public static void clickSaveNewJobTitleButton() {
        SAVE_BUTTON.click();
        Log.info("Save button is clicked on to create new job title");
    }

    public static SelenideElement getNewJobTitle(String jobTitle) {
        Optional.of(JOB_TITLES_COLLECTION.findBy(Condition.text(jobTitle))).ifPresent(
                x -> Log.info("Job title " + jobTitle + " is found in job titles collection")
        );
        return JOB_TITLES_COLLECTION.findBy(Condition.text(jobTitle));
    }

    public static void clickDeleteNewJobTitleButton() {
        DELETE_BUTTON.click();
        Log.info("Delete button is clicked to delete created job title");
    }

    public static void clickDeleteConfirmationButton() {
        DELETE_CONFIRMATION_BUTTON.click();
        Log.info("Delete confirmation button is clicked on");
    }

    public static String getJobTitleCheckbox() {
        Optional.of(JOB_TITLE_CHECKBOX).ifPresent(
                x -> Log.info("New job title checkbox is selected")
        );
        return JOB_TITLE_CHECKBOX;
    }

    public static ElementsCollection getJobTitlesCollection() {
        return JOB_TITLES_COLLECTION;
    }
}
