package MercuryTravelPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonLibs.implementations.MouseOperationControls;

public class MercuryTravelHomePage {

    private static WebElement customerLogin;
    private static MouseOperationControls mouseOperationControls;

    public MercuryTravelHomePage(WebDriver driver) {
        customerLogin = driver.findElement(By.className("dropdown-toggle"));
        // customerLogin = driver.findElement(By.linkText(" Customer Login "));

        mouseOperationControls = new MouseOperationControls(driver);
    }

    public void loginUser() throws Exception {
        mouseOperationControls.moveToElement(customerLogin);
    }

}
