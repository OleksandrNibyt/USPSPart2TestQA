package pages;

import static org.openqa.selenium.support.PageFactory.initElements;
import static support.TestContext.getDriver;

public class Page {
    protected String url;

    public Page() {
        initElements(getDriver(), this);
    }

    public void open(){
        getDriver().get(url);
    }
}
