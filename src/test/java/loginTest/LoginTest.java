package loginTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void loginTest() {
        //set ChromeDriver and path to file
        System.setProperty("webdriver.chrome.driver", "F://Automation/uafootball/src/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        Actions action = new Actions(webDriver);


        //for opening window of browser in maximum size
        webDriver.manage().window().maximize();
        //for waiting before each action
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        webDriver.get("https://ua-football.com");

        WebElement singIn = webDriver.findElement(By.id("authBtn"));
        singIn.click();

        WebElement loginField = webDriver.findElement(By.id("login"));
        loginField.clear();
        loginField.sendKeys("Fanat2019");

        WebElement passField = webDriver.findElement(By.id("password"));
        passField.clear();
        passField.sendKeys("Fanat2019");

        WebElement politics = webDriver.findElement(By.xpath("//span[@class='btn btn-primary']"));
        politics.click();

        WebElement submitSingIn = webDriver.findElement(By.xpath(".//div[@class=\'d-flex justify-content-around align-items-center\'] //button[@type=\'submit\']"));
        submitSingIn.click();

        action.moveToElement(singIn);
        Assert.assertTrue("Avatar is not present", webDriver.findElement(By.xpath(".//div[text()='Fanat2019']")).isDisplayed());

    }




}
