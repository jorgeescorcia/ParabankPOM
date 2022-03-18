package pages;


public class ContactUsPage extends BasePage{


    public ContactUsPage() {
        super(driver);
    }
    //Boton ContactUs
    public String btnContactUs = "//a[contains(text(),'Contact Us')]";

    //Inputs ContactUs
    public String name ="//input[@id='name']";
    public String email ="//input[@id='email']";
    public String phone ="//input[@id='phone']";
    public String message = "//textarea[@id='message']";
    public String btnEnviar ="//input[@value='Send to Customer Care']";

    public void navegar(){
        navegarAParabank("https://parabank.parasoft.com/parabank/index.htm");
    }
    public void click_boton_contactUs(){
        clickElement(btnContactUs);
    }

    public void escribirEnContactUs(){
        escribir(name,"Escorcia");
        escribir(email,"Escorcia@gmail.com");
        escribir(phone,"548585");
        escribir(message,"Hola, esto es un mensaje de la prueba de automatizacion");
        clickElement(btnEnviar);
    }
}
