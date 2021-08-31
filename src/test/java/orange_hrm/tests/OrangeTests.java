package orange_hrm.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;

import java.io.IOException;

import static orange_hrm.page_objects.DashboardPage.*;
import static orange_hrm.page_objects.LoginPage.*;
import static utils.Driver.getMaximizedWindow;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrangeTests {

    @BeforeAll
    public void setUp() {
        getMaximizedWindow();
    }

//    @BeforeEach
    @Test
    public void loginTest() throws IOException {
        openLoginPage();
        login();
        getDashboardPageTitle().shouldBe(Condition.visible);
    }
}
