package utils.page_objects;

import com.codeborne.selenide.SelenideElement;
import utils.Log;

import java.io.File;
import java.util.Optional;

import static com.codeborne.selenide.Selenide.$;

public class MyInfoPage {

    private static final SelenideElement EMPLOYEE_PHOTO_LINK = $("#empPic");
    private static final SelenideElement SELECT_PHOTO_FILE_BUTTON = $("#photofile");
    private static final SelenideElement UPLOAD_BUTTON = $("#btnSave");
    private static final SelenideElement SUCCESS_MESSAGE = $(".message.success.fadable");

    public static void clickEmployeePhotoLink() {
        EMPLOYEE_PHOTO_LINK.click();
        Log.info("Employee photo link is clicked on");
    }

    public static void selectPhotoFile(String path) {
        SELECT_PHOTO_FILE_BUTTON.uploadFile(new File(path));
        Log.info("New photo is selected");
    }

    public static void clickUploadButton() {
        UPLOAD_BUTTON.click();
        Log.info("Upload button is clicked on to change employee photo");
    }

    public static SelenideElement getSuccessMessage() {
        Optional.of(SUCCESS_MESSAGE).ifPresent(
                x -> Log.info("Photo is uploaded successfully")
        );
        return SUCCESS_MESSAGE;
    }
}
