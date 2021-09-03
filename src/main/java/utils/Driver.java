package utils;

import com.codeborne.selenide.Configuration;

public class Driver {

    public static void getMaximizedWindow() {
        Log.info("Maximized window is opened");
        Configuration.startMaximized = true;
    }
}
