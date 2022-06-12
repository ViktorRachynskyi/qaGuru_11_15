package web.config;

import org.aeonbits.owner.ConfigFactory;

public class WebDriverProvider {

    public static WebDriverConfig config = ConfigFactory
            .create(WebDriverConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() { return !config.remoteUrl().equals("");}
}
