package commonLibs.implementations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonLibs.interfaces.iDropdowns;

public class DropdownControls implements iDropdowns {

    private Select getDropdown(WebElement element) {
        Select select = new Select(element);
        return select;
    }

    @Override
    public void selectViaVisibleText(WebElement element, String visibleText) throws Exception {

        getDropdown(element).selectByVisibleText(visibleText);

    }

    @Override
    public void selectViaValue(WebElement element, String value) throws Exception {

        getDropdown(element).selectByValue(value);

    }

    @Override
    public void selectViaIndex(WebElement element, int index) throws Exception {

        getDropdown(element).selectByIndex(index);
    }

    @Override
    public java.util.List<WebElement> getAllOptions(WebElement element)
            throws Exception {

        return getDropdown(element).getOptions();
    }

    @Override
    public java.util.List<WebElement> getAllSelectedOptions(WebElement element)
            throws Exception {

        return getDropdown(element).getAllSelectedOptions();
    }

    @Override
    public WebElement getFirstSelectedOption(WebElement element)
            throws Exception {

        return getDropdown(element).getFirstSelectedOption();
    }

    @Override
    public boolean isMultiple(WebElement element) throws Exception {

        return getDropdown(element).isMultiple();
    }

    @Override
    public void deselectViaVisibleText(WebElement element, String visibleText) throws Exception {

        getDropdown(element).deselectByVisibleText(visibleText);

    }

    @Override
    public void deselectViaValue(WebElement element, String value) throws Exception {

        getDropdown(element).deselectByValue(value);

    }

    @Override
    public void deselectViaIndex(WebElement element, int index) throws Exception {

        getDropdown(element).deselectByIndex(index);

    }

    @Override
    public void deselectAll(WebElement element) throws Exception {

        getDropdown(element).deselectAll();

    }

}
