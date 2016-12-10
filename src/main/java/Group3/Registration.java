package Group3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Group3.Utility.click;
import static Group3.Utility.typeText;

/**
 * Created by Dev on 22/11/2016.
 */
public class Registration extends DriverManager{


        @FindBy(className = "ico-register")
        private WebElement regButton;

        @FindBy(name = "FirstName")
        private WebElement _firstName;

        @FindBy(name = "LastName")
        private WebElement _lastName;

        @FindBy(name = "Email")
        private WebElement _email;

        @FindBy(name = "Password")
        private WebElement _password;

        @FindBy(name = "ConfirmPassword")
        private WebElement _confirmPassword;

        @FindBy(name = "register-button")
        private WebElement _registerButton;

        @FindBy(className = "result" )
        private WebElement _registerConfirmation;

        @FindBy(name = "register-continue")
        private WebElement _continuebtn;

    public static String randomDate(){
        DateFormat format = new SimpleDateFormat("HHmmss");
                return format.format(new Date());
    }

    public void login()
    {
        click(regButton);
        typeText(_firstName,"Deven");
        Utility.typeText(_lastName,"Varma");
        typeText(_email,"devenvarma21"+randomDate()+"@gmail.com");
        typeText(_password,"Testing123");
        Utility.typeText(_confirmPassword,"Testing123");
        Utility.click(_registerButton);

//        Assert.assertEquals( _registerConfirmation.getText(),"Your registration completed","Failed" );
        System.out.println("Registation Completed");

        click(_continuebtn);
    }


}
