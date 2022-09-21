package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static constant.GuestConstant.*;
import static constant.MainConstant.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public MainPage(){
        methods = new Methods();
    }
    public void controlMainPage()throws InterruptedException{
        assertTrue(methods.isElementVisible(MYACCOUNT_CONTROL, 20));
        assertTrue(methods.isElementVisible(LOGO_CONTROL, 20));
        assertTrue(methods.isElementVisible(SEARCHTEXT_CONTROL, 20));
        Thread.sleep(2000);
    }
    public void searchBoxClick()throws InterruptedException{
        WebElement text = driver.findElement(SEARCHBOX);
        text.sendKeys(SEARCH_KEYWORD);
        System.out.println("Kelime girildi");
        methods.clickElement(SEARCHBOX_SEARCHBUTTON);
        Thread.sleep(2000);
    }
    public void controlSelectFilter()throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(2000);
        WebElement searchCheckbox=driver.findElement(SEARCH_Mark);
        searchCheckbox.click();
        Thread.sleep(2000);
        searchCheckbox.sendKeys(SEARCH_KEYWORD_MARK);
        Thread.sleep(2000);
        WebElement checkBox=driver.findElement(SEARCH_Mark_SELECT);
        actions.doubleClick(checkBox).perform();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(10000);
    }
}
