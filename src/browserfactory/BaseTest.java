package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    //Global variable declaration
    public static WebDriver driver;

    //method declaration for opening browser
    public void openBrowser(String baseUrl){
        //setup key-value for Chrome browser
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        //object creation for chromedriver class
        driver = new ChromeDriver();
        //get url using get method
        driver.get(baseUrl);
        //maximize window
        driver.manage().window().maximize();
        //implicit time given to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    //method declaration for closing browser
    public void closeBrowser(){
        driver.quit();
    }
}
