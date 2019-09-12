package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HomePage extends ParentPage {


    public HomePage(WebDriver webDriver) {
        super(webDriver, "/") ;
    }

    WebElement singIn = webDriver.findElement(By.xpath(".//li[@id='auth']"));
    WebElement inputLogin = webDriver.findElement(By.id("login"));
    WebElement inputPass = webDriver.findElement(By.id("password"));
    WebElement submit = webDriver.findElement(By.xpath(".//div/button[@class='btn btn-outline-warning px-5']"));

    public void openPage() {
        try {
            webDriver.get("https://www.ua-football.com/");
            logger.info("LoginPage was opened");
        } catch (Exception e) {
            logger.error("Can't open LoginPage");
            Assert.fail("Can't open LoginPage");
        }
    }

    public void clickSignIn() {
        actionWithOurElements.clickOnElement(singIn);
    }


    public void inputLogin(String login) {
        actionWithOurElements.enterTextIntoInput(inputLogin, login);

    }

    public void inputPassword(String password) {
       actionWithOurElements.enterTextIntoInput(inputPass, password );
    }

    public void clickSubmit() {
        actionWithOurElements.clickOnElement(submit);
    }

    public boolean userIsExisted() {
        Actions action = new Actions(webDriver);
        WebElement user = webDriver.findElement(By.xpath(".//li[@class='icon-auth myprofil pos-r dropdown']"));
        action.moveToElement(user).perform();
        WebElement userSettings = webDriver.findElement(By.xpath(".//a[@class='user-menu-link fz-12'] [1]"));
        //  userSettings.click();
        //     WebElement name = webDriver.findElement(By.xpath(".//h3[text()='Fanat2019']"));
        return userSettings.isEnabled();
    }


    public void clickUser() {
        try {
            Actions action = new Actions(webDriver);
            WebElement user = webDriver.findElement(By.xpath(".//*[@class='o-icon'][1]"));

        } catch (Exception e) {

        }
 /*     WebElement userSettings = webDriver.findElement(By.xpath(".//div[@class='flex-grow-1 d-flex']"));
        action.moveToElement(user).build().perform();
        action.moveToElement(userSettings).build().perform();
        userSettings.click();*/

    }

}
