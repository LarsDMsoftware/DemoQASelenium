package seleniumlearning.alerts_frames_windows;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumlearning.elements.WebTablesModule;

public class AlertsModuleTests {

    public static AlertsModule page;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        page = new AlertsModule(driver);
    }

    @Test
    public void testAlertBtn(){

    }
}
