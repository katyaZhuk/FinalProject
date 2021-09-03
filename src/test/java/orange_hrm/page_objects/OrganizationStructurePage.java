package orange_hrm.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.*;

public class OrganizationStructurePage {

    private static final SelenideElement EDIT_BUTTON = $("#btnEdit");
    private static final ElementsCollection SALES_AND_MARKETING_COLLECTION = $$("li[id=node_7] ul li");
    private static final SelenideElement ADD_NEW_DEPARTMENT_BUTTON = $("#treeLink_addChild_7");
    private static final SelenideElement NAME_FIELD = $("#txtName");
    private static final SelenideElement SAVE_BUTTON = $("#btnSave");
    private static final SelenideElement DONE_BUTTON = $("#btnEdit");
    private static final String DELETE_NEW_DEPARTMENT_BUTTON = ".deleteButton";
    private static final SelenideElement CONFIRM_DELETE_BUTTON = $("#dialogYes");


    public static void clickEditOrganizationStructureButton() {
        EDIT_BUTTON.click();
        Log.info("Edit button is clicked on to edit organization structure");
    }

    public static void addNewDepartment() {
        ADD_NEW_DEPARTMENT_BUTTON.click();
        Log.info("Add button is clicked on to add new department to organization structure");
    }

    public static void enterDepartmentName(String department) {
        NAME_FIELD.sendKeys(department);
        Log.info("Department name " + department + " is entered to name field");
    }

    public static void clickSaveDepartmentButton() {
        SAVE_BUTTON.click();
        Log.info("Save button is clicked on to add new department to organization structure");
    }

    public static void clickDoneButton() {
        DONE_BUTTON.click();
        Log.info("Done button is clicked on to finish editing organization structure");
    }

    public static void deleteNewDepartment() {
        SALES_AND_MARKETING_COLLECTION.last().$(DELETE_NEW_DEPARTMENT_BUTTON).click();
        Log.info("Delete button is clicked on to delete new department");
    }

    public static void confirmDeleteNewDepartment() {
        CONFIRM_DELETE_BUTTON.click();
        Log.info("Confirm delete button is clicked on to delete new department");
    }

    public static ElementsCollection getSalesAndMarketingCollection() {
        return SALES_AND_MARKETING_COLLECTION;
    }


}
