package commonLibs.interfaces;

import org.openqa.selenium.WebElement;

public interface iDropdowns {

        public void selectViaVisibleText(WebElement element, String visibleText) throws Exception;

        public void selectViaValue(WebElement element, String value) throws Exception;

        public void selectViaIndex(WebElement element, int index) throws Exception;

        public java.util.List<WebElement> getAllOptions(WebElement element)
                        throws Exception;

        public java.util.List<WebElement> getAllSelectedOptions(WebElement element)
                        throws Exception;

        public WebElement getFirstSelectedOption(WebElement element)
                        throws Exception;

        public boolean isMultiple(WebElement element) throws Exception;

        public void deselectViaVisibleText(WebElement element, String visibleText) throws Exception;

        public void deselectViaValue(WebElement element, String value) throws Exception;

        public void deselectViaIndex(WebElement element, int index) throws Exception;

        public void deselectAll(WebElement element) throws Exception;

}
