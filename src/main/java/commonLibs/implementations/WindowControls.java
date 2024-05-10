package commonLibs.implementations;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import commonLibs.interfaces.iWindowHandle;

public class WindowControls implements iWindowHandle {

    private WebDriver driver;

    public WindowControls(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void switchToChildWindow() throws Exception {

        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    @Override
    public void switchToParentWindow() throws Exception {

        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (window.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    @Override
    public void switchToWindow(int childWindowIndex) throws Exception {

        Set<String> allWindows = driver.getWindowHandles();

        int counter = 0;

        for (String window : allWindows) {
            if (counter == childWindowIndex) {
                driver.switchTo().window(window);
                break;
            }
            counter++;
        }
    }

    @Override
    public String getWindowHandle() throws Exception {

        return driver.getWindowHandle();
    }

    @Override
    public Set<String> getWindowHandles() throws Exception {

        return driver.getWindowHandles();
    }

    @Override
    public void closeAllOtherWindows(String parentWindowHandle) throws Exception {

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equalsIgnoreCase(parentWindowHandle)) {
                driver.switchTo().window(window);
                driver.close();
            }
        }

        driver.switchTo().window(parentWindowHandle);
    }

    @Override
    public void closeAllOtherWindows() throws Exception {

        String parentWindow = driver.getWindowHandle();

        closeAllOtherWindows(parentWindow);
    }

    @Override
    public void closeChildWindow() throws Exception {

        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(window);
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);
    }

    @Override
    public void closeAll() throws Exception {

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            driver.switchTo().window(window);
            driver.close();
        }
    }

    @Override
    public void closeParentWindow() throws Exception {

        String parentWindow = driver.getWindowHandle();

        driver.close();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    @Override
    public void closeWindow(String windowHandle) throws Exception {

        driver.switchTo().window(windowHandle);

        driver.close();
    }

    @Override
    public void closeAllWindows(Set<String> windowHandles) throws Exception {

        for (String window : windowHandles) {
            driver.switchTo().window(window);
            driver.close();
        }
    }

    @Override
    public void closeAllWindows() throws Exception {

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            driver.switchTo().window(window);
            driver.close();
        }
    }

    @Override
    public void closeWindow(int childWindowIndex) throws Exception {

        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        int counter = 0;

        for (String window : allWindows) {
            if (counter == childWindowIndex) {
                driver.switchTo().window(window);
                driver.close();
                break;
            }
            counter++;
        }

        driver.switchTo().window(parentWindow);
    }

    @Override
    public void closeWindow() throws Exception {

        String parentWindow = driver.getWindowHandle();

        driver.close();

        driver.switchTo().window(parentWindow);
    }

    @Override
    public void closeAllWindowsExceptParent() throws Exception {

        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(window);
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);
    }

}
