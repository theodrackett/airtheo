package commonLibs.implementations;

import org.openqa.selenium.TakesScreenshot;

import commonLibs.interfaces.iScreenshots;

public class ScreenshotControls implements iScreenshots {

    TakesScreenshot camera;

    public ScreenshotControls(TakesScreenshot driver) {
        camera = driver;
    }

    @Override
    public void captureAndSaveScreenshot(String filename) throws Exception {

        camera.getScreenshotAs(org.openqa.selenium.OutputType.FILE).renameTo(new java.io.File(filename));

    }

    @Override
    public void captureAndSaveEntirePageScreenshot(String filename) throws Exception {

        captureAndSaveScreenshot(filename);
    }

    @Override
    public void captureAndSaveElementScreenshot(String filename) throws Exception {

        captureAndSaveScreenshot(filename);

    }

    @Override
    public void captureAndSaveDesktopScreenshot(String filename) throws Exception {

        captureAndSaveScreenshot(filename);

    }

    @Override
    public String captureAndReturnScreenshot() throws Exception {

        return captureAndReturnScreenshot();
    }

    @Override
    public String captureAndReturnEntirePageScreenshot() throws Exception {

        return captureAndReturnScreenshot();
    }

    @Override
    public String captureAndReturnElementScreenshot() throws Exception {

        return captureAndReturnScreenshot();
    }

    @Override
    public String captureAndReturnDesktopScreenshot() throws Exception {

        return captureAndReturnScreenshot();
    }

}
