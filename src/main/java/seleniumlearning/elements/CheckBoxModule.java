package seleniumlearning.elements;

import org.openqa.selenium.WebDriver;

public class CheckBoxModule {
    WebDriver driver;

    public CheckBoxModule(WebDriver driver){

        this.driver = driver;

    }

    public void navigation(){
        this.driver.get("https://demoqa.com/checkbox");
    }
}
