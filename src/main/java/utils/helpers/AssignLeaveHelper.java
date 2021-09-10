package utils.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AssignLeaveHelper {

    static Properties props = new Properties();

    private static void loadFile() throws IOException {
        props.load(new FileInputStream("src/main/resources/clientData/assign_leave.properties"));
    }

    public static String getAssignLeaveEmployeeName() throws IOException {
        loadFile();
        return props.getProperty("assign.employee_name");
    }

    public static String getAssignLeaveType() throws IOException {
        loadFile();
        return props.getProperty("assign.leave_type");
    }

    public static String getAssignLeaveFromDate() throws IOException {
        loadFile();
        return props.getProperty("assign.from_date");
    }

    public static String getAssignLeaveToDate() throws IOException {
        loadFile();
        return props.getProperty("assign.to_date");
    }

    public static String getAssignLeaveDates() throws IOException {
        loadFile();
        return props.getProperty("assign.from_date") + " to " + props.getProperty("assign.to_date");
    }

}
