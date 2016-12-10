package Group3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Group3.Utility.click;

/**
 * Created by Dev on 23/11/2016.
 */
public class ShoppingCart extends DriverManager  {


    @FindBy(id = "termsofservice")
    private WebElement _termOfService;

    @FindBy(id = "checkout")
    private WebElement _checkout;

//    @FindBy(className = "title")
//    private WebElement _billingaddress;   //onepage checkout

    public void shoppingCart1()
    {
        click( _termOfService );
        click( _checkout );
//        Assert.assertEquals(_billingaddress.getText(),"Billing address","Failed at Billing Address");  //onepage
//        System.out.println("Passed and at Billing Address");
    }
}
