package Group3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static Group3.Utility.click;

/**
 * Created by Dev on 23/11/2016.
 */
public class LeicaTMirrorlessDigitalCamera extends DriverManager {

    @FindBy(xpath = "//a[contains(text(),'Leica T Mirrorless Digital Camera')]")
    private WebElement _leicaTMirrorlessDigitalCamera;

    @FindBy(id="add-to-cart-button-16")
    private WebElement _addToCartOnLeicaTMirrorlessDCamera;

    @FindBy(xpath = "//div[@id='bar-notification']/p")
    private WebElement _2ndProductAddedConfirmation;

    @FindBy(xpath = "//div[@id='bar-notification']/span")
    private WebElement _closemessagebtn;

    @FindBy(xpath = "//li[@id='topcartlink']/a/span")
    private WebElement _addedProductCart;

    public void LeicaTMirrorlessDigitalCamera1() throws InterruptedException {
        click( _leicaTMirrorlessDigitalCamera );
        click( _addToCartOnLeicaTMirrorlessDCamera );
        Assert.assertEquals( _2ndProductAddedConfirmation.getText(),"The product has been added to your shopping cart","Product can not be added to cart" );
        System.out.println("2nd Product added successfully");
        Thread.sleep( 3000 );
        click( _closemessagebtn );
        Thread.sleep( 3000 );
        click( _addedProductCart );
        System.out.println("2 products added to cart - passed");
    }
}
