package web.automation.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class BrowserConfiguration {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void openBrowser(String browserType) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver_mac");

        if (browserType.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--enable-precise-memory-info");
            options.addArguments("--disable-default-apps");
            options.addArguments("test-type=browser");
            driver = new ChromeDriver(options);
        }
    }
}
