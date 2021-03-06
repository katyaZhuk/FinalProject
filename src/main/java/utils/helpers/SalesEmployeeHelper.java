package utils.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SalesEmployeeHelper {

    static Properties props = new Properties();

    private static void loadFile() throws IOException {
        props.load(new FileInputStream("src/main/resources/clientData/sales_employee.properties"));
    }

    public static String getSalesSubUnit() throws IOException {
        loadFile();
        return "  " + props.getProperty("sales.sub_unit"); // Workaround to handle two &nbsp; characters
    }

    public static String getSalesFirstName() throws IOException {
        loadFile();
        return props.getProperty("sales.first_name");
    }

    public static String getSalesLastName() throws IOException {
        loadFile();
        return props.getProperty("sales.last_name");
    }

    public static String getSalesId() throws IOException {
        loadFile();
        return props.getProperty("sales.id");
    }

    public static String getSalesMaritalStatus() throws IOException {
        loadFile();
        return props.getProperty("sales.marital_status");
    }

    public static String getSalesNationality() throws IOException {
        loadFile();
        return props.getProperty("sales.nationality");
    }

    public static String getSalesDateOfBirth() throws IOException {
        loadFile();
        return props.getProperty("sales.date_of_birth");
    }


}
