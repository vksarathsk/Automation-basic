package utility;

public class TestContext {

    public AmazonBase amazonBase;
    public PageObjectManager pageObjectManager;

    public TestContext(){
        amazonBase = new AmazonBase();
        pageObjectManager = new PageObjectManager(amazonBase.getDriver());
    }

}
