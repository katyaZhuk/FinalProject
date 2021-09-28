package utils.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PersonalDetailsPage {

    private final SelenideElement FIRST_NAME_FIELD = $("#personal_txtEmpFirstName");
    private final SelenideElement LAST_NAME_FIELD = $("#personal_txtEmpLastName");
    private final SelenideElement EMPLOYEE_ID_FIELD = $("#personal_txtEmployeeId");
    private final SelenideElement MALE_GENDER_RADIOBUTTON = $("#personal_optGender_1");
    private final SelenideElement MARITAL_STATUS_FIELD = $("#personal_cmbMarital");
    private final SelenideElement NATIONALITY_FIELD = $("#personal_cmbNation");
    private final SelenideElement DATE_OF_BIRTH_FIELD = $("#personal_DOB");

    public SelenideElement getFirstNameField() {
        return FIRST_NAME_FIELD;
    }

    public SelenideElement getLastNameField() {
        return LAST_NAME_FIELD;
    }

    public SelenideElement getEmployeeIdField() {
        return EMPLOYEE_ID_FIELD;
    }

    public SelenideElement getMaleGenderRadiobutton() {
        return MALE_GENDER_RADIOBUTTON;
    }

    public SelenideElement getMaritalStatusField() {
        return MARITAL_STATUS_FIELD;
    }

    public SelenideElement getNationalityField() {
        return NATIONALITY_FIELD;
    }

    public SelenideElement getDateOfBirthField() {
        return DATE_OF_BIRTH_FIELD;
    }
}
