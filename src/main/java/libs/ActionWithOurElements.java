package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionWithOurElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public ActionWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterTextIntoInput(WebElement element, String string ){
        try{
            element.clear();
            element.sendKeys(string);
            logger.info(string+" was inputed into field");
        } catch (Exception e){
            logger.error("Can't input "+string);
            Assert.fail("Can't input "+string);
        }
    }


}
