package commonLibs.implementations;

import commonLibs.interfaces.iJavaScriptOperations;

public class JavaScriptControls implements iJavaScriptOperations {

    @Override
    public void executeJavaScript(String scriptToExecute) throws Exception {

        executeJavaScript(scriptToExecute);

    }

    @Override
    public void scrollDown(int x, int y) throws Exception {

        String script = String.format("window.scrollBy(%d, %d)", x, y);

        executeJavaScript(script);
    }

    @Override
    public void executeAsyncJavaScript(String scriptToExecute) throws Exception {

        executeJavaScript(scriptToExecute);
    }

}
