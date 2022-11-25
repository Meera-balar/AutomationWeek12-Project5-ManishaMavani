package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilites.Utility;

import javax.swing.*;

public class LoginTest  extends Utility {
    //url stored into baseUrl
    String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setUpBrowser(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Click on Sign In button
        clickElement(By.xpath("//li[@class = 'header__nav-item header__nav-sign-in']/a"));
        String expectedText = "Welcome Back!";
        String actualText = getText(By.xpath("//h1[text() = 'Welcome Back!']"));
        //Validate actual and expected message
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyTheErrorMessage(){
        //Click on Sign In button
        clickElement(By.xpath("//li[@class = 'header__nav-item header__nav-sign-in']/a"));
        //enter Invalid email
        sendText(By.xpath("//input[@id = 'user[email]']"),"abc@gmail.com");
        //enter Invalid password
        sendText(By.xpath("//input[@id = 'user[password]']"),"12345");
        clickElement(By.xpath("//input[@type = 'submit']"));
        String expectedMessage = "Invalid email or password.";
        String actualMessage = getText(By.xpath("//li[text() = 'Invalid email or password.']"));
        //Validate actual and expected message
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){
        //This method close the web browser
       closeBrowser();
    }
}
