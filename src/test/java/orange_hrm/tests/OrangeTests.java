package orange_hrm.tests;

import org.junit.jupiter.api.*;

import java.io.IOException;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static orange_hrm.page_objects.AddCandidatePage.*;
import static orange_hrm.page_objects.AddUserPage.*;
import static orange_hrm.page_objects.AdminPage.*;
import static orange_hrm.page_objects.DashboardPage.*;
import static orange_hrm.page_objects.JobTitlesPage.*;
import static orange_hrm.page_objects.LoginPage.*;
import static orange_hrm.page_objects.RecruitmentPage.*;
import static utils.Driver.getMaximizedWindow;
import static utils.helpers.AddCandidateHelper.*;
import static utils.helpers.AddCandidateHelper.getCandidateLastName;
import static utils.helpers.AddUserHelper.*;
import static utils.helpers.JobTitleHelper.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrangeTests {

    @BeforeAll
    public void setUp() {
        getMaximizedWindow();
    }

    @BeforeEach
    @Test
    public void loginTest() throws IOException {
        openLoginPage();
        login();
        getDashboardPageTitle().shouldBe(visible);
    }

    @Test
    public void addUserTest() throws IOException {
        clickAdminTab();
        clickAddUserButton();

        getUserRoleField().shouldBe(visible).selectOption(getESSUserRole());
        getEmployeeNameField().shouldBe(visible).sendKeys(getEmployeeName());
        getUsernameField().shouldBe(visible).sendKeys(getNewUsername());
        getStatusField().shouldBe(visible).selectOption(getEnabledStatus());
        getPasswordField().shouldBe(visible).sendKeys(getNewUserPassword());
        getConfirmPasswordField().shouldBe(visible).sendKeys(getNewUserConfirmPassword());

        clickSaveUserButton();

        findNewUser().shouldBe(exist);

    }

    @Test
    public void addAndDeleteThreeJobTitlesTest() throws IOException {

        clickJobTitlesLink();

        getJobTitlesList().forEach(
                elem -> {
                    clickAddJobTitleButton();
                    fillJobTitleField(elem);
                    clickSaveNewJobTitleButton();
                    getNewJobTitle(elem).shouldBe(visible);
                    int sizeJobTitlesCollectionBeforeDeletion = getJobTitlesCollection().size();

                    getNewJobTitle(elem).$(getJobTitleCheckbox()).setSelected(true);

                    clickDeleteNewJobTitleButton();
                    clickDeleteConfirmationButton();

                    getJobTitlesCollection().shouldHave(size(sizeJobTitlesCollectionBeforeDeletion - 1));
                }
        );
    }

    @Test
    public void addCandidate() throws IOException {

        clickCandidatesLink();
        clickAddCandidatesButton();

        enterFullName(getCandidateFirstName(), getCandidateLastName());
        enterEmail(getCandidateEmail());
        enterContactNo(getCandidateContactNo());
        selectJobVacancy(getCandidateJobVacancy());
        addResume(getCandidateResume());
        setApplicationDate(getCandidateApplicationDate());
        selectCheckbox();

        clickSaveCandidateButton();

        getNewCandidate(getCandidateLastName()).shouldBe(exist);

    }



}
