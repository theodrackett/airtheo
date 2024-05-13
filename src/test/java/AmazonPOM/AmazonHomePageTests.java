package AmazonPOM;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import commonLibs.implementations.CommonDrivers;

public class AmazonHomePageTests {

    static CommonDrivers commonDriver;
    static AmazonHomePage amazonHomePage;

    static String url = "https://www.amazon.in/";

    static WebDriver driver;

    @BeforeClass
    public static void invokeBrowser() throws Exception {
        commonDriver = new CommonDrivers("chrome");
        // commonDriver.setPageLoadTimeout(30);
        // commonDriver.setElementDetectionTimeout(5);

        driver = CommonDrivers.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        commonDriver.navigateToUrl(url);
        commonDriver.closeBrowser();

        amazonHomePage = new AmazonHomePage(driver);

    }

    @Test
    public void searchProduct() throws Exception {
        AmazonHomePage.searchProduct("Laptop", "Electronics");

    }

    @AfterClass
    public static void closeBrowser() throws Exception {
        commonDriver.closeAllBrowsers();
    }
}
