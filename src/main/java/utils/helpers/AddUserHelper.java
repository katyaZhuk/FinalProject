package utils.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AddUserHelper {

    static Properties props = new Properties();

    public static String getESSUserRole() throws IOException {
        props.load(new FileInputStream("src/main/resources/add_user.properties"));
        return props.getProperty("user.user_role");
    }

    public static String getEmployeeName() throws IOException {
        props.load(new FileInputStream("src/main/resources/add_user.properties"));
        return props.getProperty("user.employee_name");
    }

    public static String getNewUsername() throws IOException {
        props.load(new FileInputStream("src/main/resources/add_user.properties"));
        return props.getProperty("user.username");
    }

    public static String getEnabledStatus() throws IOException {
        props.load(new FileInputStream("src/main/resources/add_user.properties"));
        return props.getProperty("user.status");
    }

    public static String getNewUserPassword() throws IOException {
        props.load(new FileInputStream("src/main/resources/add_user.properties"));
        return props.getProperty("user.password");
    }

    public static String getNewUserConfirmPassword() throws IOException {
        props.load(new FileInputStream("src/main/resources/add_user.properties"));
        return props.getProperty("user.confirm_password");
    }

}
