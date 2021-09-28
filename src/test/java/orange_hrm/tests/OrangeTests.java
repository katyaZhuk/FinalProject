package orange_hrm.tests;

import io.qameta.allure.Description;
import utils.Driver;
import utils.page_objects.*;
import org.junit.jupiter.api.*;

import java.io.IOException;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static utils.page_objects.JobTitlesPage.*;
import static utils.helpers.AddCandidateHelper.*;
import static utils.helpers.AddUserHelper.*;
import static utils.helpers.AssignLeaveHelper.*;
import static utils.helpers.JobTitleHelper.getJobTitlesList;
import static utils.helpers.PhotoHelper.getEmployeePhotoPath;
import static utils.helpers.SalesEmployeeHelper.*;
import static utils.helpers.StructureHelper.getNewDepartment;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrangeTests {

    Driver driver = new Driver();
    AddCandidatePage addCandidatePage = new AddCandidatePage();
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();
    AssignLeavePage assignLeavePage = new AssignLeavePage();
    DashboardPage dashboardPage = new DashboardPage();
    JobTitlesPage jobTitlesPage = new JobTitlesPage();
    LeaveListPage leaveListPage = new LeaveListPage();
    LoginPage loginPage = new LoginPage();
    MyInfoPage myInfoPage = new MyInfoPage();
    OrganizationStructurePage organizationStructurePage = new OrganizationStructurePage();
    PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage();
    PIMPage pimPage = new PIMPage();
    RecruitmentPage recruitmentPage = new RecruitmentPage();

    @BeforeAll
    public void setUp() {
        driver.getMaximizedWindow();
    }

    @Test
    @BeforeEach
    @Description("Test for login to https://opensource-demo.orangehrmlive.com/")
    public void loginTest() throws IOException {
        loginPage.openLoginPage();
        loginPage.login();
        dashboardPage.getDashboardPageTitle().shouldBe(visible);
    }

    @Disabled
    @Test
    @Description("Test for adding new user")
    @Order(1)
    public void addUserTest() throws IOException {
        adminPage.clickAdminTab();
        adminPage.clickAddUserButton();

        addUserPage.getUserRoleField().shouldBe(visible);
        addUserPage.getEmployeeNameField().shouldBe(visible);
        addUserPage.getUsernameField().shouldBe(visible);
        addUserPage.getStatusField().shouldBe(visible);
        addUserPage.getPasswordField().shouldBe(visible);
        addUserPage.getConfirmPasswordField().shouldBe(visible);

        addUserPage.selectUserRole(getESSUserRole());
        addUserPage.enterEmployeeNameForAddUser(getEmployeeName());
        addUserPage.enterUsername(getNewUsername());
        addUserPage.selectStatus(getEnabledStatus());
        addUserPage.enterPassword(getNewUserPassword());
        addUserPage.enterConfirmPassword(getNewUserConfirmPassword());

        addUserPage.clickSaveUserButton();

        adminPage.findNewUser().shouldBe(exist);
    }

    @Test
    @Description("Test for adding and deleting three job titles")
    @Order(2)
    public void addAndDeleteThreeJobTitlesTest() throws IOException {
        adminPage.clickJobTitlesLink();

        getJobTitlesList().forEach(
                elem -> {
                    jobTitlesPage.clickAddJobTitleButton();
                    jobTitlesPage.fillJobTitleField(elem);
                    jobTitlesPage.clickSaveNewJobTitleButton();
                    jobTitlesPage.getNewJobTitle(elem).shouldBe(visible);
                    int sizeJobTitlesCollectionBeforeDeletion = jobTitlesPage.getJobTitlesCollection().size();

                    jobTitlesPage.getNewJobTitle(elem).$(getJobTitleCheckbox()).setSelected(true);

                    jobTitlesPage.clickDeleteNewJobTitleButton();
                    jobTitlesPage.clickDeleteConfirmationButton();

                    jobTitlesPage.getJobTitlesCollection().shouldHave(size(sizeJobTitlesCollectionBeforeDeletion - 1));
                }
        );
    }

    @Test
    @Description("Test for adding new candidate")
    @Order(3)
    public void addCandidateTest() throws IOException {
        recruitmentPage.clickCandidatesLink();
        recruitmentPage.clickAddCandidatesButton();

        addCandidatePage.enterFullName(getCandidateFirstName(), getCandidateLastName());
        addCandidatePage.enterEmail(getCandidateEmail());
        addCandidatePage.enterContactNo(getCandidateContactNo());
        addCandidatePage.selectJobVacancy(getCandidateJobVacancy());
        addCandidatePage.addResume(getCandidateResume());
        addCandidatePage.setApplicationDate(getCandidateApplicationDate());
        addCandidatePage.selectCheckbox();

        addCandidatePage.clickSaveCandidateButton();

        addCandidatePage.getNewCandidate(getCandidateLastName()).shouldBe(exist);
    }

    @Test
    @Description("Test for assigning leave by employee")
    @Order(4)
    public void assignLeaveTest() throws IOException {

        assignLeavePage.clickAssignLeaveLink();

        assignLeavePage.getAssignLeaveEmployeeNameField().shouldBe(visible);
        assignLeavePage.getAssignLeaveTypeField().shouldBe(visible);
        assignLeavePage.getAssignLeaveFromDateField().shouldBe(visible);
        assignLeavePage.getAssignLeaveToDateField().shouldBe(visible);

        assignLeavePage.enterEmployeeNameForAssignLeave(getAssignLeaveEmployeeName());
        assignLeavePage.selectLeaveType(getAssignLeaveType());
        assignLeavePage.selectFromDate(getAssignLeaveFromDate());
        assignLeavePage.selectToDate(getAssignLeaveToDate());

        assignLeavePage.clickAssignButton();

        leaveListPage.findAssignLeave(getAssignLeaveDates()).shouldBe(visible);
    }

    @Test
    @Description("Test for checking dashboard to watch all elements")
    @Order(5)
    public void checkDashboardTest() {
        dashboardPage.getAssignLeaveButton().shouldBe(visible);
        dashboardPage.getLeaveListButton().shouldBe(visible);
        dashboardPage.getTimesheetsButton().shouldBe(visible);
        dashboardPage.getApplyLeaveButton().shouldBe(visible);
        dashboardPage.getMyLeaveButton().shouldBe(visible);
        dashboardPage.getMyTimesheetButton().shouldBe(visible);
        dashboardPage.getEmployeeDistributionBySubunitDiagram().shouldBe(visible);
        dashboardPage.getLegendComponent().shouldBe(visible);
        dashboardPage.getPendingLeaveRequestsComponent().shouldBe(visible);
    }

    @Test
    @Description("Test for checking any employee from sales subunit")
    @Order(6)
    public void checkSalesEmployeeTest() throws IOException {

        pimPage.clickPIMPageLink();
        pimPage.findSalesEmployee(getSalesSubUnit());

        personalDetailsPage.getFirstNameField().shouldHave(exactValue(getSalesFirstName()));
        personalDetailsPage.getLastNameField().shouldHave(exactValue(getSalesLastName()));
        personalDetailsPage.getEmployeeIdField().shouldHave(exactValue(getSalesId()));
        personalDetailsPage.getMaleGenderRadiobutton().shouldBe(checked);
        personalDetailsPage.getMaritalStatusField().shouldHave(exactValue(getSalesMaritalStatus()));
        personalDetailsPage.getNationalityField().shouldHave(text(getSalesNationality()));
        personalDetailsPage.getDateOfBirthField().shouldHave(exactValue(getSalesDateOfBirth()));
    }

    @Test
    @Description("Test for editing organisation structure by adding and deleting new department")
    @Order(7)
    public void editOrganizationStructureTest() throws IOException {
        adminPage.clickOrganizationStructureLink();

        organizationStructurePage.clickEditOrganizationStructureButton();
        organizationStructurePage.addNewDepartment();
        organizationStructurePage.enterDepartmentName(getNewDepartment());
        organizationStructurePage.clickSaveDepartmentButton();
        organizationStructurePage.clickDoneButton();

        int collectionSizeBeforeDeleting = organizationStructurePage.getSalesAndMarketingCollection().size();

        organizationStructurePage.clickEditOrganizationStructureButton();
        organizationStructurePage.deleteNewDepartment();
        organizationStructurePage.confirmDeleteNewDepartment();
        organizationStructurePage.clickDoneButton();

        organizationStructurePage.getSalesAndMarketingCollection().shouldHave(size(collectionSizeBeforeDeleting - 1));
    }

    @Test
    @Description("Test for changing employee photo by uploading new one")
    @Order(8)
    public void changeEmployeePhotoTest() throws IOException {
        dashboardPage.clickMyInfoTab();

        myInfoPage.clickEmployeePhotoLink();
        myInfoPage.selectPhotoFile(getEmployeePhotoPath());
        myInfoPage.clickUploadButton();

        myInfoPage.getSuccessMessage().shouldBe(visible);
    }

    @Test
    @Description("Test for logout from system")
    @Order(9)
    public void logoutTest() {
        dashboardPage.clickWelcomeDropList();
        dashboardPage.clickLogout();

        loginPage.getLoginPanel().shouldBe(visible);
    }
}
