package Group3;

import org.openqa.selenium.WebElement;

/**
 * Created by Dev on 22/11/2016.
 */
public class Utility extends DriverManager{

    public static void typeText(WebElement element,String text)
    {
        element.clear();
        element.sendKeys(text);
    }

    public static void click(WebElement element)
    {
        element.click();
    }

    public static void getText(WebElement element)
    {
        element.getText();
    }




//    public static void select(WebElement element)
//    {
//        element.isSelected();
//        Select s = new Select(  );
//    }
}
