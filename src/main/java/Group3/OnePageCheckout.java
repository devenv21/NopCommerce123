package Group3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static Group3.Utility.click;
import static Group3.Utility.typeText;

/**
 * Created by Dev on 23/11/2016.
 */
public class OnePageCheckout extends DriverManager  {

        @FindBy(id = "BillingNewAddress_CountryId")
        private WebElement _billingNewAddressCountry;

    @FindBy(id = "BillingNewAddress_City")
    private WebElement _billingNewAddressCity;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement _billingNewAddress1;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement _postcode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement _phoneNumber;

//    @FindBy(id = "BillingNewAddress_CountryId")
//    private WebElement _billingNewAddressCountry;

    @FindBy(css = "input.button-1.new-address-next-step-button")
    private WebElement _checkoutContinuebtn1;

    @FindBy(css = "input.button-1.shipping-method-next-step-button")
    private WebElement _checkoutContinuebtn2;

    @FindBy(id = "paymentmethod_1")
    private WebElement _creditCardSelected;

    @FindBy(css = "input.button-1.payment-method-next-step-button")
    private WebElement _checkoutContinuebtn3;

    @FindBy(id = "CardholderName")
    private WebElement _cardHolderName;

    @FindBy(id = "CardNumber")
    private WebElement _cardNumber;

    @FindBy(xpath = "//tr[4]/td[2]/select")
    private WebElement _expireMonth;

    @FindBy(id = "ExpireYear")
    private WebElement _expireYear;

    @FindBy(id = "CardCode")
    private WebElement _cardCode;

    @FindBy(css = "input.button-1.payment-info-next-step-button")
    private WebElement _paymentInfoNextStepbtn;

    @FindBy(css = "input.button-1.confirm-order-next-step-button")
    private WebElement _confirmOrderNextbtn;

    @FindBy(xpath = "/descendant::strong[contains(text(),'Your order has been successfully processed!')]")
    private WebElement _finalOrderConfirmation;


    public void onePageCheckout1() throws InterruptedException {


        Select s = new Select( _billingNewAddressCountry);
        s.selectByValue("82");
        System.out.println("UK Selected");
        typeText(_billingNewAddressCity,"Crawley");
        typeText( _billingNewAddress1,"The George" );
        typeText( _postcode,"RH10 1BS" );
        typeText( _phoneNumber,"012345678" );

//        Select s = new Select( _billingNewAddressCountry);
//        s.deselectByIndex(82);

        click( _checkoutContinuebtn1 );//prob
        Thread.sleep( 2000 );
        click(_checkoutContinuebtn2 );
        click( _creditCardSelected );
        click(_checkoutContinuebtn3 );
        typeText( _cardHolderName,"KYLE JOHNSON" );
        typeText( _cardNumber,"4485897155058469" );
        Select s1= new Select(_expireMonth);
//        click( _expireMonth );
        s1.selectByIndex(06);
        click( _expireYear );
        Select s2= new Select( _expireYear );
        s2.selectByVisibleText("2017");
        typeText( _cardCode,"582" );
       Thread.sleep( 2000 );

        click( _paymentInfoNextStepbtn );
        Thread.sleep( 2000 );
        click(_confirmOrderNextbtn);
        Thread.sleep( 3000 );
        Assert.assertEquals( _finalOrderConfirmation.getText(),"Your order has been successfully processed!","Order has not been placed" );
        System.out.println("Order had been placed Successfully");

    }
}
