package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.basepage.BasePage;

public class ParabankPage extends BasePage {
    //Input Home Login

    @FindBy (xpath = "//input[@name=\"username\"]")
    private WebElement username;
    @FindBy (xpath = "//input[@name=\"password\"]")
    private WebElement password;
    @FindBy (xpath = "//input[@class='button' and @value='Log In']")
    private WebElement btnLogin;



    public ParabankPage() {
        super(driver);
    }

    public void navegar_a_parabank(){
        navegarAParabank("https://parabank.parasoft.com/parabank/index.htm");
    }
    //Metodos para manipular Login
    public void escribirInputsLogin(){
        escribir(username,"jaescorcia");
        escribir(password,"123456");
    }

    public void clickLogIn(){
        clickElement(btnLogin);
    }




    }

