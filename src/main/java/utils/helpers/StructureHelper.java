package utils.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class StructureHelper {

    static Properties props = new Properties();

    public static String getNewDepartment() throws IOException {
        props.load(new FileInputStream("src/main/resources/structure.properties"));
        return props.getProperty("department");
    }

}
