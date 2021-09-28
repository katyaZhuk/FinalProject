package utils.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class MyInfoPage {

    private final SelenideElement EMPLOYEE_PHOTO_LINK = $("#empPic");
    private final SelenideElement SELECT_PHOTO_FILE_BUTTON = $("#photofile");
    private final SelenideElement UPLOAD_BUTTON = $("#btnSave");
    private final SelenideElement SUCCESS_MESSAGE = $(".message.success.fadable");

    public void clickEmployeePhotoLink() {
        EMPLOYEE_PHOTO_LINK.click();
        Log.info("Employee photo link is clicked on");
    }

    public void selectPhotoFile(String path) {
        SELECT_PHOTO_FILE_BUTTON.uploadFile(new File(path));
        Log.info("New photo is selected");
    }

    public void clickUploadButton() {
        UPLOAD_BUTTON.click();
        Log.info("Upload button is clicked on to change employee photo");
    }

    public SelenideElement getSuccessMessage() {
        if (SUCCESS_MESSAGE.isDisplayed()) {
            Log.info("Photo is uploaded successfully");
        } else {
            Log.info("Photo is not uploaded");
        }
        return SUCCESS_MESSAGE;
    }
}
