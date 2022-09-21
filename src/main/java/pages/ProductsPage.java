package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.Random;
import static constant.ProductsConstant.*;

public class ProductsPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public ProductsPage(){
        methods = new Methods();
    }
    public void controlSelectProducts()throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");

        List<WebElement> productElems = driver.findElements(PRODUCTS_ELEMENTS);
        int maxProducts = productElems.size();
        System.out.println(maxProducts);
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        productElems.get(randomProduct).click();
        Thread.sleep(10000);
    }
    public void controlAddToCart()throws InterruptedException{
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);}

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(5000);

        WebElement addToCart=driver.findElement(ADD_TO_CART);
        addToCart.click();
        System.out.println("Ürün sepete eklendi");
        Thread.sleep(10000);
    }
    public void controlShoppingCart()throws InterruptedException{
        WebElement closePopUp=driver.findElement(POPUP);
        closePopUp.click();
        Thread.sleep(2000);

        WebElement shoppingCart=driver.findElement(SHOPPING_CART);
        shoppingCart.click();
        Thread.sleep(2000);
    }
    public void controlProductIncrease()throws InterruptedException{
        WebElement shoppingCartPlus=driver.findElement(PRODUCT_INCREASE);
        shoppingCartPlus.click();
        Thread.sleep(3000);
    }
    public void controlShoppingDone()throws InterruptedException{
        WebElement shopping=driver.findElement(SHOPPING_DONE_BUTTON);
        shopping.click();
        System.out.println("Alışveriş tamamlandı");
        Thread.sleep(3000);
    }

}
