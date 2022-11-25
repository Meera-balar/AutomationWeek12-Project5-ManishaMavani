package utilites;

import browserfactory.BaseTest;
import org.openqa.selenium.By;

public class Utility extends BaseTest {

    //method declaration for find element and click on element
    public void clickElement(By by){
        driver.findElement(by).click();
    }
    //method declaration to send data to field
    public void sendText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    //method declaration to get text
    public String getText(By by){
        return driver.findElement(by).getText();
    }

}
