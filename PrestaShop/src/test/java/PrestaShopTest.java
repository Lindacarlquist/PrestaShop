import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class PrestaShopTest {


//    @BeforeClass
//    public static void startBrowser(){
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://demo.prestashop.com/#/en/front");
//    }

    @Test
    public void ChooseLanguage() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("http://demo.prestashop.com/#/en/front");
        driver.manage().window().maximize();
        driver.switchTo().frame("framelive");
        wait.until(visibilityOfElementLocated(By.id("_desktop_language_selector")));
        driver.findElement(By.cssSelector(".expand-more:nth-child(2)")).click();
        wait.until(visibilityOfElementLocated(By.cssSelector("li:nth-child(6) > .dropdown-item")));
        driver.findElement(By.cssSelector("li:nth-child(6) > .dropdown-item")).click();
        //driver.findElement(By.linkText("English")).click();
        //wait.until(visibilityOfElementLocated(By.id("_desktop_language_selector")));
        //driver.findElement(By.id("_desktop_language_selector")).click();
        //driver.findElement(By.xpath("//div[@id='_desktop_language_selector']/div/div/button/i")).click();
        //String name = driver. findElement(By.cssSelector("Language dropdown")).getText();
        //System.out.println(name);
        //Assert.assertEquals("Helen Leary", name);
        driver.close();
        driver.quit();
    }

    @Test
    public void addToCart() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("http://demo.prestashop.com/#/en/front");
        driver.manage().window().maximize();
        driver.switchTo().frame("framelive");
        driver.findElement(By.cssSelector(".product-miniature:nth-child(3) img")).click();
        driver.findElement(By.cssSelector(".add-to-cart")).click();
        //assert driver.findElement(By.cssSelector(".cart-products-count"));
        //String productCount = driver.findElement(By.cssSelector(".cart-products-count")).getText();
        //System.out.println(productCount);
        //boolean productInCart = false;
        //if (driver.findElement(By.cssSelector(".cart-products-count")).isDisplayed()) {
        //   productInCart = true;
        //}
        //assert productInCart = true;
        // Lägg till assert på cart-products-count
        driver.close();
        driver.quit();
    }

    @Test
    public void removeFromCart() { //Kan endast köras om det finns produkter i varukorgen, och de försvinner varje gång man öppnar webbläsaren på nytt
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("http://demo.prestashop.com/#/en/front");
        driver.manage().window().maximize();
        driver.switchTo().frame("framelive");
        driver.findElement(By.cssSelector(".header .hidden-sm-down")).click();
        driver.findElement(By.cssSelector(".remove-from-cart > .material-icons")).click();
        driver.close();
        driver.quit();
    }

    @Test
    public void addAndRemoveFromCart() { //Fungerar inte just nu
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("http://demo.prestashop.com/#/en/front");
        driver.manage().window().maximize();
        driver.switchTo().frame("framelive"); //väljer korrekt frame
        driver.findElement(By.cssSelector(".product-miniature:nth-child(3) img")).click(); //klickar på produkt
        driver.findElement(By.cssSelector(".add-to-cart")).click(); //lägger till i varukorgen
        //driver.findElement(By.cssSelector(".btn-secondary")).click(); // stänger ned varukorgen
        //driver.findElement(By.cssSelector(".header .hidden-sm-down")).click(); // klickar på varukorgen
        //driver.findElement(By.cssSelector(".remove-from-cart > .material-icons")).click(); //tar bort vara från varukorgen
        driver.close();
        driver.quit();
    }


    /**
     * Y¨'User Stor 1
     *
     */
    @Test
    public void us1(){

    }

    /**
     * Y¨'User Stor 2
     *
     */
    @Test
    public void us2(){

    }

}
