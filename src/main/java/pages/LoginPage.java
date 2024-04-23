package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By navigateToLogin = By.xpath("//*[@id=\"html-body\"]/div[3]/header/div/div[2]/ul/li[1]/a");
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("send2");
    private By createButton = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[3]/div[2]/div[2]/div/div/a");
    private By forgotButton = By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/div[2]/a/span");
    private By email2Field = By.id("email_address");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setEmail2(String email2){
        driver.findElement(email2Field).sendKeys(email2);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
    public SecureAreaPage createAcountButton(){
        driver.findElement(createButton).click();
        return new SecureAreaPage(driver);
    }
    public SecureAreaPage forgotPassword(){
        driver.findElement(forgotButton).click();
        return new SecureAreaPage(driver);
    }
}
