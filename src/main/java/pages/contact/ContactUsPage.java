package pages.contact;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.basepage.BasePage;

public class ContactUsPage extends BasePage {


    public ContactUsPage() {
        super(driver);
    }
    //Boton ContactUs
    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    private WebElement btnContactUs;
    //public String btnContactUs = "//a[contains(text(),'Contact Us')]";

    //Inputs ContactUs
    @FindBy(xpath = "//input[@id='name']")
    private WebElement name;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phone;
    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement message;
    @FindBy(xpath = "//input[@value='Send to Customer Care']")
    private WebElement btnEnviar;

    @FindBy(xpath = "//p[contains(text(),'A Customer Care Representative will be contacting ')]")
    private WebElement textValidateContactUs;

    @FindBy(xpath = "//span[contains(text(),'Email is required.')]")
    private WebElement textValidateFailedContactUs;

    ////span[@id='email.errors']



    public void navegar(){
        navegarAParabank("https://parabank.parasoft.com/parabank/index.htm");
    }
    public void click_boton_contactUs(){
        clickElement(btnContactUs);
    }

    public void escribirEnContactUs(){
        escribir(name,"Escorcia");
        escribir(email,"Escorcia@gmail.com");
        escribir(phone,"5485856");
        escribir(message,"Hola, esto es un mensaje de la prueba de automatizacion");
        clickElement(btnEnviar);
    }
    public String validateContactUs(){
        return textFromElement(textValidateContactUs);
    }

    public void escribirEnContactUsFailed(){
        escribir(name,"Escorcia");
        escribir(email,"");
        escribir(phone,"548585");
        escribir(message,"Hola, esto es un mensaje de la prueba de automatizacion");
        clickElement(btnEnviar);
    }
    public String validarContactFailed() {
        textFromElement(textValidateFailedContactUs);
        return textFromElement(textValidateFailedContactUs);

    }
}
