package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends ParentPage{

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }



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
        try {
            WebElement inputLogin = webDriver.findElement(By.id("login"));
            inputLogin.clear();
            inputLogin.sendKeys(login);
            logger.info(login+"was inputted to \"Login\" field");
        } catch (Exception e){
            logger.error("Can't input login");
            Assert.fail("Can't input login");
        }
    }

    public void inputPassword(String password) {
        try {
            WebElement inputLogin = webDriver.findElement(By.id("password"));
            inputLogin.clear();
            inputLogin.sendKeys(password);
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




}
