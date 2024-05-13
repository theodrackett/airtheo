package commonLibs.interfaces;

import org.openqa.selenium.WebElement;

public interface iMouseOperations {

    public void click() throws Exception;

    public void rightClick() throws Exception;

    public void doubleClick() throws Exception;

    public void moveToElement(WebElement element) throws Exception;

    public void dragAndDrop() throws Exception;

    public void dragAndDropByOffset(int xOffset, int yOffset) throws Exception;

    public void contextClick() throws Exception;

}
