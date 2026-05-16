<<<<<<< HEAD
package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

    public static WebDriver driver;

    public void openBrowser() {
        driver = new ChromeDriver();

//        ChromeOptions options = new ChromeOptions();

//        driver = new ChromeDriver(options);
//
//
//        // Required for Jenkins/Docker/Linux
//        options.addArguments("--headless=new");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--remote-allow-origins=*");
//
//        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }
=======
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
>>>>>>> e4b4921050dfc5277d5fa1bb29368567ccfeb962
}