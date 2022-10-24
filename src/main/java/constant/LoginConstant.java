package constant;

import org.openqa.selenium.By;

public class LoginConstant {

    public static final String EMAIL = "";
    public static final String PASSWORD = "";

    public static final By ACCOUNTTEXT_CONTROL = By.cssSelector("input[id=\"txtUserName\"]");
    public static final By LOGIN_BUTTON = By.cssSelector("button[id=\"btnLogin\"]");
    public static final By GOOGLELOGIN_BUTTON = By.cssSelector("button[id=\"btnGoogle\"]");
    public static final By GOOGLE_EMAIL = By.cssSelector("input[id=\"identifierId\"]");
    public static final By GOOGLE_EMAIL_NEXT = By.cssSelector("div[id=\"identifierNext\"]");
    public static final By GOOGLE_PASSWORD = By.cssSelector("input[type=\"password\"]");
    public static final By GOOGLE_PASSWORD_NEXT = By.cssSelector("div[id=\"passwordNext\"]");

}
