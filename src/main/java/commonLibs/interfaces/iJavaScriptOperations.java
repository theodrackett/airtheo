package commonLibs.interfaces;

public interface iJavaScriptOperations {

    public void executeJavaScript(String scriptToExecute) throws Exception;

    public void scrollDown(int x, int y) throws Exception;

    public void executeAsyncJavaScript(String scriptToExecute) throws Exception;

}
