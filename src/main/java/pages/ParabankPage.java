package pages;

public class ParabankPage extends BasePage{
    //Input Home Login
    public String username = "//input[@name=\"username\"]";
    public String password = "//input[@name=\"password\"]";
    public String btnLogin ="//input[@class='button' and @value='Log In']";

    //Boton Register Home
    public String button_register = "//a[contains(text(),'Register')]";
    //input Pagina register
    public String input_firstName = "//input[@id='customer.firstName']";
    public String input_lastName = "//input[@id='customer.lastName']";
    public String input_Address = "//input[@id='customer.address.street']";
    public String input_City = "//input[@id='customer.address.city']";
    public String input_State = "//input[@id='customer.address.state']";
    public String input_ZipCode = "//input[@id='customer.address.zipCode']";
    public String input_Phone = "//input[@id='customer.phoneNumber']";
    public String input_SSN = "//input[@id='customer.ssn']";
    public String input_userName = "//input[@id='customer.username']";
    public String input_Password = "//input[@id='customer.password']";
    public String input_Confirm = "//input[@id='repeatedPassword']";
    public String btnRegister = "//tbody/tr[13]/td[2]/input[1]";


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


    //Register

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



    }

