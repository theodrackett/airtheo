package commonLibs.implementations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonLibs.interfaces.iCommonElements;

public class CommonElements implements iCommonElements {

    private org.openqa.selenium.WebDriver driver;

    @Override
    public String getText(WebElement element) throws Exception {

        return element.getText();
    }

    @Override
    public void click(WebElement element) throws Exception {

        element.click();
    }

    @Override
    public String getAttribute(WebElement element, String attribute) throws Exception {

        return element.getAttribute(attribute);
    }

    @Override
    public String getCssValue(WebElement element, String cssPropertyName) throws Exception {

        return element.getCssValue(cssPropertyName);
    }

    @Override
    public boolean isElementEnabled(WebElement element) throws Exception {

        return element.isEnabled();
    }

    @Override
    public boolean isElementVisible(WebElement element) throws Exception {

        return element.isDisplayed();
    }

    @Override
    public boolean isElementSelected(WebElement element) throws Exception {

        return element.isSelected();
    }

    @Override
    public void setText(WebElement element, String textToWrite) throws Exception {

        element.sendKeys(textToWrite);
    }

    @Override
    public void clearText(WebElement element) throws Exception {

        element.clear();
    }

    @Override
    public void changeCheckboxStatus(WebElement element, boolean desiredStatus) throws Exception {

        if (element.isSelected() != desiredStatus) {
            element.click();
        }
    }

    @Override
    public String getTagName(WebElement element) throws Exception {

        return element.getTagName();
    }

    @Override
    public String getReferenceOfElement(WebElement element) throws Exception {

        return element.toString();
    }

    @Override
    public void mouseOver(WebElement element) throws Exception {

        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    @Override
    public void dragAndDrop(WebElement source, WebElement target) throws Exception {

        Actions action = new Actions(driver);
        action.dragAndDrop(source, target).build().perform();
    }

    @Override
    public void performMouseRightClick(WebElement element) throws Exception {

        Actions action = new Actions(driver);
        action.contextClick(element).build().perform();
    }

    @Override
    public void performMouseDoubleClick(WebElement element) throws Exception {

        Actions action = new Actions(driver);
        action.doubleClick(element).build().perform();
    }

    @Override
    public void performMouseClickAndHold(WebElement element) throws Exception {

        Actions action = new Actions(driver);
        action.clickAndHold(element).build().perform();
    }

    @Override
    public void performMouseRelease(WebElement element) throws Exception {

        Actions action = new Actions(driver);
        action.release(element).build().perform();
    }

    @Override
    public void performKeyboardOperation(WebElement element, CharSequence keyToPress) throws Exception {

        Actions action = new Actions(driver);
        action.sendKeys(element, keyToPress).build().perform();
    }

    @Override
    public void performAction(WebElement element, CharSequence keyToPress) throws Exception {

        Actions action = new Actions(driver);
        action.sendKeys(element, keyToPress).build().perform();
    }

    @Override
    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2) throws Exception {

        Actions action = new Actions(driver);
        action.sendKeys(element, keyToPress1, keyToPress2).build().perform();
    }

    @Override
    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3) throws Exception {

        Actions action = new Actions(driver);
        action.sendKeys(element, keyToPress1, keyToPress2, keyToPress3).build().perform();

    }

    @Override
    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3, CharSequence keyToPress4) throws Exception {

        Actions action = new Actions(driver);
        action.sendKeys(element, keyToPress1, keyToPress2, keyToPress3, keyToPress4).build().perform();
    }

    @Override
    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3, CharSequence keyToPress4, CharSequence keyToPress5) throws Exception {

        Actions action = new Actions(driver);
        action.sendKeys(element, keyToPress1, keyToPress2, keyToPress3, keyToPress4, keyToPress5).build().perform();
    }

    @Override
    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3, CharSequence keyToPress4, CharSequence keyToPress5, CharSequence keyToPress6)
            throws Exception {

        Actions action = new Actions(driver);
        action.sendKeys(element, keyToPress1, keyToPress2, keyToPress3, keyToPress4, keyToPress5, keyToPress6).build()
                .perform();
    }

    @Override
    public void performAction(WebElement element, CharSequence keyToPress1, CharSequence keyToPress2,
            CharSequence keyToPress3, CharSequence keyToPress4, CharSequence keyToPress5, CharSequence keyToPress6,
            CharSequence keyToPress7) throws Exception {

        Actions action = new Actions(driver);
        action.sendKeys(element, keyToPress1, keyToPress2, keyToPress3, keyToPress4, keyToPress5, keyToPress6,
                keyToPress7).build().perform();
    }

    @Override
    public int getCoordinateX(WebElement element) throws Exception {

        return element.getLocation().getX();
    }

    @Override
    public int getCoordinateY(WebElement element) throws Exception {

        return element.getLocation().getY();
    }

    @Override
    public int getElementWidth(WebElement element) throws Exception {

        return element.getSize().getWidth();
    }

    @Override
    public int getElementHeight(WebElement element) throws Exception {

        return element.getSize().getHeight();
    }

}
