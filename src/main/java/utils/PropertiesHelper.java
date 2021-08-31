package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {

    static Properties props = new Properties();

    public static String getUsername() throws IOException {
        props.load(new FileInputStream("src/main/resources/user.properties"));
        return props.getProperty("username");
    }

    public static String getPassword() throws IOException {
        props.load(new FileReader("src/main/resources/user.properties"));
        return props.getProperty("password");
    }

    public static String getURL () throws IOException {
        props.load(new FileReader("src/main/resources/user.properties"));
        return props.getProperty("URL");
    }
}
