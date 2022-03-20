package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.basepage.BasePage;

public class RegisterParabankPage extends BasePage {

    public RegisterParabankPage() {
        super(driver);
    }

    //Boton Register Home
    //public String button_register = "//a[contains(text(),'Register')]";
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement button_register;

    //input Pagina register
    @FindBy(xpath = "//input[@id='customer.firstName']")
    private WebElement input_firstName;
    @FindBy(xpath = "//input[@id='customer.lastName']")
    private WebElement input_lastName;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    private WebElement input_Address;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    private WebElement input_City;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    private WebElement input_State;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    private WebElement input_ZipCode;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    private WebElement input_Phone;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    private WebElement input_SSN;
    @FindBy(xpath = "//input[@id='customer.username']")
    private WebElement input_userName;
    @FindBy(xpath = "//input[@id='customer.password']")
    private WebElement input_Password;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    private WebElement input_Confirm;
    @FindBy(xpath = "//tbody/tr[13]/td[2]/input[1]")
    private WebElement btnRegister;
    @FindBy (xpath = "//p[contains(text(),'Your account was created successfully. You are now')]")
    private WebElement textValidateRegister;



    public void navegar(){
        navegarAParabank("https://parabank.parasoft.com/parabank/index.htm");
    }


    public void click_boton_register(){
        clickElement(button_register);
    }
    public void escribirEnInputsRegister(){
        escribir(input_firstName,"Jorge");
        escribir(input_lastName,"Escorcia");
        escribir(input_Address,"calle 20");
        escribir(input_City,"Planera Rica");
        escribir(input_State,"cordoba");
        escribir(input_ZipCode,"0001");
        escribir(input_Phone,"123456789");
        escribir(input_SSN,"4578452");
        escribir(input_userName,"jaescorcia");
        escribir(input_Password,"123456");
        escribir(input_Confirm,"123456");
        clickElement(btnRegister);

    }

    public String validateRegister(){
        return textFromElement(textValidateRegister);
    }
}


