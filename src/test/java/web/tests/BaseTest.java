package web.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import web.helpers.DriverConfig;

public class BaseTest {

    @BeforeAll
    static void setUp() {
        DriverConfig.configure();
    }

    @AfterEach
    public void cleanUp() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWebDriver();
    }
}
