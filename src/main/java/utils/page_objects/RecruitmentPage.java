package utils.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class RecruitmentPage {

    private final SelenideElement RECRUITMENT_TAB = $("#menu_recruitment_viewRecruitmentModule");
    private final SelenideElement CANDIDATES_TAB = $("#menu_recruitment_viewCandidates");
    private final SelenideElement ADD_CANDIDATES_BUTTON = $("#btnAdd");

    public void clickCandidatesLink() {
        RECRUITMENT_TAB.hover();
        CANDIDATES_TAB.click();
        Log.info("Candidates page is opened");
    }

    public void clickAddCandidatesButton() {
        ADD_CANDIDATES_BUTTON.click();
        Log.info("Add button is clicked on to add new candidate");
    }
}
