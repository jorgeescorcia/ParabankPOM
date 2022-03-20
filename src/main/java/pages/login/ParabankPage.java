package pages.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.basepage.BasePage;
import pages.log4j.Log4jValues;

public class ParabankPage extends BasePage {
    Logger logger = LogManager.getLogger(Log4jValues.class);
    //Input Home Login

    @FindBy (xpath = "//input[@name=\"username\"]")
    private WebElement username;
    @FindBy (xpath = "//input[@name=\"password\"]")
    private WebElement password;
    @FindBy (xpath = "//input[@class='button' and @value='Log In']")
    private WebElement btnLogin;

    @FindBy (xpath = "//h1[contains(text(),'Accounts Overview')]")
    private WebElement textValidateLogin;
    @FindBy (xpath = "//p[contains(text(),'Please enter a username and password.')]")
    private WebElement textValidateLoginFailed;

    //
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
    public void escribirInputsLoginFailed(){
        escribir(username,"");
        escribir(password,"123456");
    }

    public void clickLogIn(){
        clickElement(btnLogin);
    }
    public String validarLogin(){
        if (true){
            textFromElement(textValidateLogin);
            logger.info("Inicio de Sesion Valido");
        }
        return textFromElement(textValidateLogin);
    }
    public String validarLoginFailed(){
        if (true){
            textFromElement(textValidateLoginFailed);
            logger.info("Inicio de Sesion Invalido");

        }
        return textFromElement(textValidateLoginFailed);
    }




    }

