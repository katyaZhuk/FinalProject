package utils.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PhotoHelper {

    static Properties props = new Properties();

    public static String getEmployeePhotoPath () throws IOException {
        props.load(new FileInputStream("src/main/resources/employeePhoto/photo_path.properties"));
        return props.getProperty("path");
    }
}
