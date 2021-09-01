package utils.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JobTitleHelper {

    static Properties props = new Properties();

    public static List<String> getJobTitlesList() throws IOException {
        List<String> jobTitlesList = new ArrayList<>();

        props.load(new FileInputStream("src/main/resources/job_titles.properties"));
        jobTitlesList.add(props.getProperty("job_title1"));
        jobTitlesList.add(props.getProperty("job_title2"));
        jobTitlesList.add(props.getProperty("job_title3"));

        return jobTitlesList;
    }


}
