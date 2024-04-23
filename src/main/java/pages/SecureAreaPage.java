package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By statusAlert = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div/div");

    public SecureAreaPage(WebDriver driver){this.driver = driver; }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
