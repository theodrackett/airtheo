package commonLibs.interfaces;

import org.openqa.selenium.WebElement;

public interface iDropdowns {

    public void selectViaVisibleText(org.openqa.selenium.WebElement element, String visibleText) throws Exception;

    public void selectViaValue(org.openqa.selenium.WebElement element, String value) throws Exception;

    public void selectViaIndex(org.openqa.selenium.WebElement element, int index) throws Exception;

    public java.util.List<org.openqa.selenium.WebElement> getAllOptions(org.openqa.selenium.WebElement element)
            throws Exception;

    public java.util.List<org.openqa.selenium.WebElement> getAllSelectedOptions(org.openqa.selenium.WebElement element)
            throws Exception;

    public org.openqa.selenium.WebElement getFirstSelectedOption(org.openqa.selenium.WebElement element)
            throws Exception;

    public boolean isMultiple(org.openqa.selenium.WebElement element) throws Exception;

    public void deselectViaVisibleText(org.openqa.selenium.WebElement element, String visibleText) throws Exception;

    public void deselectViaValue(org.openqa.selenium.WebElement element, String value) throws Exception;

    public void deselectViaIndex(org.openqa.selenium.WebElement element, int index) throws Exception;

    public void deselectAll(org.openqa.selenium.WebElement element) throws Exception;

}
