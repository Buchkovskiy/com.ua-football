package loginTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void loginTest() {
        //set ChromeDriver and path to file
        System.setProperty("webdriver.chrome.driver", "F://Automation/uafootball/src/drivers/chromedriver_0711.exe");
        WebDriver webDriver = new ChromeDriver();

        //for opening window of browser in maximum size
        webDriver.manage().window().maximize();
        //for waiting before each action
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        webDriver.get("https://ua-football.com");

        //click on signIn button
        WebElement singIn = webDriver.findElement(By.id("authBtn"));
        singIn.click();

        //input login to "Login" field
        WebElement loginField = webDriver.findElement(By.id("login"));
        loginField.clear();
        loginField.sendKeys("Fanat2019");

        //input password to "Password" field
        WebElement passField = webDriver.findElement(By.id("password"));
        passField.clear();
        passField.sendKeys("Fanat2019");

        WebElement submitButton = webDriver.findElement(By.xpath(".//div[@class='d-flex justify-content-around align-items-center'] /button[@type='submit']"));
        submitButton.click();

       //move to singIn
        Actions actions = new Actions(webDriver);
        actions.moveToElement(singIn).build().perform();

/*      WebElement singInDropbox = webDriver.findElement(By.xpath(".//li[@class='d-flex align-items-center p-3']"));
        FluentWait<WebDriver> wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(singInDropbox));*/

        //check that we loginned on site
        Assert.assertTrue("Fanat2019 is not enabled", webDriver.findElement(By.xpath(".//div[text()='Fanat2019']")).isEnabled());

        //close browser, if i used method .close - we close only tab, no browser!
        webDriver.close();



    }




}
