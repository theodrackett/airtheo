package commonLibs.implementations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonLibs.interfaces.iFrames;

public class FrameControls implements iFrames {

    private WebDriver driver;

    public FrameControls(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void switchToFrame(int index) throws Exception {
        driver.switchTo().frame(index);
    }

    @Override
    public void switchToFrame(String frameId) throws Exception {
        driver.switchTo().frame(frameId);
    }

    @Override
    public void switchToFrame(WebElement element) throws Exception {
        driver.switchTo().frame(element);
    }

    @Override
    public void switchToParentPage() throws Exception {
        driver.switchTo().defaultContent();
    }

}
