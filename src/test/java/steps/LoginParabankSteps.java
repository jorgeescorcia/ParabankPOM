package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.ParabankPage;


public class LoginParabankSteps {
   ParabankPage parabank = new ParabankPage();

    @Given("que el usuario se encuentra en la pagina de inicio de sesion")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
    parabank.navegar_a_parabank();
    }
    @When("el usuario ingresa un nombre de usuario y una contrasena validos")
    public void elUsuarioIngresaUnNombreDeUsuarioYUnaContrasenaValidos() {
        parabank.escribirInputsLogin();
        parabank.clickLogIn();

    }
    @Then("el usuario debe tener acceso a la pagina de inicio")
    public void elUsuarioDebeTenerAccesoALaPaginaDeInicio() {
        // Write code here that turns the phrase above into concrete actions

    }

}
