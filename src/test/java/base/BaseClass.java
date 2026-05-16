package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }
}