package pages.basepage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
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
        PageFactory.initElements(driver,this);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }


    public static void navegarAParabank(String url) {
        driver.get(url);
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    //Metodo click
    public void clickElement(WebElement webElement){
        webElement.click();
    }

    //Metodo Para Escrbir en los campos
    public void escribir(WebElement webElement, String texto){
        webElement.clear(); //Limpiar el campo de texto
        webElement.sendKeys(texto);
    }
    //Metodo cerra navegador
    public void cerrarNavegador(){
        driver.quit();

    }

    //Metodo para validar
    public String textFromElement(WebElement webElement){
        return webElement.getText();
    }
}



