package commonLibs.interfaces;

import org.openqa.selenium.WebElement;

public interface iCommonElements {

    public String getText(WebElement element) throws Exception;

    public void click(WebElement element) throws Exception;

    public String getAttribute(WebElement element, String attribute) throws Exception;

    public String getCssValue(WebElement element, String cssPropertyName) throws Exception;

    public boolean isElementEnabled(WebElement element) throws Exception;

    public boolean isElementVisible(WebElement element) throws Exception;

    public boolean isElementSelected(WebElement element) throws Exception;

    public void setText(WebElement element, String textToWrite) throws Exception;

    public void clearText(WebElement element) throws Exception;

    public void changeCheckboxStatus(WebElement element, boolean desiredStatus) throws Exception;

    public String getTagName(WebElement element) throws Exception;

    public String getReferenceOfElement(WebElement element) throws Exception;

    public void mouseOver(WebElement element) throws Exception;

    public void dragAndDrop(WebElement source, WebElement target) throws Exception;

    public void performMouseRightClick(WebElement element) throws Exception;

    public void performMouseDoubleClick(WebElement element) throws Exception;

    public void performMouseClickAndHold(WebElement element) throws Exception;

    public void performMouseRelease(WebElement element) throws Exception;

    public void performKeyboardOperation(WebElement element, CharSequence keyToPress) throws Exception;

    public void performAction(WebElement element, CharSequence keyToPress) throws Exception;

    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2) throws Exception;

    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3) throws Exception;

    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3, CharSequence keyToPress4) throws Exception;

    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3, CharSequence keyToPress4, CharSequence keyToPress5) throws Exception;

    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3, CharSequence keyToPress4, CharSequence keyToPress5, CharSequence keyToPress6)
            throws Exception;

    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3, CharSequence keyToPress4, CharSequence keyToPress5, CharSequence keyToPress6,
            CharSequence keyToPress7) throws Exception;

    public int getCoordinateX(WebElement element) throws Exception;

    public int getCoordinateY(WebElement element) throws Exception;

    public int getElementWidth(WebElement element) throws Exception;

    public int getElementHeight(WebElement element) throws Exception;
}
