package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.locators.navigateToLogin;

public class HomePage {
    private final WebDriver driver;
    private By button = By.xpath("//*[@id=\"html-body\"]/div[3]/header/div/div[2]/ul/li[1]/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage navigateToLogin(){
        WebDriverWait webDriverWait= new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(button))).click();
        return new LoginPage(driver);
    }
}
