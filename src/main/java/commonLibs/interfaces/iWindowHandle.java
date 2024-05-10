package commonLibs.interfaces;

import java.util.Set;

public interface iWindowHandle {

    public void switchToChildWindow() throws Exception;

    public void switchToParentWindow() throws Exception;

    public void switchToWindow(int childWindowIndex) throws Exception;

    public String getWindowHandle() throws Exception;

    public Set<String> getWindowHandles() throws Exception;

    public void closeAllOtherWindows(String parentWindowHandle) throws Exception;

    public void closeAllOtherWindows() throws Exception;

    public void closeChildWindow() throws Exception;

    public void closeAll() throws Exception;

    public void closeParentWindow() throws Exception;

    public void closeWindow(String windowHandle) throws Exception;

    public void closeAllWindows(Set<String> windowHandles) throws Exception;

    public void closeAllWindows() throws Exception;

    public void closeWindow(int childWindowIndex) throws Exception;

    public void closeWindow() throws Exception;

    public void closeAllWindowsExceptParent() throws Exception;

}
