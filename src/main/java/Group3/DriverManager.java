package Group3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dev on 22/11/2016.
 */

public class DriverManager {

    private static WebDriver driver;

    public DriverManager()
    {
        PageFactory.initElements(driver,this);
    }

    public static void openBrowser()
    {
        String browser="internet explorer";
        if (browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dev\\IdeaProjects\\GuruLogin\\src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver=new ChromeDriver();

        }else if(browser.equalsIgnoreCase( "internet explorer" ))
        {
            System.setProperty("webdriver.ie.driver","C:\\Users\\Dev\\Documents\\Testing\\Testing Software\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
            driver.manage().window().maximize();
        } else
        {
            driver = new FirefoxDriver();

        }
//        DriverManager.driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
    }

    public static void closeBrowser()
    {
        driver.close();
    }

}

