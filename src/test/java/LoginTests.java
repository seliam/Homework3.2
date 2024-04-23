import org.testng.annotations.Test;
import org.openqa.selenium.By;

import pages.*;

import static constants.AssertionMessages.message;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTest{
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.navigateToLogin();
        loginPage.setEmail("selia_mardirosi@edu.aua.am");
        loginPage.setPassword("SuperSecretpass$");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains(message));
    }
    @Test
    public void createAcoount(){
        LoginPage loginPage = homePage.navigateToLogin();
        SecureAreaPage secureAreaPage = loginPage.createAcountButton();
    }
    @Test
    public void forgotPassword(){
        LoginPage loginPage = homePage.navigateToLogin();
        SecureAreaPage secureAreaPage = loginPage.forgotPassword();
        loginPage.setEmail2("selia_mardirosi@edu.aua.am");

    }



    @Test
    public void wrongtest1(){
        LoginPage loginPage = homePage.navigateToLogin();
        loginPage.setEmail("selia_mardirosi@edu.aua.am");
        loginPage.setPassword("SuperSecretpass");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
    }
    @Test
    public void wrongTest2(){
        LoginPage loginPage = homePage.navigateToLogin();
        loginPage.setEmail("seliamardirosi@gmail.com");
        loginPage.setPassword("SuperSecretpass$");
    }

}
