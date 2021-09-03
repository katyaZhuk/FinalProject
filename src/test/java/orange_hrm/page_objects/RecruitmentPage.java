package orange_hrm.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class RecruitmentPage {

    private static final SelenideElement RECRUITMENT_TAB = $("#menu_recruitment_viewRecruitmentModule");
    private static final SelenideElement CANDIDATES_TAB = $("#menu_recruitment_viewCandidates");
    private static final SelenideElement ADD_CANDIDATES_BUTTON = $("#btnAdd");

    public static void clickCandidatesLink() {
        RECRUITMENT_TAB.hover();
        CANDIDATES_TAB.click();
        Log.info("Candidates page is opened");
    }

    public static void clickAddCandidatesButton() {
        ADD_CANDIDATES_BUTTON.click();
        Log.info("Add button is clicked on to add new candidate");
    }
}
