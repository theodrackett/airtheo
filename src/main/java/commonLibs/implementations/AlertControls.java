package commonLibs.implementations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import commonLibs.interfaces.iAlert;

public class AlertControls implements iAlert {

    private WebDriver driver;

    public AlertControls(WebDriver driver) {
        this.driver = driver;
    }

    private Alert getAlert() {
        return driver.switchTo().alert();
    }

    @Override
    public void acceptAlert() throws Exception {

        getAlert().accept();

    }

    @Override
    public void rejectAlert() throws Exception {

        getAlert().dismiss();

    }

    @Override
    public String getMessageFromAlert() throws Exception {

        return getAlert().getText();
    }

    @Override
    public boolean checkAlertPresent(int timeoutInSeconds) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void enterTextInAlert(String textToEnter) throws Exception {

        getAlert().sendKeys(textToEnter);
    }

    @Override
    public void switchToAlert() throws Exception {

        driver.switchTo().alert();

    }

}
