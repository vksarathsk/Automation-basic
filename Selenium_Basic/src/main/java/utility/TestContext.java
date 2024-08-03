package utility;

import java.io.IOException;

public class TestContext {

    public AmazonBase amazonBase;
    public PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
        amazonBase = new AmazonBase();
        pageObjectManager = new PageObjectManager(amazonBase.getDriver());
    }

}
