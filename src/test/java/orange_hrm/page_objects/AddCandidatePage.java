package orange_hrm.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class AddCandidatePage {

    private static final SelenideElement FIRST_NAME_FIELD = $("#addCandidate_firstName");
    private static final SelenideElement LAST_NAME_FIELD = $("#addCandidate_lastName");
    private static final SelenideElement EMAIL_FIELD = $("#addCandidate_email");
    private static final SelenideElement CONTACT_NO_FIELD = $("#addCandidate_contactNo");
    private static final SelenideElement JOB_VACANCY_FIELD = $("#addCandidate_vacancy");
    private static final SelenideElement RESUME_BUTTON = $("#addCandidate_resume");
    private static final SelenideElement DATE_OF_APPLICATION_BUTTON = $("#addCandidate_appliedDate");
    private static final SelenideElement CONSENT_TO_KEEP_DATA_CHECKBOX = $("#addCandidate_consentToKeepData");
    private static final SelenideElement SAVE_BUTTON = $("#btnSave");
    private static final ElementsCollection CANDIDATES_COLLECTION = $$("tbody tr");

    public static void enterFullName(String firstName, String lastName) {
        FIRST_NAME_FIELD.sendKeys(firstName);
        LAST_NAME_FIELD.sendKeys(lastName);
        Log.info("First name " + firstName + " and last name " + lastName + " are entered");
    }

    public static void enterEmail(String email) {
        EMAIL_FIELD.sendKeys(email);
        Log.info("Email " + email + " is entered");
    }

    public static void enterContactNo(String number) {
        CONTACT_NO_FIELD.sendKeys(number);
        Log.info("Contact number " + number + " is entered");
    }

    public static void selectJobVacancy(String vacancy) {
        JOB_VACANCY_FIELD.selectOption(vacancy);
        Log.info("Job vacancy " + vacancy + " is selected");
    }

    public static void addResume(String path) {
        RESUME_BUTTON.uploadFile(new File(path));
        Log.info("Resume is uploaded");
    }

    public static void setApplicationDate(String date) {
        DATE_OF_APPLICATION_BUTTON.clear();
        DATE_OF_APPLICATION_BUTTON.sendKeys(date);
        Log.info("Application date " + date + " is entered");
    }

    public static void selectCheckbox() {
        CONSENT_TO_KEEP_DATA_CHECKBOX.setSelected(true);
        Log.info("Checkbox for consenting to keep data is selected");
    }

    public static void clickSaveCandidateButton() {
        SAVE_BUTTON.click();
        Log.info("Save button is clicked on");
    }

    public static SelenideElement getNewCandidate(String lastName) {
        Log.info("Candidate with last name " + lastName + " is found");
        return CANDIDATES_COLLECTION.findBy(Condition.text(lastName));
    }
}
