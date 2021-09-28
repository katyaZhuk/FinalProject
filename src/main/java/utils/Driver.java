package utils;

import com.codeborne.selenide.Configuration;

public class Driver {

    public void getMaximizedWindow() {
        Log.info("Maximized window is opened");
        Configuration.startMaximized = true;
    }
}
