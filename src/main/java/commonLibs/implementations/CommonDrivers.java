package commonLibs.implementations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import commonLibs.interfaces.iDriver;

public class CommonDrivers implements iDriver {

    private WebDriver driver;
    private static String currentWorkingDir;

    public static WebDriver getDriver(String browser) {
        WebDriver driver;
        currentWorkingDir = System.getProperty("user.dir");

        switch (browser.toLowerCase()) {
            case "chrome":
                // Path to the ChromeDriver
                System.setProperty("webdriver.chrome.driver", currentWorkingDir + "/drivers/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                // Chrome specific options
                driver = new ChromeDriver(chromeOptions);
                break;
            case "edge":
                // Path to the EdgeDriver
                System.setProperty("webdriver.edge.driver", currentWorkingDir + "/drivers/msedgedriver");
                EdgeOptions edgeOptions = new EdgeOptions();
                // Edge specific options
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" not supported.");
        }

        return driver;
    }

    public CommonDrivers(String browserType) throws Exception {
        driver = getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Override
    public void navigateToFirstUrl(String url) throws Exception {
        url = url.trim();
        driver.get(url);
    }

    @Override
    public String getTitle() throws Exception {
        return driver.getTitle();
    }

    @Override
    public String getCurrentUrl() throws Exception {
        return driver.getCurrentUrl();
    }

    @Override
    public String getPageSource() throws Exception {
        return driver.getPageSource();
    }

    @Override
    public void navigateToUrl(String url) throws Exception {
        url = url.trim();
        driver.navigate().to(url);
    }

    @Override
    public void navigateForward() throws Exception {
        driver.navigate().forward();
    }

    @Override
    public void navigateBackward() throws Exception {
        driver.navigate().back();
    }

    @Override
    public void refresh() throws Exception {
        driver.navigate().refresh();
    }

    @Override
    public void closeBrowser() throws Exception {
        driver.close();
    }

    @Override
    public void closeAllBrowsers() throws Exception {
        driver.quit();
    }
}
