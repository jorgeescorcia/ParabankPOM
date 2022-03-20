package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.login.ParabankPage;


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

        Assert.assertEquals("Accounts Overview", parabank.validarLogin());
        parabank.cerrarNavegador();


    }


    // Scenario 2

    @Given("que el usuario intenta loguearse")
    public void que_el_usuario_intenta_loguearse() {
        parabank.navegar_a_parabank();

    }
    @When("el usuario no ingresa un nombre de usuario")
    public void el_usuario_no_ingresa_un_nombre_de_usuario() {
        parabank.escribirInputsLoginFailed();
        parabank.clickLogIn();

    }
    @Then("el usuario no debe tener acceso a la pagina de inicio")
    public void el_usuario_no_debe_tener_acceso_a_la_pagina_de_inicio() {
        Assert.assertEquals("Please enter a username and password.",parabank.validarLoginFailed());
        parabank.cerrarNavegador();

    }
}
