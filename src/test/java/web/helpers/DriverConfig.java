package web.helpers;

import com.codeborne.selenide.Configuration;
import web.config.WebDriverProvider;

public class DriverConfig {

    public static void configure() {

        Configuration.browser = WebDriverProvider.config.browser();
        Configuration.browserVersion = WebDriverProvider.config.browserVersion();

        if (WebDriverProvider.isRemoteWebDriver()) {
            Configuration.remote = WebDriverProvider.config.remoteUrl();
        }
    }
}
