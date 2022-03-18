package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //Una sola instancia del WebDriver compartida para todas las clases
    protected static WebDriver driver;
    private static  WebDriverWait wait;

    static{
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait =  new WebDriverWait(driver,10);


    }
//Constructor para crear la instacia del driver una sola vez
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait =  new WebDriverWait(driver,10);
    }

    public static void navegarAParabank(String url){
        driver.get(url);
    }
}
