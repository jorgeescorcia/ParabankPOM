package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //Una sola instancia del WebDriver compartida para todas las clases
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);


    }

    //Constructor para crear la instacia del driver una sola vez
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }


    public static void navegarAParabank(String url) {
        driver.get(url);
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
//Funcion click
    public void clickElement(String locator){
        Find(locator).click();
    }
    //Funcion Para Escrbir en los campos
    public void escribir(String locator, String texto){
        Find(locator).clear(); //Limpiar el campo de texto
        Find(locator).sendKeys(texto);
    }
    //
    public void cerrarNavegador(){

    }
}



