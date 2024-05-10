package commonLibs.interfaces;

public interface iFrames {

    public void switchToFrame(int index) throws Exception;

    public void switchToFrame(String frameId) throws Exception;

    public void switchToFrame(org.openqa.selenium.WebElement element) throws Exception;

    public void switchToParentPage() throws Exception;

}
