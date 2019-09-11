package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HomePage extends ParentPage{



    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    WebElement singIn = webDriver.findElement(By.xpath(".//li[@id='auth']"));
    WebElement inputLogin = webDriver.findElement(By.id("login"));
    WebElement inputPass = webDriver.findElement(By.id("password"));

    public void openPage(){
        try {
            webDriver.get("https://www.ua-football.com/");
            logger.info("LoginPage was opened");
        } catch (Exception e){
            logger.error("Can't open LoginPage");
            Assert.fail("Can't open LoginPage");
        }
    }

    public void clickSignIn() {
        try {
            WebElement singIn = webDriver.findElement(By.xpath(".//li[@id='auth']"));
            singIn.click();
            logger.info("\"SignIn\" button was clicked");
        } catch (Exception e){
            logger.info("Can't click to element");
            Assert.fail("Can't click to element");
        }
    }


    public void inputLogin(String login) {
    /*    try {
            WebElement inputLogin = webDriver.findElement(By.id("login"));
            inputLogin.clear();
            inputLogin.sendKeys(login);
            logger.info(login+"was inputted to \"Login\" field");
        } catch (Exception e){
            logger.error("Can't input login");
            Assert.fail("Can't input login");
        }*/

    actionWithOurElements.enterTextIntoInput(inputLogin,login);

    }

    public void inputPassword(String password) {
        try {
            WebElement inputPass = webDriver.findElement(By.id("password"));
            inputPass.clear();
            inputPass.sendKeys(password);
            logger.info(password+"was inputted to \"Password\" field");
        } catch (Exception e){
            logger.error("Can't input password");
            Assert.fail("Can't input password");
        }
    }

    public void clickSubmit() {
        WebElement submit = webDriver.findElement(By.xpath(".//div/button[@class='btn btn-outline-warning px-5']"));
        try {
            submit.click();
            logger.info("\"Submit\" button was clicked");
        } catch (Exception e){
            logger.error("Can't click to \"Submit\" button");
            Assert.fail("Can't click to \"Submit\" button");
        }
    }

    public boolean userIsExisted(){
        Actions action = new Actions(webDriver);
        WebElement user = webDriver.findElement(By.xpath(".//li[@class='icon-auth myprofil pos-r dropdown']"));
        action.moveToElement(user).perform();
        WebElement userSettings = webDriver.findElement(By.xpath(".//a[@class='user-menu-link fz-12'] [1]"));
      //  userSettings.click();
   //     WebElement name = webDriver.findElement(By.xpath(".//h3[text()='Fanat2019']"));
        return userSettings.isEnabled();
    }


    public void clickUser()  {
        try {
            Actions action = new Actions(webDriver);
            WebElement user = webDriver.findElement(By.xpath(".//*[@class='o-icon'][1]"));

        } catch (Exception e){

        }
 /*     WebElement userSettings = webDriver.findElement(By.xpath(".//div[@class='flex-grow-1 d-flex']"));
        action.moveToElement(user).build().perform();
        action.moveToElement(userSettings).build().perform();
        userSettings.click();*/

    }

}
