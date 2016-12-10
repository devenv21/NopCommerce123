package Group3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dev on 23/11/2016.
 */
public class Electronics extends DriverManager {

    @FindBy(xpath= "html/body/div[5]/div[2]/ul[1]/li[2]/a")
    private WebElement _electronics;

    public void electronics1()
    {
        Utility.click(_electronics);
    }

}
