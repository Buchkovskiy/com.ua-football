package pages;

import libs.ActionWithOurElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

abstract public class ParentPage {

    WebDriver webDriver;
    Logger logger =  Logger.getLogger(getClass());
    ActionWithOurElements actionWithOurElements;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        actionWithOurElements = new ActionWithOurElements(webDriver);
    }
}
