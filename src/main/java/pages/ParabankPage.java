package pages;

public class ParabankPage extends BasePage{
    //Input Home Login
    public String username = "//input[@name=\"username\"]";
    public String password = "//input[@name=\"password\"]";
    public String btnLogin ="//input[@class='button' and @value='Log In']";



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




    }

