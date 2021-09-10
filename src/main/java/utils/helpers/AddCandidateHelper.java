package utils.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AddCandidateHelper {

    static Properties props = new Properties();

    private static void loadFile() throws IOException {
        props.load(new FileInputStream("src/main/resources/clientData/add_candidate.properties"));
    }

    public static String getCandidateFirstName() throws IOException {
        loadFile();
        return props.getProperty("candidate.first_name");
    }

    public static String getCandidateLastName() throws IOException {
        loadFile();
        return props.getProperty("candidate.last_name");
    }

    public static String getCandidateEmail() throws IOException {
        loadFile();
        return props.getProperty("candidate.email");
    }

    public static String getCandidateContactNo() throws IOException {
        loadFile();
        return props.getProperty("candidate.contact_no");
    }

    public static String getCandidateJobVacancy() throws IOException {
        loadFile();
        return props.getProperty("candidate.job_vacancy");
    }

    public static String getCandidateResume() throws IOException {
        loadFile();
        return props.getProperty("candidate.resume");
    }

    public static String getCandidateApplicationDate() throws IOException {
        loadFile();
        return props.getProperty("candidate.application_date");
    }


}
