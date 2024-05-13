package commonLibs.implementations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import commonLibs.interfaces.iMouseOperations;

public class MouseOperationControls implements iMouseOperations {

    private Actions action;

    public MouseOperationControls(WebDriver driver) {
        action = new Actions(driver);
    }

    @Override
    public void click() throws Exception {
        action.click().build().perform();
    }

    @Override
    public void rightClick() throws Exception {
        action.contextClick().build().perform();
    }

    @Override
    public void doubleClick() throws Exception {
        action.doubleClick().build().perform();
    }

    @Override
    public void moveToElement(WebElement element) throws Exception {
        action.moveToElement(element).build().perform();
    }

    @Override
    public void dragAndDrop() throws Exception {
        action.dragAndDrop(null, null).build().perform();
    }

    @Override
    public void dragAndDropByOffset(int xOffset, int yOffset) throws Exception {
        action.dragAndDropBy(null, xOffset, yOffset).build().perform();
    }

    @Override
    public void contextClick() throws Exception {
        action.contextClick().build().perform();
    }

}
