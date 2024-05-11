package commonLibs.interfaces;

public interface iScreenshots {

    public void captureAndSaveScreenshot(String filename) throws Exception;

    public void captureAndSaveEntirePageScreenshot(String filename) throws Exception;

    public void captureAndSaveElementScreenshot(String filename) throws Exception;

    public void captureAndSaveDesktopScreenshot(String filename) throws Exception;

    public String captureAndReturnScreenshot() throws Exception;

    public String captureAndReturnEntirePageScreenshot() throws Exception;

    public String captureAndReturnElementScreenshot() throws Exception;

    public String captureAndReturnDesktopScreenshot() throws Exception;

}
