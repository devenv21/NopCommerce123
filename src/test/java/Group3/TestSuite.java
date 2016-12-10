package Group3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Dev on 22/11/2016.
 */

public class TestSuite extends DriverManager {

   @BeforeTest

    public static void open()
    {
        openBrowser();
    }


//    @AfterTest
//
//    public static void close()
//    {
//        closeBrowser();
//    }


    @Test

    public static void registration2()
    {
        Registration registration = new Registration();
        registration.login();

    }


    @Test

    public static void electronics2()
    {
        Electronics electronics = new Electronics();
        electronics.electronics1();
    }


    @Test

    public static void cameraAndPhoto2()
    {
        Electronics electronics= new Electronics();
        electronics.electronics1();
        CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
        cameraAndPhoto.cameraAndPhoto1();
    }

    @Test

    public static void nikonD55002() throws InterruptedException
    {
        Electronics electronics = new Electronics();
        electronics.electronics1();
        CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
        cameraAndPhoto.cameraAndPhoto1();
        NikonD5500 nikonD5500= new NikonD5500();
        nikonD5500.nikonD55001();
    }

    @Test

    public static void leicaTMirrorlessDigitalCamera2() throws InterruptedException
    {
        Electronics electronics = new Electronics();
        electronics.electronics1();
        CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
        cameraAndPhoto.cameraAndPhoto1();
        NikonD5500 nikonD5500 = new NikonD5500();
        nikonD5500.nikonD55001();
        LeicaTMirrorlessDigitalCamera leicaTMirrorlessDigitalCamera=new LeicaTMirrorlessDigitalCamera();
        leicaTMirrorlessDigitalCamera.LeicaTMirrorlessDigitalCamera1();
    }

    @Test

    public static void shoppingCart2() throws InterruptedException {

        Registration registration = new Registration();
        registration.login();
        Electronics electronics = new Electronics();
        electronics.electronics1();
        CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
        cameraAndPhoto.cameraAndPhoto1();
        NikonD5500 nikonD5500 = new NikonD5500();
        nikonD5500.nikonD55001();
        LeicaTMirrorlessDigitalCamera leicaTMirrorlessDigitalCamera= new LeicaTMirrorlessDigitalCamera();
        leicaTMirrorlessDigitalCamera.LeicaTMirrorlessDigitalCamera1();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.shoppingCart1();
    }

    @Test

    public static void onePageCheckout2() throws InterruptedException {
        Registration registration = new Registration();
        registration.login();
        Electronics electronics = new Electronics();
        electronics.electronics1();
        CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
        cameraAndPhoto.cameraAndPhoto1();
        NikonD5500 nikonD5500 = new NikonD5500();
        nikonD5500.nikonD55001();
        LeicaTMirrorlessDigitalCamera leicaTMirrorlessDigitalCamera= new LeicaTMirrorlessDigitalCamera();
        leicaTMirrorlessDigitalCamera.LeicaTMirrorlessDigitalCamera1();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.shoppingCart1();
        OnePageCheckout onePageCheckout = new OnePageCheckout();
        onePageCheckout.onePageCheckout1();
    }

}
