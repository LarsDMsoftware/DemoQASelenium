package seleniumlearning.practiceform;


import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class practiceFormPage {
    WebDriver driver;

    public practiceFormPage(WebDriver driver){

        this.driver = driver;
        
    }

    public void firstNameField(String input){
        this.driver.findElement(By.id("firstName")).sendKeys(input);
    }
}
