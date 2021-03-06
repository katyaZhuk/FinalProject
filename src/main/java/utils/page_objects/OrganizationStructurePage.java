package utils.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Log;

import static com.codeborne.selenide.Selenide.*;

public class OrganizationStructurePage {

    private final SelenideElement EDIT_BUTTON = $("#btnEdit");
    private final ElementsCollection SALES_AND_MARKETING_COLLECTION = $$("li[id=node_7] ul li");
    private final SelenideElement ADD_NEW_DEPARTMENT_BUTTON = $("#treeLink_addChild_7");
    private final SelenideElement NAME_FIELD = $("#txtName");
    private final SelenideElement SAVE_BUTTON = $("#btnSave");
    private final SelenideElement DONE_BUTTON = $("#btnEdit");
    private static final String DELETE_NEW_DEPARTMENT_BUTTON = ".deleteButton";
    private final SelenideElement CONFIRM_DELETE_BUTTON = $("#dialogYes");

    public void clickEditOrganizationStructureButton() {
        EDIT_BUTTON.click();
        Log.info("Edit button is clicked on to edit organization structure");
    }

    public void addNewDepartment() {
        ADD_NEW_DEPARTMENT_BUTTON.click();
        Log.info("Add button is clicked on to add new department to organization structure");
    }

    public void enterDepartmentName(String department) {
        NAME_FIELD.sendKeys(department);
        Log.info("Department name " + department + " is entered to name field");
    }

    public void clickSaveDepartmentButton() {
        SAVE_BUTTON.click();
        Log.info("Save button is clicked on to add new department to organization structure");
    }

    public void clickDoneButton() {
        DONE_BUTTON.click();
        Log.info("Done button is clicked on to finish editing organization structure");
    }

    public void deleteNewDepartment() {
        SALES_AND_MARKETING_COLLECTION.last().$(DELETE_NEW_DEPARTMENT_BUTTON).click();
        Log.info("Delete button is clicked on to delete new department");
    }

    public void confirmDeleteNewDepartment() {
        CONFIRM_DELETE_BUTTON.click();
        Log.info("Confirm delete button is clicked on to delete new department");
    }

    public ElementsCollection getSalesAndMarketingCollection() {
        return SALES_AND_MARKETING_COLLECTION;
    }

}
