package utils.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PersonalDetailsPage {

    private static final SelenideElement FIRST_NAME_FIELD = $("#personal_txtEmpFirstName");
    private static final SelenideElement LAST_NAME_FIELD = $("#personal_txtEmpLastName");
    private static final SelenideElement EMPLOYEE_ID_FIELD = $("#personal_txtEmployeeId");
    private static final SelenideElement MALE_GENDER_RADIOBUTTON = $("#personal_optGender_1");
    private static final SelenideElement MARITAL_STATUS_FIELD = $("#personal_cmbMarital");
    private static final SelenideElement NATIONALITY_FIELD = $("#personal_cmbNation");
    private static final SelenideElement DATE_OF_BIRTH_FIELD = $("#personal_DOB");

    public static SelenideElement getFirstNameField() {
        return FIRST_NAME_FIELD;
    }

    public static SelenideElement getLastNameField() {
        return LAST_NAME_FIELD;
    }

    public static SelenideElement getEmployeeIdField() {
        return EMPLOYEE_ID_FIELD;
    }

    public static SelenideElement getMaleGenderRadiobutton() {
        return MALE_GENDER_RADIOBUTTON;
    }

    public static SelenideElement getMaritalStatusField() {
        return MARITAL_STATUS_FIELD;
    }

    public static SelenideElement getNationalityField() {
        return NATIONALITY_FIELD;
    }

    public static SelenideElement getDateOfBirthField() {
        return DATE_OF_BIRTH_FIELD;
    }
}
