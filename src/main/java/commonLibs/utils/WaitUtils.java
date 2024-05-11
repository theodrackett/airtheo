package commonLibs.utils;

import org.openqa.selenium.WebElement;

public class WaitUtils {

    private long timeout;

    public WaitUtils() {
        timeout = 30;
    }

    public WaitUtils(long timeout) {
        this.timeout = timeout;
    }

    public void setImplicitWait(long timeOut) {
        // Set the implicit wait for the driver
    }

    public void setImplicitWait(long timeOut, long sleepTime) {
        // Set the implicit wait for the driver
    }

    public void waitForElementVisibility(WebElement element) throws Exception {
        // Wait for the element to be visible
    }

    public void waitForElementVisibility(WebElement element, long timeOut) throws Exception {
        // Wait for the element to be visible
    }

    public void waitForElementVisibility(WebElement element, long timeOut, long sleepTime) throws Exception {
        // Wait for the element to be visible
    }

    public void waitForElementClickability(WebElement element) throws Exception {
        // Wait for the element to be clickable
    }

    public void waitForElementClickability(WebElement element, long timeOut) throws Exception {
        // Wait for the element to be clickable
    }

    public void waitForElementClickability(WebElement element, long timeOut, long sleepTime) throws Exception {
        // Wait for the element to be clickable
    }

    public void waitForAlertPresence() throws Exception {
        // Wait for the alert to be present
    }

    public void waitForAlertPresence(long timeOut) throws Exception {
        // Wait for the alert to be present
    }

    public void waitForAlertPresence(long timeOut, long sleepTime) throws Exception {
        // Wait for the alert to be present
    }

    public void waitForTitle(String title) throws Exception {
        // Wait for the title to be present
    }

    public void waitForTitle(String title, long timeOut) throws Exception {
        // Wait for the title to be present
    }

    public void waitForTitle(String title, long timeOut, long sleepTime) throws Exception {
        // Wait for the title to be present
    }

    public void waitForPageLoad() throws Exception {
        // Wait for the page to load
    }

    public void waitForPageLoad(long timeOut) throws Exception {
        // Wait for the page to load
    }

    public void waitForPageLoad(long timeOut, long sleepTime) throws Exception {
        // Wait for the page to load
    }

    public void waitForInvisibilityOfElement(WebElement element) throws Exception {
        // Wait for the element to be invisible
    }

}
