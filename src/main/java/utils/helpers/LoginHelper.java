package utils.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginHelper {

    static Properties props = new Properties();

    private static void loadFile() throws IOException {
        props.load(new FileInputStream("src/main/resources/clientData/login_user.properties"));
    }

    public static String getUsername() throws IOException {
        loadFile();
        return props.getProperty("login.username");
    }

    public static String getPassword() throws IOException {
        loadFile();
        return props.getProperty("login.password");
    }

    public static String getURL() throws IOException {
        loadFile();
        return props.getProperty("URL");
    }
}
