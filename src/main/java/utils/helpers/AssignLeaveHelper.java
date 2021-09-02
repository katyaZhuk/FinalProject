package utils.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AssignLeaveHelper {

    static Properties props = new Properties();

    public static String getAssignLeaveEmployeeName() throws IOException {
        props.load(new FileInputStream("src/main/resources/assign_leave.properties"));
        return props.getProperty("assign.employee_name");
    }

    public static String getAssignLeaveType() throws IOException {
        props.load(new FileInputStream("src/main/resources/assign_leave.properties"));
        return props.getProperty("assign.leave_type");
    }

    public static String getAssignLeaveFromDate() throws IOException {
        props.load(new FileInputStream("src/main/resources/assign_leave.properties"));
        return props.getProperty("assign.from_date");
    }

    public static String getAssignLeaveToDate() throws IOException {
        props.load(new FileInputStream("src/main/resources/assign_leave.properties"));
        return props.getProperty("assign.to_date");
    }

}
