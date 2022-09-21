package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static constant.LoginConstant.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public LoginPage(){methods = new Methods();}
    public void controlEmailPage() throws InterruptedException {
        assertTrue(methods.isElementVisible(ACCOUNTTEXT_CONTROL, 20));
        Thread.sleep(2000);
        assertTrue(methods.isElementVisible(LOGIN_BUTTON,20));
        Thread.sleep(2000);
        assertTrue(methods.isElementVisible(GOOGLELOGIN_BUTTON,20));
        Thread.sleep(2000);
    }
    public void loginGoogle() throws InterruptedException{
        methods.clickElement(GOOGLELOGIN_BUTTON);
        Thread.sleep(2000);
    }
    public void controlGooglePage()throws InterruptedException{
        assertTrue(methods.isElementVisible(GOOGLE_EMAIL, 20));
        Thread.sleep(2000);
        assertTrue(methods.isElementVisible(GOOGLE_EMAIL_NEXT, 20));
        Thread.sleep(2000);
    }
    public void loginGooglePage() throws InterruptedException{
        WebElement sendText = driver.findElement(GOOGLE_EMAIL);
        sendText.sendKeys(EMAIL);
        methods.clickElement(GOOGLE_EMAIL_NEXT);
        System.out.println("Email girildi");
        Thread.sleep(2000);
    }
    public void loginPassword()throws InterruptedException{
        assertTrue(methods.isElementVisible(GOOGLE_PASSWORD_NEXT, 20));
        Thread.sleep(2000);
        assertTrue(methods.isElementVisible(GOOGLE_PASSWORD, 20));
        Thread.sleep(2000);
    }
    public void controlLoginPassword()throws InterruptedException{
        WebElement passwordText = driver.findElement(GOOGLE_PASSWORD);
        passwordText.sendKeys(PASSWORD);
        methods.clickElement(GOOGLE_PASSWORD_NEXT);
        System.out.println("Şifre girildi");
        Thread.sleep(2000);
    }
}
