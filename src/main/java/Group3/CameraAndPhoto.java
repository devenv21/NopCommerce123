package Group3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Group3.Utility.click;

/**
 * Created by Dev on 23/11/2016.
 */
public class CameraAndPhoto extends  DriverManager{

    @FindBy(css = "a[title=\"Show products in category Camera & photo\"]")
    private WebElement _showCameraProducts;

    public void cameraAndPhoto1()
    {
        click(_showCameraProducts);
    }
}
