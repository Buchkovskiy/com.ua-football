package pages;

import libs.ActionWithOurElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

abstract public class ParentPage {

    WebDriver webDriver;
    Logger logger =  Logger.getLogger(getClass());
    ActionWithOurElements actionWithOurElements;
    final String BASE_URL = "https://www.ua-football.com/";
    String expectedURL;

    public ParentPage(WebDriver webDriver, String part_URL) {
        this.webDriver = webDriver;
        actionWithOurElements = new ActionWithOurElements(webDriver);
        expectedURL = BASE_URL + part_URL;
    }

    public void checkCurrentUrl(){
        try{
            Assert.assertEquals("URL is not expected", expectedURL, webDriver.getCurrentUrl());
        }catch (Exception e){
            logger.error("Can not get URL"+e);
            Assert.fail("Can not get URL");
        }
    }
}
