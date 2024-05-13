package MercuryTravelPOM;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import commonLibs.implementations.CommonDrivers;

public class MercuryTravelHomePageTests {

    static CommonDrivers commonDriver;
    static MercuryTravelHomePage mercuryTravelHomePage;

    static String url = "https://www.mercurytravels.co.in/";

    static WebDriver driver;

    @BeforeClass
    public static void invokeBrowser() throws Exception {
        commonDriver = new CommonDrivers("chrome");
        // commonDriver.setPageLoadTimeout(30);
        // commonDriver.setElementDetectionTimeout(5);

        driver = CommonDrivers.getDriver("chrome");
        commonDriver.navigateToFirstUrl(url);
        mercuryTravelHomePage = new MercuryTravelHomePage(driver);

    }

    @Test
    public void loginUser() throws Exception {
        mercuryTravelHomePage.loginUser();

    }

    @AfterClass
    public static void closeBrowser() throws Exception {
        // commonDriver.closeAllBrowsers();
    }
}
