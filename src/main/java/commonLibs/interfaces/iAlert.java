package commonLibs.interfaces;

public interface iAlert {

    public void acceptAlert() throws Exception;

    public void rejectAlert() throws Exception;

    public String getMessageFromAlert() throws Exception;

    public boolean checkAlertPresent(int timeoutInSeconds) throws Exception;

    public void enterTextInAlert(String textToEnter) throws Exception;

    public void switchToAlert() throws Exception;

}
