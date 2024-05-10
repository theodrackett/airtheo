package commonLibs.implementations;

import org.openqa.selenium.support.ui.Select;

import commonLibs.interfaces.iDropdowns;

public class DropdownControls implements iDropdowns {

    private Select getDropdown(org.openqa.selenium.WebElement element) {
        Select select = new Select(element);
        return select;
    }

    @Override
    public void selectViaVisibleText(org.openqa.selenium.WebElement element, String visibleText) throws Exception {

        getDropdown(element).selectByVisibleText(visibleText);

    }

    @Override
    public void selectViaValue(org.openqa.selenium.WebElement element, String value) throws Exception {

        getDropdown(element).selectByValue(value);

    }

    @Override
    public void selectViaIndex(org.openqa.selenium.WebElement element, int index) throws Exception {

        getDropdown(element).selectByIndex(index);
    }

    @Override
    public java.util.List<org.openqa.selenium.WebElement> getAllOptions(org.openqa.selenium.WebElement element)
            throws Exception {

        return getDropdown(element).getOptions();
    }

    @Override
    public java.util.List<org.openqa.selenium.WebElement> getAllSelectedOptions(org.openqa.selenium.WebElement element)
            throws Exception {

        return getDropdown(element).getAllSelectedOptions();
    }

    @Override
    public org.openqa.selenium.WebElement getFirstSelectedOption(org.openqa.selenium.WebElement element)
            throws Exception {

        return getDropdown(element).getFirstSelectedOption();
    }

    @Override
    public boolean isMultiple(org.openqa.selenium.WebElement element) throws Exception {

        return getDropdown(element).isMultiple();
    }

    @Override
    public void deselectViaVisibleText(org.openqa.selenium.WebElement element, String visibleText) throws Exception {

        getDropdown(element).deselectByVisibleText(visibleText);

    }

    @Override
    public void deselectViaValue(org.openqa.selenium.WebElement element, String value) throws Exception {

        getDropdown(element).deselectByValue(value);

    }

    @Override
    public void deselectViaIndex(org.openqa.selenium.WebElement element, int index) throws Exception {

        getDropdown(element).deselectByIndex(index);

    }

    @Override
    public void deselectAll(org.openqa.selenium.WebElement element) throws Exception {

        getDropdown(element).deselectAll();

    }

}
