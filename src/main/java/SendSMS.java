import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SendSMS {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO Reno4 Pro 5G");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        dc.setCapability(MobileCapabilityType.APP,"messages");
        dc.setCapability("appPackage", "com.google.android.apps.messaging");
        dc.setCapability("appActivity", "com.google.android.apps.messaging.main.MainActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");



        AppiumDriver driver = new AppiumDriver(url,dc);
       // driver.sendSMS("+32472291675", "Message from Appium");
        //driver.sendSMS("0494701656", "Hi");
        driver.getRemoteAddress();
    }
}
