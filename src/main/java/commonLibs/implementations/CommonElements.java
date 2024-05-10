package commonLibs.implementations;

public class CommonElements extends iCommonElements {

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
        action.click
}
