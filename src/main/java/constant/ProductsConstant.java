package constant;

import org.openqa.selenium.By;

public class ProductsConstant {
    public static final By PRODUCTS_ELEMENTS = By.cssSelector("li[type=\"comfort\"]");
    public static final By ADD_TO_CART = By.cssSelector("button[id=\"addToCart\"]");
    public static final By POPUP = By.xpath("//div[@data-test-class=\"modal_overflow\"]//div/div/h1/a");
    public static final By SHOPPING_CART = By.cssSelector("span[id=\"shoppingCart\"]");
    public static final By PRODUCT_INCREASE = By.cssSelector("a[aria-label=\"Ürünü Arttır\"]");
    public static final By SHOPPING_DONE_BUTTON = By.cssSelector("button[id=\"continue_step_btn\"]");
}
