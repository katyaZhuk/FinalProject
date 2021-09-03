package utils.helpers;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoginHelper {

    static Properties props = new Properties();

    public static String getUsername() throws IOException {
        props.load(new FileInputStream("src/main/resources/login_user.properties"));
        return props.getProperty("login.username");
    }

    public static String getPassword() throws IOException {
        props.load(new FileReader("src/main/resources/login_user.properties"));
        return props.getProperty("login.password");
    }

    public static String getURL() throws IOException {
        props.load(new FileReader("src/main/resources/login_user.properties"));
        return props.getProperty("URL");
    }
}
