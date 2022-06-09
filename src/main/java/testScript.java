import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class testScript
{
    public static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "9e1d0deb");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //capabilities.setCapability("appPackage", "com.whatsapp");
        //capabilities.setCapability("appActivity", "com.whatsapp.Main");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.sendSMS("+32472291675", "Message from Appium");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}