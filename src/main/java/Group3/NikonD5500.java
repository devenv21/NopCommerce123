package Group3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static Group3.Utility.click;

/**
 * Created by Dev on 23/11/2016.
 */
public class NikonD5500 extends DriverManager{
    @FindBy(xpath= "//a[contains(text(),'Nikon D5500 DSLR')]")
    private WebElement _nikonD5500;

    @FindBy(id="add-to-cart-button-14")
    private WebElement _addToCart;

    @FindBy(xpath ="//div[@id='bar-notification']/p")
    private WebElement _productAddedConfirmation;

    @FindBy(className = "close")
    private WebElement _closeBtnAfterFirstProductAdded;

    @FindBy(xpath = "//li[3]/span/a/span")
    private WebElement _cameraAndPhoto;

    public void nikonD55001() throws InterruptedException {
        click( _nikonD5500 );
        click( _addToCart );

        Assert.assertEquals( _productAddedConfirmation.getText(),"The product has been added to your shopping cart","Product can not be added to cart" );
        System.out.println("Product added successfully");

        click(_closeBtnAfterFirstProductAdded  );

        Thread.sleep( 3000 );
        Utility.click( _cameraAndPhoto );
    }
}
