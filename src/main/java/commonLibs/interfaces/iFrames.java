package commonLibs.interfaces;

import org.openqa.selenium.WebElement;

public interface iFrames {

    public void switchToFrame(int index) throws Exception;

    public void switchToFrame(String frameId) throws Exception;

    public void switchToFrame(WebElement element) throws Exception;

    public void switchToParentPage() throws Exception;

}
