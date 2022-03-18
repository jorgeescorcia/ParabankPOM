package pages;


import org.openqa.selenium.WebDriver;

public class ParabankPage extends BasePage{
    public ParabankPage() {
        super(driver);
    }



    public void navegar_a_parabank(){
        navegarAParabank("https://parabank.parasoft.com/parabank/index.htm");
    }
}
